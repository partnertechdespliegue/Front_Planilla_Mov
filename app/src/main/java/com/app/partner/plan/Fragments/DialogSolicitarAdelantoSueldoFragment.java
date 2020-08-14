package com.app.partner.plan.Fragments;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.app.partner.plan.Model.Request.DTO.AdelantoSueldoDTO;
import com.app.partner.plan.Model.Request.MODEL.AdelantoSueldoMODEL;
import com.app.partner.plan.Model.Request.MODEL.CuotaAdelantoMODEL;
import com.app.partner.plan.Model.Request.MODEL.EmpresaMODEL;
import com.app.partner.plan.Model.Request.MODEL.PdoAnoMODEL;
import com.app.partner.plan.Model.Request.MODEL.PdoMesMODEL;
import com.app.partner.plan.Model.Request.MODEL.TrabajadorMODEL;
import com.app.partner.plan.Model.Response.ResponseRegisSolicitud;
import com.app.partner.plan.R;
import com.app.partner.plan.Services.Instance.IAdelantoS;
import com.app.partner.plan.Services.Service.IAdelantoSInterface;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class DialogSolicitarAdelantoSueldoFragment extends DialogFragment {

    Activity activity;
    EditText etCuotas;
    Spinner spMesSolicitud, spAnoSolicitud, spTipoAdelanto;
    Button btnCancelar, btnSolicitar;

    private IAdelantoSInterface iAdelantoSInterface;
    public List<AdelantoSueldoMODEL> listadelantoSueldoDTO;
    private IAdelantoS iAdelantoS;

    public DialogSolicitarAdelantoSueldoFragment() {
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        if (context instanceof Activity) {
            this.activity = (Activity) context;
        }
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        return crearDialog();
    }

    private Dialog crearDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        View view = getActivity().getLayoutInflater().inflate(R.layout.fragment_dialog_solicitar_adelanto_sueldo, null);
        builder.setView(view);
        retrofitInit();
        obtenerViews(view);
        eventoViews();

        return builder.create();
    }

    private void eventoViews() {
        eventoButton();
        eventoSpinner();
    }

    private void eventoSpinner() {

        ArrayAdapter<String> adapterMesSolicitud = new ArrayAdapter<>(getContext(), android.R.layout.simple_spinner_item, obtenerMeses());
        adapterMesSolicitud.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spMesSolicitud.setAdapter(adapterMesSolicitud);

        ArrayAdapter<String> adapterAnoSolicitud = new ArrayAdapter<>(getContext(), android.R.layout.simple_spinner_item, obtenerAños());
        adapterAnoSolicitud.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spAnoSolicitud.setAdapter(adapterAnoSolicitud);

        ArrayAdapter<String> adapterTipoAdelanto = new ArrayAdapter<>(getContext(), android.R.layout.simple_spinner_item, obtenerTipoAdelanto());
        adapterTipoAdelanto.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spTipoAdelanto.setAdapter(adapterTipoAdelanto);

    }

    private void eventoButton() {
        btnCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss();
            }
        });
        btnSolicitar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                registrarAdelanto();
                Toast.makeText(getContext(), "Adelanto de sueldo solicitado", Toast.LENGTH_SHORT).show();
                dismiss();
            }
        });
    }

    public void registrarAdelanto(){
        listadelantoSueldoDTO = new ArrayList<>();

        TrabajadorMODEL trabajadorMODEL = new TrabajadorMODEL(1);
        AdelantoSueldoMODEL adelantoSueldoMODEL = new AdelantoSueldoMODEL(1,1,2,2,"2020-06-19",trabajadorMODEL);
        CuotaAdelantoMODEL cuotaAdelantoMODEL = new CuotaAdelantoMODEL(1);
        PdoAnoMODEL pdoAnoMODEL = new PdoAnoMODEL(10);
        PdoMesMODEL pdoMesMODEL = new PdoMesMODEL(1);
        EmpresaMODEL empresaMODEL = new EmpresaMODEL(1);

        AdelantoSueldoDTO a = new AdelantoSueldoDTO(trabajadorMODEL,adelantoSueldoMODEL,cuotaAdelantoMODEL,pdoAnoMODEL,pdoMesMODEL,empresaMODEL);
        System.out.println("trbajador "+a);

        Call<ResponseRegisSolicitud> call = iAdelantoSInterface.registrarSolicitud(a);
        call.enqueue(new Callback<ResponseRegisSolicitud>() {
            @Override
            public void onResponse(Call<ResponseRegisSolicitud> call, Response<ResponseRegisSolicitud> response) {
                if (response.isSuccessful()) {
                    listadelantoSueldoDTO = response.body().getDefaultObj();
                    System.out.println("RESPONSEEEEEEEEEEEEEEEEEEEEEEEEEEEEE"+response);
                }
            }
            @Override
            public void onFailure(Call<ResponseRegisSolicitud> call, Throwable t) {
                System.out.println("Error: "+ t);
            }
        });

    }

    private void obtenerViews(View view) {
        btnCancelar = view.findViewById(R.id.buttonCancelarSoliAdelantoSueldo);
        btnSolicitar = view.findViewById(R.id.buttonSolicitarSoliAdelantoSueldo);
        spMesSolicitud = view.findViewById(R.id.spinnerMesSolicitarSoliAdelantoSueldo);
        spAnoSolicitud = view.findViewById(R.id.spinnerAnoSolicitarSoliAdelantoSueldo);
        spTipoAdelanto = view.findViewById(R.id.spinnerTipoSoliAdelantoSueldo);
        etCuotas = view.findViewById(R.id.editTextCuotaSoliAdelantoSueldo);
    }

    private List<String> obtenerMeses(){
        List<String> lsmeses = new ArrayList<>();
        lsmeses.add("Enero");
        lsmeses.add("Febrero");
        lsmeses.add("Marzo");
        lsmeses.add("Abril");
        lsmeses.add("Mayo");
        lsmeses.add("Junio");
        lsmeses.add("Julio");
        lsmeses.add("Agosto");
        lsmeses.add("Septiembre");
        lsmeses.add("Octubre");
        lsmeses.add("Noviembre");
        lsmeses.add("Diciembre");
        return lsmeses;
    }

    private List<String> obtenerAños(){
        List<String> lsanos = new ArrayList<>();
        lsanos.add("2015");
        lsanos.add("2016");
        lsanos.add("2017");
        lsanos.add("2018");
        lsanos.add("2019");
        lsanos.add("2020");
        lsanos.add("2021");
        lsanos.add("2022");
        lsanos.add("2023");
        return lsanos;
    }

    private List<String> obtenerTipoAdelanto(){
        List<String> lstipoAdelanto = new ArrayList<>();
        lstipoAdelanto.add("Proporcional");
        lstipoAdelanto.add("Emergencia");
        return lstipoAdelanto;
    }


    private void retrofitInit() {
        iAdelantoS = IAdelantoS.getInstance();
        iAdelantoSInterface = iAdelantoS.getiAdelantoSInterface();
    }
}
