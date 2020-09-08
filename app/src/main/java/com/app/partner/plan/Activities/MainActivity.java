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

import com.app.partner.plan.Common.Comunes;
import com.app.partner.plan.Common.SharedPreferencesManager;
import com.app.partner.plan.Fragments.AdelantoSueldoFragment;
import com.app.partner.plan.Fragments.AjusteCuentaFragment;
import com.app.partner.plan.Fragments.InicioFragment;
import com.app.partner.plan.Fragments.VacacionesFragment;
import com.app.partner.plan.Fragments.GestionBoletas;
import com.app.partner.plan.Model.Request.MODEL.TrabajadorMODEL;
import com.app.partner.plan.R;
import com.app.partner.plan.codigoQR;
import com.google.android.material.navigation.NavigationView;
import com.squareup.picasso.Picasso;

import de.hdodenhof.circleimageview.CircleImageView;

public class MainActivity extends AppCompatActivity  {

    private DrawerLayout drawerMain;
    private NavigationView navigationViewMain;
    TextView tvCerrarSesion, txtVapellido, txtvNombres;
    CircleImageView fotoCircle;

    Fragment inicioFragment;

    TrabajadorMODEL trabajadorMODEL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            setFragmentDefecto();
        }

        obtenerViews();
        MostrarImg();
        setToolBar();
        agregarDrawer();
        agregarNavigationView();

        int requestCode = 0;
        String[] permissions = null;
        int[] grantResults = null;
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);


       // super.onRequestPermissionsResult(int requestCode, String[] permissions,int[] grantResults);


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
                    case R.id.codigoQR:
                        fragment = new codigoQR();
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
        fotoCircle = navigationViewMain.getHeaderView(0).findViewById(R.id.imageViewPefil);
        txtVapellido = navigationViewMain.getHeaderView(0).findViewById(R.id.textViewApellidoNavigation);
        txtvNombres = navigationViewMain.getHeaderView(0).findViewById(R.id.textViewNombreNavigation);

        tvCerrarSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iCerrarSesion = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(iCerrarSesion);
                finish();
            }
        });
    }

    public void MostrarImg(){
        trabajadorMODEL = SharedPreferencesManager.getTrabajadorMODEL();

        if(trabajadorMODEL.getFoto()!=null){
            Picasso.get().load(Comunes.URL_BACK +"api/trabajador/uploadImage/img/"+trabajadorMODEL.getFoto()).into(fotoCircle);
            System.out.println(trabajadorMODEL.toString());

        }

        txtVapellido.setText(SharedPreferencesManager.getTrabajadorMODEL().getApePater());
        txtvNombres.setText(SharedPreferencesManager.getTrabajadorMODEL().getNombres());


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
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.me);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }


    private void setTooli(){
        Toolbar toolbar = findViewById(R.id.toolbarMain);
        setSupportActionBar(toolbar);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.espalda);
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
