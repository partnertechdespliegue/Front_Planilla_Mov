package com.app.partner.plan.Services.Service;

import com.app.partner.plan.Model.Request.MODEL.TrabajadorModel;
import com.app.partner.plan.Model.Request.Trabajador;
import com.app.partner.plan.Model.Response.ResponseBoletas;
import com.app.partner.plan.Model.Response.ResponseVacaciones;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface VacacionesInterface {


    @POST("api/vacaciones/listarPorTrabajador")
    Call<ResponseVacaciones> listarPorTrabajador(@Body TrabajadorModel trabajadorModel);

}
