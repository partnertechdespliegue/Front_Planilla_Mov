package com.app.partner.plan.Model.Request.MODEL;

public class RegSaludMODEL {

    private int idRegSalud;
    private String descripcion;

    public RegSaludMODEL() {
    }

    public RegSaludMODEL(int idRegSalud, String descripcion) {
        this.idRegSalud = idRegSalud;
        this.descripcion = descripcion;
    }

    public int getIdRegSalud() {
        return idRegSalud;
    }

    public void setIdRegSalud(int idRegSalud) {
        this.idRegSalud = idRegSalud;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
