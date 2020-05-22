package com.app.partner.plan.Services.Service;

import com.app.partner.plan.Model.Response.ResponseUsuario;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Header;
import retrofit2.http.POST;

public interface UsuarioInterface {

    @FormUrlEncoded
    @POST("oauth/token")
    Call<ResponseUsuario> login(@Header("Authorization") String authHeader,
                                @Field("grant_type") String grant_type,
                                @Field("username") String username,
                                @Field("password") String password);
}
