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

    ArrayAdapter<String> adapter;

    public List<Trabajador> listTrabajador;
    public List<PlanillaHistorico> listPlanillaH;
    private Trabajador trabajador;

    private IBoletas iBoletas;
    private BoletaInterface boletaInterface;

    FragmentBoletasListener listener;

    private RecyclerView.LayoutManager layoutManagerBoletas;

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
        //crearListView();
        retrofitInit();
        listarBoletas();

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
        ResponseBoletas p=new ResponseBoletas();
        call.enqueue(new Callback<ResponseBoletas>() {
            @Override
            public void onResponse(Call<ResponseBoletas> call, Response<ResponseBoletas> response) {
                    System.out.println("RESPONSE: "+response);
                if (response.isSuccessful()) {
                    System.out.println(response.isSuccessful());

                    listPlanillaH = response.body().getAaData();
                    /*for(PlanillaHistorico p : listPlanillaH ){

                    }*/
                    adapterBoletas = new ListAdapterBoletas(getContext(), listPlanillaH);
                    listViewBoletas.setAdapter(adapterBoletas);

                }
            }
            @Override
            public void onFailure(Call<ResponseBoletas> call, Throwable t) {
                System.out.println("Error"+ t);
            }
        });
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
        //List<Tienda_Producto> getProdProductos();

    }


    private List<String> obtenerListString() {
        List<String> lsString = new ArrayList<>();
        lsString.add("Prueba 1");
        lsString.add("Prueba 2");
        lsString.add("Prueba 3");
        lsString.add("Prueba 4");
        lsString.add("Prueba 5");
        lsString.add("Prueba 6");
        lsString.add("Prueba 1");
        lsString.add("Prueba 2");
        lsString.add("Prueba 3");
        lsString.add("Prueba 4");
        lsString.add("Prueba 5");
        lsString.add("Prueba 6");
        lsString.add("Prueba 1");
        lsString.add("Prueba 2");
        lsString.add("Prueba 3");
        lsString.add("Prueba 4");
        lsString.add("Prueba 5");
        lsString.add("Prueba 6");
        return lsString;
    }
}
