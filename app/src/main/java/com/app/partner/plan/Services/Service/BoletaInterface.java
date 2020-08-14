package com.app.partner.plan.Services.Service;

import com.app.partner.plan.Model.Request.DTO.TrabajadorDTO;
import com.app.partner.plan.Model.Response.ResponseBoletas;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface BoletaInterface {

    @POST("api/planilla/listarBoletas")
    Call<ResponseBoletas> listarBoletas(@Body TrabajadorDTO trabajador);

}
