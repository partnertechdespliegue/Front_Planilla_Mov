package com.app.partner.plan.Model.Request.MODEL;

public class SituacionMODEL {
    private int idSituacion;
    private String descripcion;

    public SituacionMODEL() {
    }

    public SituacionMODEL(int idSituacion, String descripcion) {
        this.idSituacion = idSituacion;
        this.descripcion = descripcion;
    }

    public int getIdSituacion() {
        return idSituacion;
    }

    public void setIdSituacion(int idSituacion) {
        this.idSituacion = idSituacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
