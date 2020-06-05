package com.app.partner.plan.Model.Request;

import java.sql.Date;

public class Vacaciones {
    private int  idVacacion;

    private String fechaIni;

    private String fechaFin;

    private int estado;

    private int diasVendidos;

    private int diasTomados;

    private Trabajador trabajador;

    public Vacaciones() {
    }

    public Vacaciones(int idVacacion, String fechaIni, String fechaFin, int estado, int diasVendidos, int diasTomados, Trabajador trabajador) {
        this.idVacacion = idVacacion;
        this.fechaIni = fechaIni;
        this.fechaFin = fechaFin;
        this.estado = estado;
        this.diasVendidos = diasVendidos;
        this.diasTomados = diasTomados;
        this.trabajador = trabajador;
    }

    public int getIdVacacion() {
        return idVacacion;
    }

    public void setIdVacacion(int idVacacion) {
        this.idVacacion = idVacacion;
    }

    public String getFechaIni() {
        return fechaIni;
    }

    public void setFechaIni(String fechaIni) {
        this.fechaIni = fechaIni;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public int getDiasVendidos() {
        return diasVendidos;
    }

    public void setDiasVendidos(int diasVendidos) {
        this.diasVendidos = diasVendidos;
    }

    public int getDiasTomados() {
        return diasTomados;
    }

    public void setDiasTomados(int diasTomados) {
        this.diasTomados = diasTomados;
    }

    public Trabajador getTrabajador() {
        return trabajador;
    }

    public void setTrabajador(Trabajador trabajador) {
        this.trabajador = trabajador;
    }
}
