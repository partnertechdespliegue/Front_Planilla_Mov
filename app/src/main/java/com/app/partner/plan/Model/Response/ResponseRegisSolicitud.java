package com.app.partner.plan.Model.Response;

import com.app.partner.plan.Model.Request.DTO.AdelantoSueldoDTO;
import com.app.partner.plan.Model.Request.MODEL.AdelantoSueldoMODEL;

import java.util.List;

public class ResponseRegisSolicitud {
    private int estado;
    private String msg;
    private List<AdelantoSueldoMODEL> defaultObj;

    public ResponseRegisSolicitud() {
    }

    public ResponseRegisSolicitud(int estado, String msg, List<AdelantoSueldoMODEL> defaultObj) {
        this.estado = estado;
        this.msg = msg;
        this.defaultObj = defaultObj;
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

    public List<AdelantoSueldoMODEL> getDefaultObj() {
        return defaultObj;
    }

    public void setDefaultObj(List<AdelantoSueldoMODEL> defaultObj) {
        this.defaultObj = defaultObj;
    }
}
