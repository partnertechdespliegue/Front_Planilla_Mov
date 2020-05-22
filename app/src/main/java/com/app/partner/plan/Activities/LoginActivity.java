package com.app.partner.plan.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Base64;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.app.partner.plan.Common.Comunes;
import com.app.partner.plan.Common.SharedPreferencesManager;
import com.app.partner.plan.Model.Response.ResponseUsuario;
import com.app.partner.plan.R;
import com.app.partner.plan.Services.Instance.IUsuario;
import com.app.partner.plan.Services.Service.UsuarioInterface;
import com.sdsmdg.tastytoast.TastyToast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginActivity extends AppCompatActivity {

    Button btnIngresar;
    EditText edtUsuairo, edtPassword;

    IUsuario iUsuario;
    UsuarioInterface uService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        retrofitInit();
        obtenerViews();
        eventosViews();

    }

    private void retrofitInit() {
        iUsuario = IUsuario.getInstance();
        uService = iUsuario.getUsuarioService();
    }

    private void obtenerViews() {
        btnIngresar = findViewById(R.id.buttonIngresarLogin);
        edtUsuairo = findViewById(R.id.editTextUsuarioLogin);
        edtPassword = findViewById(R.id.editTextContrasenaLogin);
    }
    private void eventosViews() {
        btnIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                logueo();
            }
        });

    }
    private void logueo(){

        final String email = edtUsuairo.getText().toString();
        final String password = edtPassword.getText().toString();

        if (!email.isEmpty() && !password.isEmpty()) {
            String base = "planillas123:planillas";
            String authHeader = "basic " + Base64.encodeToString(base.getBytes(), Base64.NO_WRAP);
            Call<ResponseUsuario> call = uService.login(authHeader, "password", email, password);
            call.enqueue(new Callback<ResponseUsuario>() {
                @Override
                public void onResponse(Call<ResponseUsuario> call, Response<ResponseUsuario> response) {
                    System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA"+response);
                    if (response.isSuccessful()) {
                        Intent intentIniciar = new Intent(LoginActivity.this, MainActivity.class);
                        startActivity(intentIniciar);
                        finish();
                    } else {
                        Toast tastyToast = TastyToast.makeText(LoginActivity.this, "Verifique su email o contraseña", TastyToast.LENGTH_SHORT, TastyToast.INFO);
                        tastyToast.setGravity(Gravity.TOP | Gravity.CENTER_HORIZONTAL, 0, 150);
                        tastyToast.show();
                    }
                }

                @Override
                public void onFailure(Call<ResponseUsuario> call, Throwable t) {
                    Toast tastyToast = TastyToast.makeText(LoginActivity.this, "Verifique que cuente con conexión a internet", TastyToast.LENGTH_LONG, TastyToast.ERROR);
                    tastyToast.setGravity(Gravity.TOP | Gravity.CENTER_HORIZONTAL, 0, 150);
                    tastyToast.show();
                }
            });
        } else {
            Toast tastyToast = TastyToast.makeText(this, "Debe completar los campos", TastyToast.LENGTH_SHORT, TastyToast.INFO);
            tastyToast.setGravity(Gravity.TOP | Gravity.CENTER_HORIZONTAL, 0, 150);
            tastyToast.show();

        }
    }


}
