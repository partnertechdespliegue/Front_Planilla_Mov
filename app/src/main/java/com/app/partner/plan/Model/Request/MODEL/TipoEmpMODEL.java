package com.app.partner.plan.Model.Request.MODEL;

public class TipoEmpMODEL {
    private int idTipoEmp;
    private String descripcion;

    public TipoEmpMODEL() {
    }

    public TipoEmpMODEL(int idTipoEmp, String descripcion) {
        this.idTipoEmp = idTipoEmp;
        this.descripcion = descripcion;
    }

    public int getIdTipoEmp() {
        return idTipoEmp;
    }

    public void setIdTipoEmp(int idTipoEmp) {
        this.idTipoEmp = idTipoEmp;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
