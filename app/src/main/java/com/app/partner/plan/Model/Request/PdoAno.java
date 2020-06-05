package com.app.partner.plan.Model.Request;

public class PdoAno {
    private int idPdoAno;
    private int descripcion;

    public PdoAno() {
    }

    public PdoAno(int idPdoAno, int descripcion) {
        this.idPdoAno = idPdoAno;
        this.descripcion = descripcion;
    }

    public int getIdPdoAno() {
        return idPdoAno;
    }

    public void setIdPdoAno(int idPdoAno) {
        this.idPdoAno = idPdoAno;
    }

    public int getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(int descripcion) {
        this.descripcion = descripcion;
    }
}
