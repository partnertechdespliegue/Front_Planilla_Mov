package com.app.partner.plan.Model.Request.MODEL;

import java.sql.Timestamp;

public class RheMODEL {

    private int idRhe;
    private String nombreArchivo;
    private Timestamp fechaReg;
    private Timestamp fechaEmiRecibo;
    private String nroDocEmi;
    private int estado;
    private TrabajadorMODEL trabajador;
    private PdoAnoMODEL pdoAno;
    private PdoMesMODEL pdoMes;

    public RheMODEL() {
    }

    public RheMODEL(int idRhe, String nombreArchivo, Timestamp fechaReg, Timestamp fechaEmiRecibo, String nroDocEmi, int estado, TrabajadorMODEL trabajador, PdoAnoMODEL pdoAno, PdoMesMODEL pdoMes) {
        this.idRhe = idRhe;
        this.nombreArchivo = nombreArchivo;
        this.fechaReg = fechaReg;
        this.fechaEmiRecibo = fechaEmiRecibo;
        this.nroDocEmi = nroDocEmi;
        this.estado = estado;
        this.trabajador = trabajador;
        this.pdoAno = pdoAno;
        this.pdoMes = pdoMes;
    }

    public int getIdRhe() {
        return idRhe;
    }

    public void setIdRhe(int idRhe) {
        this.idRhe = idRhe;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public Timestamp getFechaReg() {
        return fechaReg;
    }

    public void setFechaReg(Timestamp fechaReg) {
        this.fechaReg = fechaReg;
    }

    public Timestamp getFechaEmiRecibo() {
        return fechaEmiRecibo;
    }

    public void setFechaEmiRecibo(Timestamp fechaEmiRecibo) {
        this.fechaEmiRecibo = fechaEmiRecibo;
    }

    public String getNroDocEmi() {
        return nroDocEmi;
    }

    public void setNroDocEmi(String nroDocEmi) {
        this.nroDocEmi = nroDocEmi;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public TrabajadorMODEL getTrabajador() {
        return trabajador;
    }

    public void setTrabajador(TrabajadorMODEL trabajador) {
        this.trabajador = trabajador;
    }

    public PdoAnoMODEL getPdoAno() {
        return pdoAno;
    }

    public void setPdoAno(PdoAnoMODEL pdoAno) {
        this.pdoAno = pdoAno;
    }

    public PdoMesMODEL getPdoMes() {
        return pdoMes;
    }

    public void setPdoMes(PdoMesMODEL pdoMes) {
        this.pdoMes = pdoMes;
    }
}
