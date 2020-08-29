package com.app.partner.plan.Model.Request.MODEL;

public class TipoZonaMODEL {
    private int idTipoZona;
    private String descripcion;

    public TipoZonaMODEL() {
    }

    public TipoZonaMODEL(int idTipoZona) {
        this.idTipoZona = idTipoZona;
    }

    public TipoZonaMODEL(int idTipoZona, String descripcion) {
        this.idTipoZona = idTipoZona;
        this.descripcion = descripcion;
    }

    public int getIdTipoZona() {
        return idTipoZona;
    }

    public void setIdTipoZona(int idTipoZona) {
        this.idTipoZona = idTipoZona;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
