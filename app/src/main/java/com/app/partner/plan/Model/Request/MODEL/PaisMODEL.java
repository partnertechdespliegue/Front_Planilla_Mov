package com.app.partner.plan.Model.Request.MODEL;

public class PaisMODEL {

    private int idPais;
    private String descripcion;

    public PaisMODEL(int idPais, String descripcion) {
        this.idPais = idPais;
        this.descripcion = descripcion;
    }

    public int getIdPais() {
        return idPais;
    }

    public void setIdPais(int idPais) {
        this.idPais = idPais;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
