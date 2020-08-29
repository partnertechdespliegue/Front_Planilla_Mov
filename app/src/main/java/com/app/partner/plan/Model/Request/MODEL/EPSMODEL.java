package com.app.partner.plan.Model.Request.MODEL;

public class EPSMODEL {

    private int idEps;
    private String descripcion;
    private double aporte;
    private EmpresaMODEL empresa;

    public EPSMODEL(int idEps, String descripcion, double aporte, EmpresaMODEL empresa) {
        this.idEps = idEps;
        this.descripcion = descripcion;
        this.aporte = aporte;
        this.empresa = empresa;
    }

    public int getIdEps() {
        return idEps;
    }

    public void setIdEps(int idEps) {
        this.idEps = idEps;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getAporte() {
        return aporte;
    }

    public void setAporte(double aporte) {
        this.aporte = aporte;
    }

    public EmpresaMODEL getEmpresa() {
        return empresa;
    }

    public void setEmpresa(EmpresaMODEL empresa) {
        this.empresa = empresa;
    }
}
