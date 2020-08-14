package com.app.partner.plan.Model.Response;

import com.app.partner.plan.Model.Request.DTO.PlanillaHistoricoDTO;

import java.util.List;

public class ResponseBoletas {
    private List<PlanillaHistoricoDTO> aaData;
    private int estado;
    private String msg;

    public ResponseBoletas() {
    }

    public ResponseBoletas(List<PlanillaHistoricoDTO> aaData, int estado, String msg) {
        this.aaData = aaData;
        this.estado = estado;
        this.msg = msg;
    }

    public List<PlanillaHistoricoDTO> getAaData() {
        return aaData;
    }

    public void setAaData(List<PlanillaHistoricoDTO> aaData) {
        this.aaData = aaData;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
