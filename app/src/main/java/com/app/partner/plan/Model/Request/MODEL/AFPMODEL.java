package com.app.partner.plan.Model.Request.MODEL;

public class AFPMODEL {

    private int idAfp;
    private String descripcion;
    private double comSobFlu;
    private double comSobFluMix;
    private double comAnuSobSal;
    private double primaSeguro;
    private double apoOblFndPen;
    private EmpresaMODEL empresa;

    public AFPMODEL(int idAfp, String descripcion, double comSobFlu, double comSobFluMix, double comAnuSobSal, double primaSeguro, double apoOblFndPen, EmpresaMODEL empresa) {
        this.idAfp = idAfp;
        this.descripcion = descripcion;
        this.comSobFlu = comSobFlu;
        this.comSobFluMix = comSobFluMix;
        this.comAnuSobSal = comAnuSobSal;
        this.primaSeguro = primaSeguro;
        this.apoOblFndPen = apoOblFndPen;
        this.empresa = empresa;
    }

    public int getIdAfp() {
        return idAfp;
    }

    public void setIdAfp(int idAfp) {
        this.idAfp = idAfp;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getComSobFlu() {
        return comSobFlu;
    }

    public void setComSobFlu(double comSobFlu) {
        this.comSobFlu = comSobFlu;
    }

    public double getComSobFluMix() {
        return comSobFluMix;
    }

    public void setComSobFluMix(double comSobFluMix) {
        this.comSobFluMix = comSobFluMix;
    }

    public double getComAnuSobSal() {
        return comAnuSobSal;
    }

    public void setComAnuSobSal(double comAnuSobSal) {
        this.comAnuSobSal = comAnuSobSal;
    }

    public double getPrimaSeguro() {
        return primaSeguro;
    }

    public void setPrimaSeguro(double primaSeguro) {
        this.primaSeguro = primaSeguro;
    }

    public double getApoOblFndPen() {
        return apoOblFndPen;
    }

    public void setApoOblFndPen(double apoOblFndPen) {
        this.apoOblFndPen = apoOblFndPen;
    }

    public EmpresaMODEL getEmpresa() {
        return empresa;
    }

    public void setEmpresa(EmpresaMODEL empresa) {
        this.empresa = empresa;
    }
}
