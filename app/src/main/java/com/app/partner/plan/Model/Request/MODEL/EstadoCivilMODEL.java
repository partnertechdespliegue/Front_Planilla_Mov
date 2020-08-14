package com.app.partner.plan.Model.Request.MODEL;

public class EstadoCivilMODEL {
    private int idEstadoCivil;
    private String descripcion;

    public EstadoCivilMODEL() {
    }

    public EstadoCivilMODEL(int idEstadoCivil, String descripcion) {
        this.idEstadoCivil = idEstadoCivil;
        this.descripcion = descripcion;
    }

    public int getIdEstadoCivil() {
        return idEstadoCivil;
    }

    public void setIdEstadoCivil(int idEstadoCivil) {
        this.idEstadoCivil = idEstadoCivil;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
