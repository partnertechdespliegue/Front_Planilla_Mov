package com.app.partner.plan.Fragments;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.app.partner.plan.R;

public class AjusteCuentaFragment extends Fragment {
    private EditText editNombre, editApellido, editCorreo;
    Activity activity;

    public AjusteCuentaFragment() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        if (context instanceof Activity) {
            this.activity = (Activity) context;
        }
    }



    private void obtenerViews(){
      //  editNombre =
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = getActivity().getLayoutInflater().inflate(R.layout.fragment_ajuste_cuenta, null);

        obtenerViews();
        return inflater.inflate(R.layout.fragment_ajuste_cuenta, container, false);
    }
}
