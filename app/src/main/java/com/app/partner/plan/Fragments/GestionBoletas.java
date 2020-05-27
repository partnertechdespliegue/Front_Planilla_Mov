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
import android.widget.ListView;
import android.widget.SearchView;

import com.app.partner.plan.Activities.MainActivity;
import com.app.partner.plan.Model.Request.Trabajador;
import com.app.partner.plan.Model.Response.ResponseBoletas;
import com.app.partner.plan.R;
import com.app.partner.plan.Services.Instance.IBoletas;
import com.app.partner.plan.Services.Service.BoletaInterface;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class GestionBoletas extends Fragment implements View.OnClickListener{

    private ListView lv;
    ArrayAdapter<String> adapter;

    public List<Trabajador> listTrabajador;
    private Trabajador trabajador;

    private IBoletas iBoletas;
    private BoletaInterface boletaInterface;

    FragmentBoletasListener listener;

    private RecyclerView.LayoutManager layoutManagerBoletas;
    private RecyclerView.Adapter adapterBoletas;



    String[] data = {"fecha","fecha","fecha","fecha","fecha","fecha","fecha","fecha","fecha"};


    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;

    public GestionBoletas() {
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof FragmentBoletasListener) {
            this.listener = (FragmentBoletasListener) context;
        }
    }
/*
    public static GestionBoletas newInstance(String param1, String param2) {
        yGestionBoletas fragment = new GestionBoletas();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }
*/
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       /* if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }*/
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_gestion_boletas, container, false);
        lv =   (ListView) view.findViewById(R.id.ListViewBoletas);
        adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, data);
        lv.setAdapter(adapter);

        retrofitInit();
        listarBoletas();

        return view;
    }


    public void listarBoletas() {

        listTrabajador = new ArrayList<>();
        Call<ResponseBoletas> call = boletaInterface.listarBoletas(trabajador);
        ResponseBoletas p=new ResponseBoletas();
        call.enqueue(new Callback<ResponseBoletas>() {
            @Override
            public void onResponse(Call<ResponseBoletas> call, Response<ResponseBoletas> response) {
                System.out.println("RESPONSE: "+response);
                if (response.isSuccessful()) {
                        System.out.println("holissssssss");
                }
            }
            @Override
            public void onFailure(Call<ResponseBoletas> call, Throwable t) {

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

  /*  public void createRecycler() {
        layoutManagerBoletas = new LinearLayoutManager(getContext());
        adapterBoletas = new layoutManagerBoletas(listTrabajador, new layoutManagerBoletas.OnItemClickListener() {
            @Override
            public void onItemClick(Trabajador trabajador, int position) {
            }
            @Override
            public void onAgregarClick(Trabajador trabajador, int position) {
                if (trabajador.getProducto().getIcantidad() == 0){
                    trabajador.getProducto().setIcantidad(1);
                }
                agregarProducto(tiendaProducto);
            }
        });
        recyclerViewProduto.setLayoutManager(layoutManagerProducto);
        recyclerViewProduto.setAdapter(adapterProducto);
    }
*/

    public static interface FragmentBoletasListener {
        void enviarBoletas(List<Trabajador> listTrabajador);
        //List<Tienda_Producto> getProdProductos();


    }

}
