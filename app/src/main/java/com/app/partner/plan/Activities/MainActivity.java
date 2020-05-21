package com.app.partner.plan.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;

import com.app.partner.plan.Fragments.GestionBoletas;
import com.app.partner.plan.Fragments.InicioFragment;
import com.app.partner.plan.R;

public class MainActivity extends AppCompatActivity {
    public Fragment inicio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //InicioFragment f = new InicioFragment();
        GestionBoletas f = new GestionBoletas();
        getSupportFragmentManager().beginTransaction().add(R.id.fragmentMain, f).commit();
    }


}
