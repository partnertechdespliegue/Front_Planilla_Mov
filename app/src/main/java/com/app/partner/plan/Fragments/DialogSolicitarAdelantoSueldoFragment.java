package com.app.partner.plan.Fragments;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.app.partner.plan.R;

import java.util.ArrayList;
import java.util.List;

public class DialogSolicitarAdelantoSueldoFragment extends DialogFragment {

    Activity activity;
    EditText etCuotas;
    Spinner spMesSolicitud, spAnoSolicitud, spMesRecepcion, spAnoRecepcion, spTipoAdelanto;
    Button btnCancelar, btnSolicitar;

    public DialogSolicitarAdelantoSueldoFragment() {
        // Required empty public constructor
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

        ArrayAdapter<String> adapterMesRecepcion = new ArrayAdapter<>(getContext(), android.R.layout.simple_spinner_item, obtenerMeses());
        adapterMesRecepcion.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spMesRecepcion.setAdapter(adapterMesRecepcion);

        ArrayAdapter<String> adapterAnoRecepcion = new ArrayAdapter<>(getContext(), android.R.layout.simple_spinner_item, obtenerAños());
        adapterAnoRecepcion.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spAnoRecepcion.setAdapter(adapterAnoRecepcion);
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
                Toast.makeText(getContext(), "Adelanto de sueldo solicitado", Toast.LENGTH_SHORT).show();
                dismiss();
            }
        });
    }

    private void obtenerViews(View view) {
        btnCancelar = view.findViewById(R.id.buttonCancelarSoliAdelantoSueldo);
        btnSolicitar = view.findViewById(R.id.buttonSolicitarSoliAdelantoSueldo);
        spMesSolicitud = view.findViewById(R.id.spinnerMesSolicitarSoliAdelantoSueldo);
        spAnoSolicitud = view.findViewById(R.id.spinnerAnoSolicitarSoliAdelantoSueldo);
        spMesRecepcion = view.findViewById(R.id.spinnerMesRecepcionSoliAdelantoSueldo);
        spAnoRecepcion = view.findViewById(R.id.spinnerAnoRecepcionSoliAdelantoSueldo);
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

}
