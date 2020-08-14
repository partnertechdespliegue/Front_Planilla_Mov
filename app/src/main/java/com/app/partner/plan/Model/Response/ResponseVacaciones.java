package com.app.partner.plan.Model.Response;

import com.app.partner.plan.Model.Request.MODEL.VacacionesMODEL;

import java.util.List;

public class ResponseVacaciones {

    private List<VacacionesMODEL> aaData;
    private int estado;
    private String msg;

    public ResponseVacaciones() {
    }

    public ResponseVacaciones(List<VacacionesMODEL> aaData, int estado, String msg) {
        this.aaData = aaData;
        this.estado = estado;
        this.msg = msg;
    }

    public List<VacacionesMODEL> getAaData() {
        return aaData;
    }

    public void setAaData(List<VacacionesMODEL> aaData) {
        this.aaData = aaData;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
