package com.app.partner.plan.Model.Request.MODEL;

public class OcupacionMODEL {
    private int idOcupacion;
    private String descripcion;

    public OcupacionMODEL() {
    }

    public OcupacionMODEL(int idOcupacion) {
        this.idOcupacion = idOcupacion;
    }

    public OcupacionMODEL(int idOcupacion, String descripcion) {
        this.idOcupacion = idOcupacion;
        this.descripcion = descripcion;
    }

    public int getIdOcupacion() {
        return idOcupacion;
    }

    public void setIdOcupacion(int idOcupacion) {
        this.idOcupacion = idOcupacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
