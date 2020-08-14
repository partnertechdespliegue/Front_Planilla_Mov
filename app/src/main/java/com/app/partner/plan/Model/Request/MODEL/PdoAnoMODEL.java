package com.app.partner.plan.Model.Request.MODEL;

public class PdoAnoMODEL {
    private int idPdoAno;
    private int descripcion;

    public PdoAnoMODEL() {
    }

    public PdoAnoMODEL(int idPdoAno) {
        this.idPdoAno = idPdoAno;
    }

    public PdoAnoMODEL(int idPdoAno, int descripcion) {
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
