package com.app.partner.plan.Model.Request.MODEL;

import java.util.List;

public class PdoMesMODEL {

    private int idPdoMes;
    private String descripcion;
    private String abrev;
    private int diasFeriadoCalend;
    private int cantidadDias;
    private String txtDiasFeriados;
    private List<CuotaAdelantoMODEL> cuotaAdelantoMODEL;

    public PdoMesMODEL() {
    }

    public PdoMesMODEL(int idPdoMes) {
        this.idPdoMes = idPdoMes;
    }

    public PdoMesMODEL(int idPdoMes, String descripcion, String abrev, int diasFeriadoCalend, int cantidadDias, String txtDiasFeriados, List<CuotaAdelantoMODEL> cuotaAdelantoMODEL) {
        this.idPdoMes = idPdoMes;
        this.descripcion = descripcion;
        this.abrev = abrev;
        this.diasFeriadoCalend = diasFeriadoCalend;
        this.cantidadDias = cantidadDias;
        this.txtDiasFeriados = txtDiasFeriados;
        this.cuotaAdelantoMODEL = cuotaAdelantoMODEL;
    }

    public int getIdPdoMes() {
        return idPdoMes;
    }

    public void setIdPdoMes(int idPdoMes) {
        this.idPdoMes = idPdoMes;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getAbrev() {
        return abrev;
    }

    public void setAbrev(String abrev) {
        this.abrev = abrev;
    }

    public int getDiasFeriadoCalend() {
        return diasFeriadoCalend;
    }

    public void setDiasFeriadoCalend(int diasFeriadoCalend) {
        this.diasFeriadoCalend = diasFeriadoCalend;
    }

    public int getCantidadDias() {
        return cantidadDias;
    }

    public void setCantidadDias(int cantidadDias) {
        this.cantidadDias = cantidadDias;
    }

    public String getTxtDiasFeriados() {
        return txtDiasFeriados;
    }

    public void setTxtDiasFeriados(String txtDiasFeriados) {
        this.txtDiasFeriados = txtDiasFeriados;
    }

    public List<CuotaAdelantoMODEL> getCuotaAdelantoMODEL() {
        return cuotaAdelantoMODEL;
    }

    public void setCuotaAdelantoMODEL(List<CuotaAdelantoMODEL> cuotaAdelantoMODEL) {
        this.cuotaAdelantoMODEL = cuotaAdelantoMODEL;
    }
}
