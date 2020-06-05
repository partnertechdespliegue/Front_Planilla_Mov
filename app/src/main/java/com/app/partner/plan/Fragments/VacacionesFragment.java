package com.app.partner.plan.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.app.partner.plan.Activities.MainActivity;
import com.app.partner.plan.Adapters.ListAdapterAdelantoSueldo;
import com.app.partner.plan.Adapters.ListAdapterVacaciones;
import com.app.partner.plan.Model.Request.Contrato;
import com.app.partner.plan.Model.Request.MODEL.TrabajadorModel;
import com.app.partner.plan.Model.Request.Trabajador;
import com.app.partner.plan.Model.Request.Vacaciones;
import com.app.partner.plan.Model.Response.ResponseVacaciones;
import com.app.partner.plan.R;
import com.app.partner.plan.Services.Instance.IBoletas;
import com.app.partner.plan.Services.Instance.IVacaciones;
import com.app.partner.plan.Services.Service.VacacionesInterface;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class VacacionesFragment extends Fragment implements View.OnClickListener {

    FloatingActionButton fabSolicitarAdelanto;

    ImageView verVacacion;

    public List<TrabajadorModel> trabajadorModels;

    public List<Vacaciones> listvacaciones;

    private IVacaciones iVacaciones;

    private VacacionesInterface vacacionesInterface;

    FragmentVacacionesListener listener;

    ListView listViewVacacion;

    ListAdapterVacaciones listAdapterVacaciones;

    public VacacionesFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_vacaciones, container, false);
        //View v = inflater.inflate(R.layout.fragment_dialog_ver_vacaciones, container, false);

        obtenerViews(view);
        retrofitInit();
        listarVacaciones();

        crearListView();
        accionFabSolicitarVacacion();
        esconderFAB();
        return view;
    }

   private void esconderFAB() {
        listViewVacacion.setOnScrollListener(new AbsListView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(AbsListView view, int scrollState) {
            }
            @Override
            public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {
                int lastItem = firstVisibleItem + visibleItemCount;
                List<Vacaciones> ls = listvacaciones;
                if ( ls.size() > 0) {
                    if (visibleItemCount == totalItemCount){
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

    private void obtenerViews(View view) {
        listViewVacacion = view.findViewById(R.id.listViewVacacion);
        fabSolicitarAdelanto = view.findViewById(R.id.fabSolicitarAdelantoVacacion);
        verVacacion = (ImageView) view.findViewById(R.id.imageViewTomarVacacion);
    }

    private void accionFabSolicitarVacacion() {
        fabSolicitarAdelanto.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    fragmentDialogAdelantoVacaciones dialog = new fragmentDialogAdelantoVacaciones();
                    dialog.show(((MainActivity) getContext()).getSupportFragmentManager(), null);
                }
            });
    }

    private void accionFabVerVacacion() {
                fragment_dialog_ver_vacaciones dialog = new fragment_dialog_ver_vacaciones();
                dialog.show(((MainActivity) getContext()).getSupportFragmentManager(), null);

    }


    public void listarVacaciones() {
        listvacaciones = new ArrayList<>();
        TrabajadorModel t = new TrabajadorModel(1);

        Call<ResponseVacaciones> call = vacacionesInterface.listarPorTrabajador(t);

        call.enqueue(new Callback<ResponseVacaciones>() {
            @Override
            public void onResponse(Call<ResponseVacaciones> call, Response<ResponseVacaciones> response) {
                System.out.println("RESPONSE: "+response);
                if (response.isSuccessful()) {
                    System.out.println(response.isSuccessful());
                    listvacaciones = response.body().getAaData();
                    listAdapterVacaciones = new ListAdapterVacaciones(getContext(),listvacaciones);
                    listViewVacacion.setAdapter(listAdapterVacaciones);
                    crearListView();
                }
            }
            @Override
            public void onFailure(Call<ResponseVacaciones> call, Throwable t) {
                System.out.println("Error"+ t);
            }
        });
    }

    private void crearListView() {
        listAdapterVacaciones = new ListAdapterVacaciones(getContext(), listvacaciones, new ListAdapterVacaciones.OnClickListener() {
            @Override
            public void onEyeClick(Vacaciones vacaciones, int position) {
                accionFabVerVacacion();
            }

            @Override
            public void onAirPlaneClick(Vacaciones vacaciones, int position) {
              //  accionFabSolicitarVacacion() ;
                // Toast.makeText(getContext(), "Vuela vuela", Toast.LENGTH_SHORT).show();
            }
        });
        listViewVacacion.setAdapter(listAdapterVacaciones);
    }


    private void retrofitInit() {
        iVacaciones = IVacaciones.getInstance();
        vacacionesInterface = iVacaciones.getVacacionesInterface();
    }


    @Override
    public void onClick(View view) {
        listener.enviarVacacion(trabajadorModels);
    }

    public static interface FragmentVacacionesListener {
        void enviarVacacion(List<TrabajadorModel> listTrabajador);
    }

}
