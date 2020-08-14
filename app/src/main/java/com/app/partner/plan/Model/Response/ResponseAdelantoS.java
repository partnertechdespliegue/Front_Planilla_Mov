package com.app.partner.plan.Model.Response;

import com.app.partner.plan.Model.Request.MODEL.AdelantoSueldoMODEL;

import java.util.List;

public class ResponseAdelantoS {
    private List<AdelantoSueldoMODEL> aaData;
    private int estado;
    private String msg;

    public ResponseAdelantoS() {
    }

    public ResponseAdelantoS(List<AdelantoSueldoMODEL> aaData, int estado, String msg) {
        this.aaData = aaData;
        this.estado = estado;
        this.msg = msg;
    }

    public List<AdelantoSueldoMODEL> getAaData() {
        return aaData;
    }

    public void setAaData(List<AdelantoSueldoMODEL> aaData) {
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
