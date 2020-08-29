package com.app.partner.plan.Model.Request.MODEL;

public class ProvinciaMODEL {
    private int idProvincia;
    private String descripcion;

    public ProvinciaMODEL() {
    }

    public ProvinciaMODEL(int idProvincia) {
        this.idProvincia = idProvincia;
    }

    public ProvinciaMODEL(int idProvincia, String descripcion) {
        this.idProvincia = idProvincia;
        this.descripcion = descripcion;
    }

    public int getIdProvincia() {
        return idProvincia;
    }

    public void setIdProvincia(int idProvincia) {
        this.idProvincia = idProvincia;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
