package com.app.partner.plan.Fragments;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.airbnb.lottie.LottieAnimationView;
import com.app.partner.plan.Adapters.ListAdapterBoletas;
import com.app.partner.plan.Model.Request.DTO.PlanillaHistoricoDTO;
import com.app.partner.plan.Model.Request.DTO.TrabajadorDTO;
import com.app.partner.plan.Model.Request.MODEL.ContratoMODEL;
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

    public List<TrabajadorDTO> listTrabajador;
    public List<PlanillaHistoricoDTO> listPlanillaH;

    private IBoletas iBoletas;
    private BoletaInterface boletaInterface;

    LottieAnimationView vacin;
    TextView texton;

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
        validacionBoleta();
        validacion();
        return view;
    }


    private void obtenerViews(View view) {
        listViewBoletas = view.findViewById(R.id.ListViewBoletas);
        vacin = view.findViewById(R.id.lottieVacin);
        texton = view.findViewById(R.id.texton);
    }


    public void listarBoletas() {
        listPlanillaH = new ArrayList<>();
        ContratoMODEL n = new ContratoMODEL(1);
        TrabajadorDTO t = new TrabajadorDTO(n);
        Call<ResponseBoletas> call = boletaInterface.listarBoletas(t);
        call.enqueue(new Callback<ResponseBoletas>() {
            @Override
            public void onResponse(Call<ResponseBoletas> call, Response<ResponseBoletas> response) {
                if (response.isSuccessful()) {
                    listPlanillaH = response.body().getAaData();
                    System.out.println("tamaño"+listPlanillaH.size());
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

    private void validacion(){
        if(listPlanillaH.size()==0){
            System.out.println("ls");
            vacin.setVisibility(View.VISIBLE);
            texton.setText("No hay boletas para mostrar");
        }
    }

    private void validacionBoleta(){
        if(listPlanillaH==null){
            Toast.makeText(getContext(), "downland", Toast.LENGTH_SHORT).show();
        }
    }


    private void crearListView( ) {
        System.out.println("lista"+listPlanillaH.size());
        adapterBoletas = new ListAdapterBoletas(getContext(), listPlanillaH, new ListAdapterBoletas.OnClickListener() {
            @Override
            public void onDownland(PlanillaHistoricoDTO planillaHistorico, int position) {
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
        void enviarBoletas(List<TrabajadorDTO> listTrabajador);
    }



}
