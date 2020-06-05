package com.app.partner.plan.Services.Instance;

import com.app.partner.plan.Common.Comunes;
import com.app.partner.plan.Services.Service.IAdelantoSInterface;
import com.app.partner.plan.Services.TokenInterceptor;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class IAdelantoS {

    private static IAdelantoS instance = null;
    private IAdelantoSInterface iAdelantoSInterface;
    private Retrofit retrofit;

    public IAdelantoS() {

        OkHttpClient.Builder okHttpCliente = new OkHttpClient.Builder();
        okHttpCliente.addInterceptor(new TokenInterceptor());
        retrofit = new Retrofit.Builder()
                .baseUrl(Comunes.URL_BACK)
                .addConverterFactory(GsonConverterFactory.create())
                .client(okHttpCliente.build())
                .build();
        iAdelantoSInterface = retrofit.create(IAdelantoSInterface.class);
    }

    public static IAdelantoS getInstance(){
        if (instance == null){
            instance = new IAdelantoS();
        }
        return instance;
    }

    public IAdelantoSInterface getiAdelantoSInterface(){
        return  iAdelantoSInterface;
    }


}
