package com.app.partner.plan.Model.Request.DTO;

import com.app.partner.plan.Model.Request.MODEL.ContratoMODEL;

public class TrabajadorDTO {

    private ContratoMODEL contratoMODEL;

    public TrabajadorDTO() {
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


}
