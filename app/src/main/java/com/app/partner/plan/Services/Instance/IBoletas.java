package com.app.partner.plan.Services.Instance;

import com.app.partner.plan.Common.Comunes;
import com.app.partner.plan.Services.Service.BoletaInterface;
import com.app.partner.plan.Services.TokenInterceptor;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class IBoletas {

    private static IBoletas instance = null;
    private BoletaInterface boletaInterface;
    private Retrofit retrofit;

    public IBoletas() {

        OkHttpClient.Builder okHttpCliente = new OkHttpClient.Builder();
        okHttpCliente.addInterceptor(new TokenInterceptor());
        retrofit = new Retrofit.Builder()
                .baseUrl(Comunes.URL_BACK)
                .addConverterFactory(GsonConverterFactory.create())
                .client(okHttpCliente.build())
                .build();
        boletaInterface = retrofit.create(BoletaInterface.class);
    }

    public static IBoletas getInstance(){
        if (instance == null){
            instance = new IBoletas();
        }
        return instance;
    }

    public BoletaInterface getTiendaService(){
        return  boletaInterface;
    }
}
