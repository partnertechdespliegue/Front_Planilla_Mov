package com.app.partner.plan.Model.Request.MODEL;

public class EncargadoPlanillaMODEL {
    private int idEncargadoPlanilla;
    private int estado;
    private TrabajadorMODEL trabajador;
    private EmpresaMODEL empresa;

    public EncargadoPlanillaMODEL() {
    }

    public EncargadoPlanillaMODEL(int idEncargadoPlanilla, int estado, TrabajadorMODEL trabajador, EmpresaMODEL empresa) {
        this.idEncargadoPlanilla = idEncargadoPlanilla;
        this.estado = estado;
        this.trabajador = trabajador;
        this.empresa = empresa;
    }

    public int getIdEncargadoPlanilla() {
        return idEncargadoPlanilla;
    }

    public void setIdEncargadoPlanilla(int idEncargadoPlanilla) {
        this.idEncargadoPlanilla = idEncargadoPlanilla;
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

    public EmpresaMODEL getEmpresa() {
        return empresa;
    }

    public void setEmpresa(EmpresaMODEL empresa) {
        this.empresa = empresa;
    }
}
