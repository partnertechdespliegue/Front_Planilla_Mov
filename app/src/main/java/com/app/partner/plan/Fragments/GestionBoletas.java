package com.app.partner.plan.Fragments;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

import com.app.partner.plan.Activities.MainActivity;
import com.app.partner.plan.Adapters.ListAdapterBoletas;
import com.app.partner.plan.Model.Request.Contrato;
import com.app.partner.plan.Model.Request.PlanillaHistorico;
import com.app.partner.plan.Model.Request.Trabajador;
import com.app.partner.plan.Model.Response.ResponseBoletas;
import com.app.partner.plan.R;
import com.app.partner.plan.Services.Instance.IBoletas;
import com.app.partner.plan.Services.Service.BoletaInterface;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class GestionBoletas extends Fragment implements View.OnClickListener{

    public List<Trabajador> listTrabajador;
    public List<PlanillaHistorico> listPlanillaH;

    private IBoletas iBoletas;
    private BoletaInterface boletaInterface;

    FragmentBoletasListener listener;

    private ListView listViewBoletas;
    private ListAdapterBoletas adapterBoletas;

    public GestionBoletas() {
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof FragmentBoletasListener) {
            this.listener = (FragmentBoletasListener) context;
        }
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_gestion_boletas, container, false);

        obtenerViews(view);
        retrofitInit();
        listarBoletas();
        crearListView();
        return view;
    }


    private void obtenerViews(View view) {
        listViewBoletas = view.findViewById(R.id.ListViewBoletas);
    }


    public void listarBoletas() {
        listPlanillaH = new ArrayList<>();
        Contrato n = new Contrato(1);
        Trabajador t = new Trabajador(n);
        Call<ResponseBoletas> call = boletaInterface.listarBoletas(t);
        call.enqueue(new Callback<ResponseBoletas>() {
            @Override
            public void onResponse(Call<ResponseBoletas> call, Response<ResponseBoletas> response) {
                if (response.isSuccessful()) {
                    listPlanillaH = response.body().getAaData();
                    adapterBoletas = new ListAdapterBoletas(getContext(),listPlanillaH);
                    listViewBoletas.setAdapter(adapterBoletas);
                    crearListView();
                }
            }
            @Override
            public void onFailure(Call<ResponseBoletas> call, Throwable t) {
                System.out.println("Error"+ t);
            }
        });
    }



    private void crearListView( ) {
        System.out.println(listPlanillaH.size());
        adapterBoletas = new ListAdapterBoletas(getContext(), listPlanillaH, new ListAdapterBoletas.OnClickListener() {
            @Override
            public void onDownland(PlanillaHistorico planillaHistorico, int position) {
                Toast.makeText(getContext(), "downland", Toast.LENGTH_SHORT).show();
            }
        });
        listViewBoletas.setAdapter(adapterBoletas);
    }


    private void retrofitInit() {
        iBoletas = IBoletas.getInstance();
        boletaInterface = iBoletas.getTiendaService();
    }


    @Override
    public void onClick(View view) {
        listener.enviarBoletas(listTrabajador);
    }


    public static interface FragmentBoletasListener {
        void enviarBoletas(List<Trabajador> listTrabajador);
    }



}
