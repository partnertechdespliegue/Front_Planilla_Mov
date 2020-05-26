package com.app.partner.plan.Activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.app.partner.plan.Fragments.AdelantoSueldoFragment;
import com.app.partner.plan.Fragments.AjusteCuentaFragment;
import com.app.partner.plan.Fragments.InicioFragment;
import com.app.partner.plan.Fragments.VacacionesFragment;
import com.app.partner.plan.Fragments.GestionBoletas;
import com.app.partner.plan.R;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout drawerMain;
    private NavigationView navigationViewMain;
    TextView tvCerrarSesion;

    Fragment inicioFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            setFragmentDefecto();
        }
        obtenerViews();
        setToolBar();
        agregarDrawer();
        agregarNavigationView();


    }

    private void agregarDrawer() {
        drawerMain.addDrawerListener(new DrawerLayout.DrawerListener() {
            @Override
            public void onDrawerSlide(@NonNull View drawerView, float slideOffset) {

            }

            @Override
            public void onDrawerOpened(@NonNull View drawerView) {

            }

            @Override
            public void onDrawerClosed(@NonNull View drawerView) {

            }

            @Override
            public void onDrawerStateChanged(int newState) {

            }
        });
    }

    private void agregarNavigationView() {
        if (navigationViewMain.getCheckedItem() == null){
            navigationViewMain.getMenu().getItem(0).setChecked(true);
        }
        navigationViewMain.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                boolean fragmentTransaction = false;
                Fragment fragment = null;
                switch (item.getItemId()){
                    case R.id.inicio:
                        fragment = inicioFragment;
                        fragmentTransaction = true;
                        break;
                    case R.id.gesBoletas:
                        fragment = new GestionBoletas();
                        fragmentTransaction = true;
                        break;
                    case R.id.gesAdelantoSueldo:
                        fragment = new AdelantoSueldoFragment();
                        fragmentTransaction = true;
                        break;
                    case R.id.gesVacaciones:
                        fragment = new VacacionesFragment();
                        fragmentTransaction = true;
                        break;
                    case R.id.gesAjusteCuenta:
                        fragment = new AjusteCuentaFragment();
                        fragmentTransaction = true;
                        break;
                }

                if (fragmentTransaction){
                    getSupportActionBar().setTitle(item.getTitle());
                    cambiarFragment(fragment);
                    item.setCheckable(true);
                    drawerMain.closeDrawers();
                }
                return true;
            }
        });
    }

    private void obtenerViews() {
        drawerMain = findViewById(R.id.drawerMain);
        navigationViewMain = findViewById(R.id.navegationViewMain);
        tvCerrarSesion = findViewById(R.id.textViewCerrarSesionMain);
        tvCerrarSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iCerrarSesion = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(iCerrarSesion);
                finish();
            }
        });
    }

    private void setFragmentDefecto() {
        inicioFragment = new InicioFragment();
        cambiarFragment(inicioFragment);
    }

    public void cambiarFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentMain, fragment).commit();
    }

    private void setToolBar(){
        Toolbar toolbar = findViewById(R.id.toolbarMain);
        setSupportActionBar(toolbar);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_home);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                drawerMain.openDrawer(GravityCompat.START);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
