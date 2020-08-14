package com.app.partner.plan.Model.Request.DTO;

import com.app.partner.plan.Model.Request.MODEL.PdoAnoMODEL;
import com.app.partner.plan.Model.Request.MODEL.PdoMesMODEL;

public class PlanillaHistoricoDTO {


    private PdoAnoMODEL pdoAnoMODEL;
    private PdoMesMODEL pdoMesMODEL;

    public PlanillaHistoricoDTO() {
    }

    public PlanillaHistoricoDTO(PdoAnoMODEL pdoAnoMODEL, PdoMesMODEL pdoMesMODEL) {
        this.pdoAnoMODEL = pdoAnoMODEL;
        this.pdoMesMODEL = pdoMesMODEL;
    }


    public PdoAnoMODEL getPdoAnoMODEL() {
        return pdoAnoMODEL;
    }

    public void setPdoAnoMODEL(PdoAnoMODEL pdoAnoMODEL) {
        this.pdoAnoMODEL = pdoAnoMODEL;
    }

    public PdoMesMODEL getPdoMesMODEL() {
        return pdoMesMODEL;
    }

    public void setPdoMesMODEL(PdoMesMODEL pdoMesMODEL) {
        this.pdoMesMODEL = pdoMesMODEL;
    }

}
