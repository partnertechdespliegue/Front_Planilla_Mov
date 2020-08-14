package com.app.partner.plan.Model.Request.MODEL;

public class NivelEduMODEL {
    private int idNivelEdu;
    private String descripcion;

    public NivelEduMODEL() {
    }

    public NivelEduMODEL(int idNivelEdu, String descripcion) {
        this.idNivelEdu = idNivelEdu;
        this.descripcion = descripcion;
    }

    public int getIdNivelEdu() {
        return idNivelEdu;
    }

    public void setIdNivelEdu(int idNivelEdu) {
        this.idNivelEdu = idNivelEdu;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
