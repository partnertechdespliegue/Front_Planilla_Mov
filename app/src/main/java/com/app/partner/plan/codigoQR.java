package com.app.partner.plan;

import android.app.AlertDialog;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.zxing.Result;

import me.dm7.barcodescanner.zxing.ZXingScannerView;


public class codigoQR extends Fragment implements ZXingScannerView.ResultHandler{


    private ZXingScannerView myScannerView;

    public codigoQR() {
        // Required empty public constructor
    }

    public static codigoQR newInstance(String param1, String param2) {
        codigoQR fragment = new codigoQR();
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

        myScannerView = new ZXingScannerView(getActivity());
        return myScannerView;
    }

    public void onResume(){
        super.onResume();
        myScannerView.setResultHandler(this);
        myScannerView.startCamera();
    }

    @Override
    public void handleResult(Result result) {
        Log.v("Handled Result: ", result.getText());
        AlertDialog.Builder builder = new AlertDialog.Builder(this.getContext());
        builder.setTitle("Resultado");
        builder.setMessage(result.getText());
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
        myScannerView.resumeCameraPreview((ZXingScannerView.ResultHandler)this);
    }



}
