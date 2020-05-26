package com.app.partner.plan.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;

import com.app.partner.plan.Model.Request.Trabajador;
import com.app.partner.plan.Model.Response.ResponseBoletas;
import com.app.partner.plan.R;
import com.app.partner.plan.Services.Service.BoletaInterface;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class GestionBoletas extends Fragment {

    ListView lv;
    SearchView searchView;
    ArrayAdapter<String> adapter;

    public List<Trabajador> listTrabajador;
    private BoletaInterface boletaInterface;
    private Trabajador trabajador;

    String[] data = {"fecha","fecha","fecha","fecha","fecha","fecha","fecha","fecha","fecha"};


    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;

    public GestionBoletas() {
    }

    public static GestionBoletas newInstance(String param1, String param2) {
        GestionBoletas fragment = new GestionBoletas();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_gestion_boletas, container, false);
        lv =   (ListView) view.findViewById(R.id.ListViewBoletas);
        adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, data);
        lv.setAdapter(adapter);

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




}
