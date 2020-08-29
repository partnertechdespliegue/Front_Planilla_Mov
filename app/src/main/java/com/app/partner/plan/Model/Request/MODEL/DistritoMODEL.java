package com.app.partner.plan.Model.Request.MODEL;

public class DistritoMODEL {
    private int idDistrito;
    private String descripcion;

    public DistritoMODEL() {
    }

    public DistritoMODEL(int idDistrito) {
        this.idDistrito = idDistrito;
    }

    public DistritoMODEL(int idDistrito, String descripcion) {
        this.idDistrito = idDistrito;
        this.descripcion = descripcion;
    }

    public int getIdDistrito() {
        return idDistrito;
    }

    public void setIdDistrito(int idDistrito) {
        this.idDistrito = idDistrito;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
