package com.app.partner.plan.Fragments;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.DatePickerDialog;
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
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

import com.app.partner.plan.Adapters.ListAdapterCuotaAdelantoSueldo;
import com.app.partner.plan.R;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class DialogVerAdelantoSueldoFragment extends DialogFragment {


    Activity activity;
    Button btnCancelar;


    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        if (context instanceof Activity) {
            this.activity = (Activity) context;
        }
    }


    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        return crearDialog();
    }


    private AlertDialog crearDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        View view = getActivity().getLayoutInflater().inflate(R.layout.fragment_dialog_ver_adelanto_sueldo, null);
        builder.setView(view);
        obtenerViews(view);
        eventoViews();
        return builder.create();

    }


    private void eventoViews() {
        eventoButton();
    }


    private void obtenerViews(View view) {
        btnCancelar = view.findViewById(R.id.btnCerrarVerAS);

    }

    private void eventoButton() {
        btnCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss();
            }
        });



    }


}
