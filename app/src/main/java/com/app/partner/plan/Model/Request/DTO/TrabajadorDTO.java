package com.app.partner.plan.Model.Request.DTO;

import com.app.partner.plan.Model.Request.MODEL.ContratoMODEL;
import com.app.partner.plan.Model.Request.MODEL.TrabajadorMODEL;

public class TrabajadorDTO {

    private TrabajadorMODEL trabajadorMODEL;

    private ContratoMODEL contratoMODEL;

    public TrabajadorDTO() {
    }

    public TrabajadorDTO(TrabajadorMODEL trabajadorMODEL, ContratoMODEL contratoMODEL) {
        this.trabajadorMODEL = trabajadorMODEL;
        this.contratoMODEL = contratoMODEL;
    }

    public TrabajadorDTO(ContratoMODEL contratoMODEL) {
        this.contratoMODEL = contratoMODEL;
    }

    public ContratoMODEL getContratoMODEL() {
        return contratoMODEL;
    }

    public void setContratoMODEL(ContratoMODEL contratoMODEL) {
        this.contratoMODEL = contratoMODEL;
    }

    public TrabajadorMODEL getTrabajadorMODEL() {
        return trabajadorMODEL;
    }

    public void setTrabajadorMODEL(TrabajadorMODEL trabajadorMODEL) {
        this.trabajadorMODEL = trabajadorMODEL;
    }
}
