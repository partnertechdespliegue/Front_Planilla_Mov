package com.app.partner.plan.Model.Response;

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
    private String jti;

    public ResponseUsuario() {
    }

    public ResponseUsuario(String access_token, String token_type, String refresh_token, int expires_in, String scope, boolean estado, String nombre_perfil, String correo, Integer id_perfil, String username, String jti) {
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
}
