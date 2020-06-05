package com.app.partner.plan.Model.Request;

import com.app.partner.plan.Model.Request.MODEL.TrabajadorModel;

import java.sql.Timestamp;

public class AdelantoSueldo {
   // private int idAdelantoSueldo;
    //private int tipo;
    private int estado;
   // private String nombreArchivo;
    //private double montoTotal;
    //private int nroCuotas;
    private String fechaSol;
    private TrabajadorModel Trabajador;

    public AdelantoSueldo() {
    }

    public AdelantoSueldo(String fechaSol) {
        this.fechaSol = fechaSol;
    }

    public AdelantoSueldo(int estado, String fechaSol, TrabajadorModel trabajador) {
        this.estado = estado;
        this.fechaSol = fechaSol;
        Trabajador = trabajador;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public String getFechaSol() {
        return fechaSol;
    }

    public void setFechaSol(String fechaSol) {
        this.fechaSol = fechaSol;
    }

    public TrabajadorModel getTrabajador() {
        return Trabajador;
    }

    public void setTrabajador(TrabajadorModel trabajador) {
        Trabajador = trabajador;
    }
}
