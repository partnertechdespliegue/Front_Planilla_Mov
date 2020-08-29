package com.app.partner.plan.Model.Request.MODEL;

public class TipoDocMODEL {

    private int idTipoDoc;
    private String descripcion;

    public TipoDocMODEL() {
    }

    public TipoDocMODEL(int idTipoDoc) {
        this.idTipoDoc = idTipoDoc;
    }

    public TipoDocMODEL(int idTipoDoc, String descripcion) {
        this.idTipoDoc = idTipoDoc;
        this.descripcion = descripcion;
    }

    public int getIdTipoDoc() {
        return idTipoDoc;
    }

    public void setIdTipoDoc(int idTipoDoc) {
        this.idTipoDoc = idTipoDoc;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
