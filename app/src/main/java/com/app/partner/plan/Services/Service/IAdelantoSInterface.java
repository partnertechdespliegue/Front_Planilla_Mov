package com.app.partner.plan.Services.Service;

import com.app.partner.plan.Model.Request.DTO.AdelantoSueldoDTO;
import com.app.partner.plan.Model.Request.MODEL.TrabajadorMODEL;
import com.app.partner.plan.Model.Response.ResponseAdelantoS;
import com.app.partner.plan.Model.Response.ResponseRegisSolicitud;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface IAdelantoSInterface {

    @POST("api/adelantoSueldo/listarAdeSueldo")
    Call<ResponseAdelantoS> listarAdeSueldo(@Body TrabajadorMODEL trabajadorModel);

    @POST("api/adelantoSueldo/registrarSolicitud")
    Call<ResponseRegisSolicitud> registrarSolicitud(@Body AdelantoSueldoDTO adelantoSueldoDTO);


}
