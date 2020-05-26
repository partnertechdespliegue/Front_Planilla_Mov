package com.app.partner.plan.Model.Response;

public class ResponseBoletas {
    private int idContrato;

    public ResponseBoletas(int idContrato) {
        this.idContrato = idContrato;
    }

    public ResponseBoletas() {
    }

    public int getIdContrato() {
        return idContrato;
    }

    public void setIdContrato(int idContrato) {
        this.idContrato = idContrato;
    }
}
