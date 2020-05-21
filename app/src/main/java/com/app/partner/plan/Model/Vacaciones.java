package com.app.partner.plan.Model;

public class Vacaciones {

    private String descripcion;
    private int estado;

    public Vacaciones() {
    }

    public Vacaciones(String descripcion, int estado) {
        this.descripcion = descripcion;
        this.estado = estado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
}
