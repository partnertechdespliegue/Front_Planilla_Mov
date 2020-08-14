package com.app.partner.plan.Model.Request.DTO;

import com.app.partner.plan.Model.Request.MODEL.AdelantoSueldoMODEL;
import com.app.partner.plan.Model.Request.MODEL.CuotaAdelantoMODEL;
import com.app.partner.plan.Model.Request.MODEL.EmpresaMODEL;
import com.app.partner.plan.Model.Request.MODEL.PdoAnoMODEL;
import com.app.partner.plan.Model.Request.MODEL.PdoMesMODEL;
import com.app.partner.plan.Model.Request.MODEL.TrabajadorMODEL;

public class AdelantoSueldoDTO {

    private TrabajadorMODEL trabajador;
    private AdelantoSueldoMODEL adelantoSueldo;
    private CuotaAdelantoMODEL cuotaAdelanto;
    private PdoAnoMODEL pdoAno;
    private PdoMesMODEL pdoMes;
    private EmpresaMODEL empresa;

    public AdelantoSueldoDTO() {
    }

    public AdelantoSueldoDTO(TrabajadorMODEL trabajador, AdelantoSueldoMODEL adelantoSueldo, CuotaAdelantoMODEL cuotaAdelanto, PdoAnoMODEL pdoAno, PdoMesMODEL pdoMes, EmpresaMODEL empresa) {
        this.trabajador = trabajador;
        this.adelantoSueldo = adelantoSueldo;
        this.cuotaAdelanto = cuotaAdelanto;
        this.pdoAno = pdoAno;
        this.pdoMes = pdoMes;
        this.empresa = empresa;
    }

    public TrabajadorMODEL getTrabajador() {
        return trabajador;
    }

    public void setTrabajador(TrabajadorMODEL trabajador) {
        this.trabajador = trabajador;
    }

    public AdelantoSueldoMODEL getAdelantoSueldo() {
        return adelantoSueldo;
    }

    public void setAdelantoSueldo(AdelantoSueldoMODEL adelantoSueldo) {
        this.adelantoSueldo = adelantoSueldo;
    }

    public CuotaAdelantoMODEL getCuotaAdelanto() {
        return cuotaAdelanto;
    }

    public void setCuotaAdelanto(CuotaAdelantoMODEL cuotaAdelanto) {
        this.cuotaAdelanto = cuotaAdelanto;
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

    public EmpresaMODEL getEmpresa() {
        return empresa;
    }

    public void setEmpresa(EmpresaMODEL empresa) {
        this.empresa = empresa;
    }
}
