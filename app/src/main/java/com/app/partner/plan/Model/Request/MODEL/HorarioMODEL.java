package com.app.partner.plan.Model.Request.MODEL;

public class HorarioMODEL {

    private int idHorario;
    private String horIniDia;
    private String horFinDia;
    private String horAlmuerIni;
    private String horAlmuerFin;
    private String descripcion;
    private boolean estado;
    private boolean checkLunes;
    private boolean checkMartes;
    private boolean checkMiercoles;
    private boolean checkJueves;
    private boolean checkViernes;
    private boolean checkSabado;
    private boolean checkDomingo;
    private String totalDias;
    private EmpresaMODEL empresaMODEL;

    public HorarioMODEL() {
    }

    public HorarioMODEL(int idHorario) {
        this.idHorario = idHorario;
    }

    public HorarioMODEL(int idHorario, String horIniDia, String horFinDia, String horAlmuerIni, String horAlmuerFin, String descripcion, boolean estado, boolean checkLunes, boolean checkMartes, boolean checkMiercoles, boolean checkJueves, boolean checkViernes, boolean checkSabado, boolean checkDomingo, String totalDias, EmpresaMODEL empresaMODEL) {
        this.idHorario = idHorario;
        this.horIniDia = horIniDia;
        this.horFinDia = horFinDia;
        this.horAlmuerIni = horAlmuerIni;
        this.horAlmuerFin = horAlmuerFin;
        this.descripcion = descripcion;
        this.estado = estado;
        this.checkLunes = checkLunes;
        this.checkMartes = checkMartes;
        this.checkMiercoles = checkMiercoles;
        this.checkJueves = checkJueves;
        this.checkViernes = checkViernes;
        this.checkSabado = checkSabado;
        this.checkDomingo = checkDomingo;
        this.totalDias = totalDias;
        this.empresaMODEL = empresaMODEL;
    }

    public int getIdHorario() {
        return idHorario;
    }

    public void setIdHorario(int idHorario) {
        this.idHorario = idHorario;
    }

    public String getHorIniDia() {
        return horIniDia;
    }

    public void setHorIniDia(String horIniDia) {
        this.horIniDia = horIniDia;
    }

    public String getHorFinDia() {
        return horFinDia;
    }

    public void setHorFinDia(String horFinDia) {
        this.horFinDia = horFinDia;
    }

    public String getHorAlmuerIni() {
        return horAlmuerIni;
    }

    public void setHorAlmuerIni(String horAlmuerIni) {
        this.horAlmuerIni = horAlmuerIni;
    }

    public String getHorAlmuerFin() {
        return horAlmuerFin;
    }

    public void setHorAlmuerFin(String horAlmuerFin) {
        this.horAlmuerFin = horAlmuerFin;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public boolean isCheckLunes() {
        return checkLunes;
    }

    public void setCheckLunes(boolean checkLunes) {
        this.checkLunes = checkLunes;
    }

    public boolean isCheckMartes() {
        return checkMartes;
    }

    public void setCheckMartes(boolean checkMartes) {
        this.checkMartes = checkMartes;
    }

    public boolean isCheckMiercoles() {
        return checkMiercoles;
    }

    public void setCheckMiercoles(boolean checkMiercoles) {
        this.checkMiercoles = checkMiercoles;
    }

    public boolean isCheckJueves() {
        return checkJueves;
    }

    public void setCheckJueves(boolean checkJueves) {
        this.checkJueves = checkJueves;
    }

    public boolean isCheckViernes() {
        return checkViernes;
    }

    public void setCheckViernes(boolean checkViernes) {
        this.checkViernes = checkViernes;
    }

    public boolean isCheckSabado() {
        return checkSabado;
    }

    public void setCheckSabado(boolean checkSabado) {
        this.checkSabado = checkSabado;
    }

    public boolean isCheckDomingo() {
        return checkDomingo;
    }

    public void setCheckDomingo(boolean checkDomingo) {
        this.checkDomingo = checkDomingo;
    }

    public String getTotalDias() {
        return totalDias;
    }

    public void setTotalDias(String totalDias) {
        this.totalDias = totalDias;
    }

    public EmpresaMODEL getEmpresaMODEL() {
        return empresaMODEL;
    }

    public void setEmpresaMODEL(EmpresaMODEL empresaMODEL) {
        this.empresaMODEL = empresaMODEL;
    }
}
