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
import android.widget.Button;
import android.widget.ListView;

import com.app.partner.plan.Adapters.ListAdapterCuotaAdelantoSueldo;
import com.app.partner.plan.R;

import java.util.ArrayList;
import java.util.List;

public class DialogVerAdelantoSueldoFragment extends DialogFragment {

    private int layoutStyle;

    Activity activity;

    ListView lvVerAdeSueldo;
    ListAdapterCuotaAdelantoSueldo adapterCuota;
    Button btnCancelar;

    public DialogVerAdelantoSueldoFragment() {
    }

    public DialogVerAdelantoSueldoFragment(int layoutStyle){
        this.layoutStyle = layoutStyle;
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

    private AlertDialog crearDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        View view = getActivity().getLayoutInflater().inflate(R.layout.fragment_dialog_ver_adelanto_sueldo, null);
        builder.setView(view);
        obtenerViews(view);
        return builder.create();
    }


    private void obtenerViews(View view) {
        lvVerAdeSueldo = view.findViewById(R.id.listViewVerAdelantoSueldo);
        btnCancelar = view.findViewById(R.id.buttonCancelarVerAdelantoSueldo);
        btnCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss();
            }
        });
    }


}
