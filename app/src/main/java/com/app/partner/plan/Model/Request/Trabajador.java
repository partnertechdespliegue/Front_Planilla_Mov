package com.app.partner.plan.Model.Request;

import java.sql.Timestamp;

public class Trabajador {

    private Contrato contrato;

    public Trabajador() {
    }

    public Trabajador(Contrato contrato) {
        this.contrato = contrato;
    }

    public Contrato getContrato() {
        return contrato;
    }

    public void setContrato(Contrato contrato) {
        this.contrato = contrato;
    }

    /*
    public	int idTrabajador;
    public String nombres;
    public String apePater;
    public String apeMater;
    public String nroDoc;
    public Timestamp fecNac;
    public String sexo;
    public String correo;
    public String nroCel;
    public String direccion;
    public String nomZona;
    public String referencia;
    public int nroHij;
    public Timestamp fecRegPens;
    public String nroCuspp;
    public Timestamp fecIngrSalud;
    public String nroEssalud;
    public int essaludVida;
    public int afilAseguPens;
    public int epsServProp;
    public int comiMixta;
    public String accion;
    public boolean estado;

    public Trabajador() {
    }

    public Trabajador(int idTrabajador, String nombres, String apePater, String apeMater, String nroDoc, Timestamp fecNac, String sexo, String correo, String nroCel, String direccion, String nomZona, String referencia, int nroHij, Timestamp fecRegPens, String nroCuspp, Timestamp fecIngrSalud, String nroEssalud, int essaludVida, int afilAseguPens, int epsServProp, int comiMixta, String accion, boolean estado) {
        this.idTrabajador = idTrabajador;
        this.nombres = nombres;
        this.apePater = apePater;
        this.apeMater = apeMater;
        this.nroDoc = nroDoc;
        this.fecNac = fecNac;
        this.sexo = sexo;
        this.correo = correo;
        this.nroCel = nroCel;
        this.direccion = direccion;
        this.nomZona = nomZona;
        this.referencia = referencia;
        this.nroHij = nroHij;
        this.fecRegPens = fecRegPens;
        this.nroCuspp = nroCuspp;
        this.fecIngrSalud = fecIngrSalud;
        this.nroEssalud = nroEssalud;
        this.essaludVida = essaludVida;
        this.afilAseguPens = afilAseguPens;
        this.epsServProp = epsServProp;
        this.comiMixta = comiMixta;
        this.accion = accion;
        this.estado = estado;
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

    public String getNroDoc() {
        return nroDoc;
    }

    public void setNroDoc(String nroDoc) {
        this.nroDoc = nroDoc;
    }

    public Timestamp getFecNac() {
        return fecNac;
    }

    public void setFecNac(Timestamp fecNac) {
        this.fecNac = fecNac;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNroCel() {
        return nroCel;
    }

    public void setNroCel(String nroCel) {
        this.nroCel = nroCel;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNomZona() {
        return nomZona;
    }

    public void setNomZona(String nomZona) {
        this.nomZona = nomZona;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public int getNroHij() {
        return nroHij;
    }

    public void setNroHij(int nroHij) {
        this.nroHij = nroHij;
    }

    public Timestamp getFecRegPens() {
        return fecRegPens;
    }

    public void setFecRegPens(Timestamp fecRegPens) {
        this.fecRegPens = fecRegPens;
    }

    public String getNroCuspp() {
        return nroCuspp;
    }

    public void setNroCuspp(String nroCuspp) {
        this.nroCuspp = nroCuspp;
    }

    public Timestamp getFecIngrSalud() {
        return fecIngrSalud;
    }

    public void setFecIngrSalud(Timestamp fecIngrSalud) {
        this.fecIngrSalud = fecIngrSalud;
    }

    public String getNroEssalud() {
        return nroEssalud;
    }

    public void setNroEssalud(String nroEssalud) {
        this.nroEssalud = nroEssalud;
    }

    public int getEssaludVida() {
        return essaludVida;
    }

    public void setEssaludVida(int essaludVida) {
        this.essaludVida = essaludVida;
    }

    public int getAfilAseguPens() {
        return afilAseguPens;
    }

    public void setAfilAseguPens(int afilAseguPens) {
        this.afilAseguPens = afilAseguPens;
    }

    public int getEpsServProp() {
        return epsServProp;
    }

    public void setEpsServProp(int epsServProp) {
        this.epsServProp = epsServProp;
    }

    public int getComiMixta() {
        return comiMixta;
    }

    public void setComiMixta(int comiMixta) {
        this.comiMixta = comiMixta;
    }

    public String getAccion() {
        return accion;
    }

    public void setAccion(String accion) {
        this.accion = accion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }*/
}
