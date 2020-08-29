package com.app.partner.plan.Model.Request.MODEL;

import java.sql.Timestamp;

public class DerechoHabientesMODEL {

    private int idDerechoHabiente;
    private int idTipoDerechoHabiente;
    private String nombre;
    private String nombreArchivo;
    private String apellido;
    private Timestamp fechaNac;
    private String correo;
    private int estado;
    private Timestamp fechaFin;
    private TrabajadorMODEL trabajador;

    public DerechoHabientesMODEL() {
    }

    public DerechoHabientesMODEL(int idDerechoHabiente, int idTipoDerechoHabiente, String nombre, String nombreArchivo, String apellido, Timestamp fechaNac, String correo, int estado, Timestamp fechaFin, TrabajadorMODEL trabajador) {
        this.idDerechoHabiente = idDerechoHabiente;
        this.idTipoDerechoHabiente = idTipoDerechoHabiente;
        this.nombre = nombre;
        this.nombreArchivo = nombreArchivo;
        this.apellido = apellido;
        this.fechaNac = fechaNac;
        this.correo = correo;
        this.estado = estado;
        this.fechaFin = fechaFin;
        this.trabajador = trabajador;
    }

    public int getIdDerechoHabiente() {
        return idDerechoHabiente;
    }

    public void setIdDerechoHabiente(int idDerechoHabiente) {
        this.idDerechoHabiente = idDerechoHabiente;
    }

    public int getIdTipoDerechoHabiente() {
        return idTipoDerechoHabiente;
    }

    public void setIdTipoDerechoHabiente(int idTipoDerechoHabiente) {
        this.idTipoDerechoHabiente = idTipoDerechoHabiente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Timestamp getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Timestamp fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public Timestamp getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Timestamp fechaFin) {
        this.fechaFin = fechaFin;
    }

    public TrabajadorMODEL getTrabajador() {
        return trabajador;
    }

    public void setTrabajador(TrabajadorMODEL trabajador) {
        this.trabajador = trabajador;
    }
}
