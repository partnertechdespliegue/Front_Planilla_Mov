package com.app.partner.plan.Model.Response;

import com.app.partner.plan.Model.Request.MODEL.TrabajadorMODEL;

import java.util.List;

public class ResponseTrabajador {

    private List<TrabajadorMODEL> aaData;
    TrabajadorMODEL defaultObj;
    private int estado;
    private String msg;


    public ResponseTrabajador(List<TrabajadorMODEL> aaData, int estado, String msg) {
        this.aaData = aaData;
        this.estado = estado;
        this.msg = msg;
    }

    public List<TrabajadorMODEL> getAaData() {
        return aaData;
    }

    public void setAaData(List<TrabajadorMODEL> aaData) {
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

    public TrabajadorMODEL getDefaultObj() {
        return defaultObj;
    }

    public void setDefaultObj(TrabajadorMODEL defaultObj) {
        this.defaultObj = defaultObj;
    }
}
