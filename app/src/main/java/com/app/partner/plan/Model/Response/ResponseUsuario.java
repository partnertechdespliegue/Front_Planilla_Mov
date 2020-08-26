package com.app.partner.plan.Model.Response;

import com.app.partner.plan.Model.Request.MODEL.TrabajadorMODEL;

public class ResponseUsuario {

    private String access_token;
    private String token_type;
    private String refresh_token;
    private int expires_in;
    private String scope;
    private boolean estado;
    private String nombre_perfil;
    private String correo;
    private Integer id_perfil;
    private String username;
    private TrabajadorMODEL trabajador;
    private String jti;



    public ResponseUsuario() {
    }

    public ResponseUsuario(String access_token, String token_type, String refresh_token, int expires_in, String scope, boolean estado, String nombre_perfil, String correo, Integer id_perfil, String username, String jti, TrabajadorMODEL trabajador) {
        this.access_token = access_token;
        this.token_type = token_type;
        this.refresh_token = refresh_token;
        this.expires_in = expires_in;
        this.scope = scope;
        this.estado = estado;
        this.nombre_perfil = nombre_perfil;
        this.correo = correo;
        this.id_perfil = id_perfil;
        this.username = username;
        this.jti = jti;
        this.trabajador = trabajador;
    }

    public String getAccess_token() {
        return access_token;
    }

    public String getNombre() {
        return nombre_perfil;
    }

    public Integer getId_perfil() {
        return id_perfil;
    }

    public String getUsername() {
        return username;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public String getToken_type() {
        return token_type;
    }

    public void setToken_type(String token_type) {
        this.token_type = token_type;
    }

    public String getRefresh_token() {
        return refresh_token;
    }

    public void setRefresh_token(String refresh_token) {
        this.refresh_token = refresh_token;
    }

    public int getExpires_in() {
        return expires_in;
    }

    public void setExpires_in(int expires_in) {
        this.expires_in = expires_in;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getNombre_perfil() {
        return nombre_perfil;
    }

    public void setNombre_perfil(String nombre_perfil) {
        this.nombre_perfil = nombre_perfil;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setId_perfil(Integer id_perfil) {
        this.id_perfil = id_perfil;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public TrabajadorMODEL getTrabajador() {
        return trabajador;
    }

    public void setTrabajador(TrabajadorMODEL trabajador) {
        this.trabajador = trabajador;
    }

    public String getJti() {
        return jti;
    }

    public void setJti(String jti) {
        this.jti = jti;
    }
}
