package com.app.partner.plan.Model.Request.MODEL;

public class AdelantoSueldoMODEL {
    private int idAdelantoSueldo;
    private int tipo;
    private int estado;
    private String nombreArchivo;
    private double montoTotal;
    private int nroCuotas;
    private String fechaSol;
    private TrabajadorMODEL Trabajador;

    public AdelantoSueldoMODEL() {
    }

    public AdelantoSueldoMODEL(int tipo, int estado, double montoTotal, int nroCuotas, String fechaSol, TrabajadorMODEL trabajador) {
        this.tipo = tipo;
        this.estado = estado;
        this.montoTotal = montoTotal;
        this.nroCuotas = nroCuotas;
        this.fechaSol = fechaSol;
        Trabajador = trabajador;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public int getIdAdelantoSueldo() {
        return idAdelantoSueldo;
    }

    public void setIdAdelantoSueldo(int idAdelantoSueldo) {
        this.idAdelantoSueldo = idAdelantoSueldo;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public int getNroCuotas() {
        return nroCuotas;
    }

    public void setNroCuotas(int nroCuotas) {
        this.nroCuotas = nroCuotas;
    }

    public String getFechaSol() {
        return fechaSol;
    }

    public void setFechaSol(String fechaSol) {
        this.fechaSol = fechaSol;
    }

    public TrabajadorMODEL getTrabajador() {
        return Trabajador;
    }

    public void setTrabajador(TrabajadorMODEL trabajador) {
        Trabajador = trabajador;
    }
}
