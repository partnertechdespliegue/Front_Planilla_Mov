package com.app.partner.plan.Model.Response;

import com.app.partner.plan.Model.Request.MODEL.ContratoMODEL;
import com.app.partner.plan.Model.Request.MODEL.TrabajadorMODEL;

import java.util.List;

public class ResponseTraba {
    int estado;
    String msg;
   List<TrabajadorMODEL> DefaultObj;
   TrabajadorMODEL trabajador;



    public ResponseTraba(int estado, String msg) {
        this.estado = estado;
        this.msg = msg;
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

    public List<TrabajadorMODEL> getDefaultObj() {
        return DefaultObj;
    }

    public void setDefaultObj(List<TrabajadorMODEL> defaultObj) {
        DefaultObj = defaultObj;
    }

    public ResponseTraba(int estado, String msg, List<TrabajadorMODEL> defaultObj) {
        this.estado = estado;
        this.msg = msg;
        DefaultObj = defaultObj;
    }

    public TrabajadorMODEL getTrabajador() {
        return trabajador;
    }

    public void setTrabajador(TrabajadorMODEL trabajador) {
        this.trabajador = trabajador;
    }
}
