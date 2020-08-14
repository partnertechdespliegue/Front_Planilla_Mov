package com.app.partner.plan.Fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

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
    Fragment inicioFragment;
    private int[] mImages = new int[]{R.drawable.cloud, R.drawable.cloud, R.drawable.cloud, R.drawable.cloud};


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
        carouselView.setImageListener(new ImageListener() {
            @Override
            public void setImageForPosition(int position, ImageView imageView) {
                imageView.setImageResource(mImages[position]);
            }


        });
    }
    private void btn(){
        btnQR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Fragment fragment = new codigoQR();
                FragmentTransaction ftEs = getFragmentManager().beginTransaction();
                ftEs.replace(R.id.fragmentMain, fragment);
                ftEs.addToBackStack(null);
                ftEs.commit();
            }
        });
    }


}
