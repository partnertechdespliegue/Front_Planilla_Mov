package com.app.partner.plan.Model.Request.MODEL;

public class CuotaAdelantoMODEL {
    //ATRIBUTOS
    private int idCuotaAdelanto;
    private AdelantoSueldoMODEL adelantoSueldoMODEL;
    private double montoCuota;
    private int estado;

    //CONSTRUCTOR


    public CuotaAdelantoMODEL() {
    }

    public CuotaAdelantoMODEL(int idCuotaAdelanto) {
        this.idCuotaAdelanto = idCuotaAdelanto;
    }

    public CuotaAdelantoMODEL(int idCuotaAdelanto, AdelantoSueldoMODEL adelantoSueldoMODEL, double montoCuota, int estado) {
        this.idCuotaAdelanto = idCuotaAdelanto;
        this.adelantoSueldoMODEL = adelantoSueldoMODEL;
        this.montoCuota = montoCuota;
        this.estado = estado;
    }

    //GET SET

    public int getIdCuotaAdelanto() {
        return idCuotaAdelanto;
    }

    public void setIdCuotaAdelanto(int idCuotaAdelanto) {
        this.idCuotaAdelanto = idCuotaAdelanto;
    }

    public AdelantoSueldoMODEL getAdelantoSueldoMODEL() {
        return adelantoSueldoMODEL;
    }

    public void setAdelantoSueldoMODEL(AdelantoSueldoMODEL adelantoSueldoMODEL) {
        this.adelantoSueldoMODEL = adelantoSueldoMODEL;
    }

    public double getMontoCuota() {
        return montoCuota;
    }

    public void setMontoCuota(double montoCuota) {
        this.montoCuota = montoCuota;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
}
