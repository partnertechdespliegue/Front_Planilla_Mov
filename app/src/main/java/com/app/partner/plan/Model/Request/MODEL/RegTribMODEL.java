package com.app.partner.plan.Model.Request.MODEL;

public class RegTribMODEL {
    private int idRegTrib;
    private String descripcion;

    public RegTribMODEL() {
    }

    public RegTribMODEL(int idRegTrib, String descripcion) {
        this.idRegTrib = idRegTrib;
        this.descripcion = descripcion;
    }

    public int getIdRegTrib() {
        return idRegTrib;
    }

    public void setIdRegTrib(int idRegTrib) {
        this.idRegTrib = idRegTrib;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
