package com.app.partner.plan.Model.Request.MODEL;

import java.sql.Timestamp;

public class ContratoMODEL {

    public  int idContrato;

    public ContratoMODEL() {
    }

    public ContratoMODEL(int idContrato) {
        this.idContrato = idContrato;
    }

    public int getIdContrato() {
        return idContrato;
    }

    public void setIdContrato(int idContrato) {
        this.idContrato = idContrato;
    }

    /*public  int regAlterAcuAtp;
    public  int discap;
    public  int jorMax;
    public  int horNoc;
    public Timestamp dfecInicio;
    public Timestamp fecFin;
    public Timestamp fechaFirma;
    public  int sueldoBase;
    public int  valorHora;
    public  int tipoCuenta;
    public int tipoMoneda;
    public  String nroCta;
    public  String nroCci;
    public  int movilidad;
    public int otrIgr5ta;
    public int  sindical;
    public int epsServPropSalud;
    public int quintaExo;
    public String cuentaCTS;
    public int tipoComprob;
    public String accion;*/
}