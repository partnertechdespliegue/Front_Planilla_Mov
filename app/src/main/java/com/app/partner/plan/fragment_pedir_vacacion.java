package com.app.partner.plan;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class fragment_pedir_vacacion extends Fragment {


    public fragment_pedir_vacacion() {
        // Required empty public constructor
    }
    public static fragment_pedir_vacacion newInstance(String param1, String param2) {
        fragment_pedir_vacacion fragment = new fragment_pedir_vacacion();
        Bundle args = new Bundle();

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_pedir_vacacion, container, false);
    }
}
