package com.app.partner.plan.Model.Request.MODEL;

public class DepartamentoMODEL {
    private int idDepartamento;
    private String descripcion;

    public DepartamentoMODEL() {
    }

    public DepartamentoMODEL(int idDepartamento, String descripcion) {
        this.idDepartamento = idDepartamento;
        this.descripcion = descripcion;
    }

    public int getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(int idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
