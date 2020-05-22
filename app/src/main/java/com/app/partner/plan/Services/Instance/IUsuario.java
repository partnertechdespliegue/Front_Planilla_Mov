package com.app.partner.plan.Services.Instance;

import com.app.partner.plan.Common.Comunes;
import com.app.partner.plan.Services.Service.UsuarioInterface;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class IUsuario {

    private static IUsuario instance = null;
    private UsuarioInterface usuarioService;
    private Retrofit retrofit;

    public IUsuario() {
        retrofit = new Retrofit.Builder()
                .baseUrl(Comunes.URL_BACK)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        usuarioService = retrofit.create(UsuarioInterface.class);
    }
    public static IUsuario getInstance(){
        if (instance == null){
            instance = new IUsuario();
        }
        return instance;
    }

    public UsuarioInterface getUsuarioService(){
        return  usuarioService;
    }
}
