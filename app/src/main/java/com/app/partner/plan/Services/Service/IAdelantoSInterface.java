package com.app.partner.plan.Services.Service;

import com.app.partner.plan.Model.Request.MODEL.TrabajadorModel;
import com.app.partner.plan.Model.Response.ResponseAdelantoS;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface IAdelantoSInterface {

    @POST("api/adelantoSueldo/listarAdeSueldo")
    Call<ResponseAdelantoS> listarAdeSueldo(@Body TrabajadorModel trabajadorModel);

}
