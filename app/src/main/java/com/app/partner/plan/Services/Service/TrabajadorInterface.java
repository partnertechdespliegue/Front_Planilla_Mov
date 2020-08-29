package com.app.partner.plan.Services.Service;

import com.app.partner.plan.Model.Request.DTO.TrabajadorDTO;
import com.app.partner.plan.Model.Request.MODEL.TrabajadorMODEL;
import com.app.partner.plan.Model.Response.ResponseTraba;
import com.app.partner.plan.Model.Response.ResponseTrabajador;


import okhttp3.MultipartBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Part;
import retrofit2.http.Path;

public interface TrabajadorInterface {

    @Multipart
    @POST("api/trabajador/cambiarFoto/{id}")
    Call<ResponseTrabajador> actualizarFoto(@Path("id") int id, @Part MultipartBody.Part fotoTrabajador);

    @GET("api/trabajador/uploadImage/img/{nombreFoto}")
    Call<ResponseTrabajador> mostrarFoto( @Path("nombreFoto") String nombreFoto);


    @PUT("api/trabajador/actualizarTraba")
    Call<ResponseTrabajador> modificar(@Body TrabajadorMODEL trabajadorMODEL);

    //@Part("foto") File fotoTrabajador,
    //@Path("id") int id,
}
