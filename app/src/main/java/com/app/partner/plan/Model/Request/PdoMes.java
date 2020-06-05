package com.app.partner.plan.Model.Request;

import java.util.List;

public class PdoMes {

    private int idPdoMes;
    private String descripcion;
    private String abrev;
    private int diasFeriadoCalend;
    private int cantidadDias;
    private String txtDiasFeriados;
    private List<CuotaAdelanto> cuotaAdelanto;

    public PdoMes() {
    }

    public PdoMes(int idPdoMes, String descripcion, String abrev, int diasFeriadoCalend, int cantidadDias, String txtDiasFeriados, List<CuotaAdelanto> cuotaAdelanto) {
        this.idPdoMes = idPdoMes;
        this.descripcion = descripcion;
        this.abrev = abrev;
        this.diasFeriadoCalend = diasFeriadoCalend;
        this.cantidadDias = cantidadDias;
        this.txtDiasFeriados = txtDiasFeriados;
        this.cuotaAdelanto = cuotaAdelanto;
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

    public List<CuotaAdelanto> getCuotaAdelanto() {
        return cuotaAdelanto;
    }

    public void setCuotaAdelanto(List<CuotaAdelanto> cuotaAdelanto) {
        this.cuotaAdelanto = cuotaAdelanto;
    }
}
