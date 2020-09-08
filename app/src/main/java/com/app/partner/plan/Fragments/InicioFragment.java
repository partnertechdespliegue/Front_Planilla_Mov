package com.app.partner.plan.Fragments;

import android.Manifest;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Environment;
import android.os.StrictMode;
import android.provider.Settings;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.app.partner.plan.R;
import com.app.partner.plan.codigoQR;
import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;



public class InicioFragment extends Fragment {

    CarouselView carouselView;
    CardView cardView;
    Button btnQR;
    private int[] mImages = new int[]{R.drawable.cloud, R.drawable.cloud, R.drawable.cloud, R.drawable.cloud};
    public static final int MY_PERMISSIONS_CAMERA = 1;

    public InicioFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_inicio, container, false);
        obtenerViews(view);
        crearCarousel();
        btn();
        return view;
    }

    private void obtenerViews(View view) {
        carouselView = view.findViewById(R.id.carouselDescubreOfertas);
        btnQR = view.findViewById(R.id.btnAsistencia);
    }

    private void crearCarousel(){

        carouselView.setPageCount(mImages.length);
        carouselView.setRadius(10);
        carouselView.setImageListener(new ImageListener() {
            @Override
            public void setImageForPosition(int position, ImageView imageView) {
                imageView.setImageResource(mImages[position]);
            }


        });
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        switch (requestCode){
            case MY_PERMISSIONS_CAMERA:
                if(grantResults[0] == PackageManager.PERMISSION_GRANTED){
                    escaneador();
                }else{
                    alert();
                    // Toast.makeText(getContext(), "No se aceptó permisos", Toast.LENGTH_SHORT).show();
                }
            default:
                super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        }
    }

    private void permiso(){
        if (ContextCompat.checkSelfPermission(getContext(), Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED) {
            requestPermissions(new String[]{Manifest.permission.CAMERA}, MY_PERMISSIONS_CAMERA);
        }
    }

    private void alert(){
        new AlertDialog.Builder(getContext())
                .setTitle("Galery")
                .setMessage("Es neceario proporcionar el permiso de cámara. \n\n ¿Desea dar el permiso?")
                .setPositiveButton("Si", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        System.out.println("BIEN");
                        permiso();
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                        System.out.println("MAL");
                    }
                })
                .show();
    }


    private void btn(){
        btnQR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ContextCompat.checkSelfPermission(getContext(), Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED) {
                    requestPermissions(new String[]{Manifest.permission.CAMERA}, MY_PERMISSIONS_CAMERA);
                }
               else{
                    escaneador();
                }
            }
        });
    }

    private void escaneador(){
        Fragment fragment = new codigoQR();
        FragmentTransaction ftEs = getFragmentManager().beginTransaction();
        ftEs.replace(R.id.fragmentMain, fragment);
        ftEs.addToBackStack(null);
        ftEs.commit();
    }


}
