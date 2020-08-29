package com.app.partner.plan.Model.Request.MODEL;

import java.sql.Timestamp;

public class SuspencionMODEL {

    private int idSuspencion;
    private String nombreArchivo;
    private Timestamp fechaRegistro;
    private TrabajadorMODEL trabajador;

    public SuspencionMODEL() {
    }

    public SuspencionMODEL(int idSuspencion, String nombreArchivo, Timestamp fechaRegistro, TrabajadorMODEL trabajador) {
        this.idSuspencion = idSuspencion;
        this.nombreArchivo = nombreArchivo;
        this.fechaRegistro = fechaRegistro;
        this.trabajador = trabajador;
    }

    public int getIdSuspencion() {
        return idSuspencion;
    }

    public void setIdSuspencion(int idSuspencion) {
        this.idSuspencion = idSuspencion;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public Timestamp getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Timestamp fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public TrabajadorMODEL getTrabajador() {
        return trabajador;
    }

    public void setTrabajador(TrabajadorMODEL trabajador) {
        this.trabajador = trabajador;
    }
}
