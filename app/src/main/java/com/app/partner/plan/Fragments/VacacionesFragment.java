package com.app.partner.plan.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.Toast;

import com.app.partner.plan.Adapters.ListAdapterAdelantoSueldo;
import com.app.partner.plan.Adapters.ListAdapterVacaciones;
import com.app.partner.plan.Model.Vacaciones;
import com.app.partner.plan.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class VacacionesFragment extends Fragment {

    FloatingActionButton fabSolicitarAdelanto;

    ListView listViewVacacion;
    ListAdapterVacaciones adapterAdelantoSueldo;

    public VacacionesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_vacaciones, container, false);
        obtenerViews(view);
        crearListView();
        accionFabSolicitarVacacion();
        return view;
    }

    private void crearListView() {
        adapterAdelantoSueldo = new ListAdapterVacaciones(getContext(), obtenerListVacaciones(), new ListAdapterVacaciones.OnClickListener() {
            @Override
            public void onEyeClick(Vacaciones vacaciones, int position) {
                Toast.makeText(getContext(), "Ayy mi ojo", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onAirPlaneClick(Vacaciones vacaciones, int position) {
                Toast.makeText(getContext(), "Vuela vuela", Toast.LENGTH_SHORT).show();
            }
        });
        listViewVacacion.setAdapter(adapterAdelantoSueldo);
    }

    private void obtenerViews(View view) {
        listViewVacacion = view.findViewById(R.id.listViewVacacion);
        fabSolicitarAdelanto = view.findViewById(R.id.fabSolicitarAdelantoVacacion);
    }

    private void accionFabSolicitarVacacion() {
        fabSolicitarAdelanto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Solicitar adelanto", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private List<Vacaciones> obtenerListVacaciones(){
        List<Vacaciones> lsVacaciones = new ArrayList<>();
        lsVacaciones.add(new Vacaciones("Prueba A", 0));
        lsVacaciones.add(new Vacaciones("Prueba B", 1));
        lsVacaciones.add(new Vacaciones("Prueba C", 0));
        lsVacaciones.add(new Vacaciones("Prueba D", 1));
        lsVacaciones.add(new Vacaciones("Prueba E", 0));
        lsVacaciones.add(new Vacaciones("Prueba F", 0));

        return lsVacaciones;
    }
}