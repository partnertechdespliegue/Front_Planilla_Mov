package com.app.partner.plan.Services.Instance;

import com.app.partner.plan.Common.Comunes;
import com.app.partner.plan.Services.Service.VacacionesInterface;
import com.app.partner.plan.Services.TokenInterceptor;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class IVacaciones {

    private static IVacaciones instance = null;
    private VacacionesInterface vacacionesInterface;
    private Retrofit retrofit;

    public IVacaciones() {

        OkHttpClient.Builder okHttpCliente = new OkHttpClient.Builder();
        okHttpCliente.addInterceptor(new TokenInterceptor());
        retrofit = new Retrofit.Builder()
                .baseUrl(Comunes.URL_BACK)
                .addConverterFactory(GsonConverterFactory.create())
                .client(okHttpCliente.build())
                .build();
        vacacionesInterface = retrofit.create(VacacionesInterface.class);
    }

    public static IVacaciones getInstance(){
        if (instance == null){
            instance = new IVacaciones();
        }
        return instance;
    }

    public VacacionesInterface getVacacionesInterface(){
        return  vacacionesInterface;
    }


}
