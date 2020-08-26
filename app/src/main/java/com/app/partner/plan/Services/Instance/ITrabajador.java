package com.app.partner.plan.Services.Instance;

import com.app.partner.plan.Common.Comunes;
import com.app.partner.plan.Services.Service.IAdelantoSInterface;
import com.app.partner.plan.Services.Service.TrabajadorInterface;
import com.app.partner.plan.Services.Service.UsuarioInterface;
import com.app.partner.plan.Services.TokenInterceptor;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ITrabajador {

    private static ITrabajador instance = null;
    private TrabajadorInterface trabajadorInterface;
    private Retrofit retrofit;

    public ITrabajador() {
        OkHttpClient.Builder okHttpCliente = new OkHttpClient.Builder();
        okHttpCliente.addInterceptor(new TokenInterceptor());
        retrofit = new Retrofit.Builder()
                .baseUrl(Comunes.URL_BACK)
                .addConverterFactory(GsonConverterFactory.create())
                .client(okHttpCliente.build())
                .build();
        trabajadorInterface = retrofit.create(TrabajadorInterface.class);
    }
    public static ITrabajador getInstance(){
        if (instance == null){
            instance = new ITrabajador();
        }
        return instance;
    }

    public TrabajadorInterface getTrabajadorInterface(){
        return  trabajadorInterface;
    }

}
