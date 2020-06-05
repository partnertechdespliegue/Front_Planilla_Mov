package com.app.partner.plan.Fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import com.app.partner.plan.Activities.MainActivity;
import com.app.partner.plan.Adapters.ListAdapterAdelantoSueldo;
import com.app.partner.plan.Adapters.ListAdapterBoletas;
import com.app.partner.plan.Model.Request.AdelantoSueldo;
import com.app.partner.plan.Model.Request.MODEL.TrabajadorModel;
import com.app.partner.plan.Model.Response.ResponseAdelantoS;
import com.app.partner.plan.R;
import com.app.partner.plan.Services.Instance.IAdelantoS;
import com.app.partner.plan.Services.Service.IAdelantoSInterface;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class AdelantoSueldoFragment extends Fragment implements View.OnClickListener {

    public FloatingActionButton fabSolicitarAdelanto;

    public ImageView imageViewVerAdelantoSueldo;

    public List<TrabajadorModel> trabajadorModels;

    public List<AdelantoSueldo> listadelantoSueldos;

    private IAdelantoS iAdelantoS;

    private IAdelantoSInterface iAdelantoSInterface;

    FragmentAdelantoListener listener;

    private ListView listViewAdelantarSueldo;

    private ListAdapterAdelantoSueldo adapterAdelantoSueldo;


    public AdelantoSueldoFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_adelanto_sueldo, container, false);

        obtenerViews(view);
        retrofitInit();
        listarAdelanto();
        crearListView();
        accionFabSolicitarAdelanto();


//        accionFabVerAdelanto();
        return view;
    }

    private void accionFabSolicitarAdelanto() {
        fabSolicitarAdelanto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogSolicitarAdelantoSueldoFragment dialog = new DialogSolicitarAdelantoSueldoFragment();
                dialog.show(((MainActivity) getContext()).getSupportFragmentManager(), null);
                Toast.makeText(getContext(), "Solicitar adelanto", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void accionFabVerAdelanto() {

        //Animation animation = AnimationUtils.loadAnimation(this,R.anim.mostrar);

        imageViewVerAdelantoSueldo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogVerAdelantoSueldoFragment dialog = new DialogVerAdelantoSueldoFragment();
                dialog.show(((MainActivity) getContext()).getSupportFragmentManager(), null);
                Toast.makeText(getContext(), "Solicitar adelanto", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void obtenerViews(View view) {
        listViewAdelantarSueldo = view.findViewById(R.id.listViewAdelantoSueldo);
        fabSolicitarAdelanto = view.findViewById(R.id.fabSolicitarAdelantoSueldo);
        imageViewVerAdelantoSueldo = view.findViewById(R.id.imageViewVerAdelantoSueldo);
    }

    public void listarAdelanto() {
        listadelantoSueldos = new ArrayList<>();
        TrabajadorModel t = new TrabajadorModel(1);

        Call<ResponseAdelantoS> call = iAdelantoSInterface.listarAdeSueldo(t);

        call.enqueue(new Callback<ResponseAdelantoS>() {
            @Override
            public void onResponse(Call<ResponseAdelantoS> call, Response<ResponseAdelantoS> response) {
                if (response.isSuccessful()) {
                    listadelantoSueldos = response.body().getAaData();
                    System.out.println("RESPONSEEEEEEEEEEEEEEEEEEEEEEEEEEEEE"+response);
                    adapterAdelantoSueldo = new ListAdapterAdelantoSueldo(getContext(),listadelantoSueldos);
                    listViewAdelantarSueldo.setAdapter(adapterAdelantoSueldo);
                    crearListView();
                }
            }
            @Override
            public void onFailure(Call<ResponseAdelantoS> call, Throwable t) {
                System.out.println("Error"+ t);
            }
        });
    }



    private void crearListView() {
        adapterAdelantoSueldo = new ListAdapterAdelantoSueldo(getContext(), listadelantoSueldos, new ListAdapterAdelantoSueldo.OnClickListener() {
            @Override
            public void onEyeClick(AdelantoSueldo adelantoSueldo, int position) {

               // accionFabVerAdelanto();
                Toast.makeText(getContext(), "ojo", Toast.LENGTH_SHORT).show();
            }
        });
        listViewAdelantarSueldo.setAdapter(adapterAdelantoSueldo);
    }


    private void retrofitInit() {
        iAdelantoS = IAdelantoS.getInstance();
        iAdelantoSInterface = iAdelantoS.getiAdelantoSInterface();
    }

    @Override
    public void onClick(View view) {
        listener.enviarBoletas(trabajadorModels);
    }

    public static interface FragmentAdelantoListener {
        void enviarBoletas(List<TrabajadorModel> listTrabajador);
    }


}
