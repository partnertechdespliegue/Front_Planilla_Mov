package com.app.partner.plan.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.app.partner.plan.R;
import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;


public class InicioFragment extends Fragment {

    CarouselView carouselView;
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
        return view;
    }

    private void obtenerViews(View view) {
        carouselView = view.findViewById(R.id.carouselDescubreOfertas);
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
}
