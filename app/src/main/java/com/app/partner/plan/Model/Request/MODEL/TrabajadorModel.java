package com.app.partner.plan.Model.Request.MODEL;

public class TrabajadorModel {

    private int idTrabajador;
    private String nombres;
    private String apePater;
    private String apeMater;

    public TrabajadorModel() {
    }

    public TrabajadorModel(int idTrabajador, String nombres, String apePater, String apeMater) {
        this.idTrabajador = idTrabajador;
        this.nombres = nombres;
        this.apePater = apePater;
        this.apeMater = apeMater;
    }


    public int getIdTrabajador() {
        return idTrabajador;
    }

    public void setIdTrabajador(int idTrabajador) {
        this.idTrabajador = idTrabajador;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApePater() {
        return apePater;
    }

    public void setApePater(String apePater) {
        this.apePater = apePater;
    }

    public String getApeMater() {
        return apeMater;
    }

    public void setApeMater(String apeMater) {
        this.apeMater = apeMater;
    }
}
