package com.app.partner.plan.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListView;
import android.widget.Toast;

import com.app.partner.plan.Activities.MainActivity;
import com.app.partner.plan.Adapters.ListAdapterAdelantoSueldo;
import com.app.partner.plan.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class AdelantoSueldoFragment extends Fragment {

    public FloatingActionButton fabSolicitarAdelanto;

    private ListView listViewAdelantarSueldo;
    private ListAdapterAdelantoSueldo adapterAdelantoSueldo;

    public AdelantoSueldoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_adelanto_sueldo, container, false);

        obtenerViews(view);
        crearListView();
        accionFabSolicitarAdelanto();
        esconderFAB();
        return view;
    }

    private void accionFabSolicitarAdelanto() {
        fabSolicitarAdelanto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogSolicitarAdelantoSueldoFragment dialog = new DialogSolicitarAdelantoSueldoFragment();
                dialog.show(((MainActivity) getContext()).getSupportFragmentManager(), null);
//                Toast.makeText(getContext(), "Solicitar adelanto", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void crearListView() {
        adapterAdelantoSueldo = new ListAdapterAdelantoSueldo(getContext(), obtenerListString(), new ListAdapterAdelantoSueldo.OnClickListener() {
            @Override
            public void onEyeClick(String adelantoSueldo, int position) {
                DialogVerAdelantoSueldoFragment dialog = new DialogVerAdelantoSueldoFragment();
                dialog.show(((MainActivity) getContext()).getSupportFragmentManager(), null);
            }
        });

        listViewAdelantarSueldo.setAdapter(adapterAdelantoSueldo);
    }

    private void obtenerViews(View view) {
        listViewAdelantarSueldo = view.findViewById(R.id.listViewAdelantoSueldo);
        fabSolicitarAdelanto = view.findViewById(R.id.fabSolicitarAdelantoSueldo);
    }

    private void esconderFAB() {
        listViewAdelantarSueldo.setOnScrollListener(new AbsListView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(AbsListView view, int scrollState) {
            }

            @Override
            public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {
                int lastItem = firstVisibleItem + visibleItemCount;
                List<String> ls = obtenerListString();
                if (ls.size() > 0) {
                    if (visibleItemCount == totalItemCount) {
                        fabSolicitarAdelanto.show();
                    } else {
                        if (lastItem == totalItemCount) {
                            fabSolicitarAdelanto.hide();
                        } else {
                            fabSolicitarAdelanto.show();
                        }
                    }
                } else {
                    fabSolicitarAdelanto.hide();
                }
            }
        });
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
