package com.app.partner.plan.Model.Request;

public class PlanillaHistorico {

    private PdoAno pdoAno;
    private PdoMes pdoMes;
    // private Integer idPlanillaHistorico;
    //private Integer diaFerdo;
  //  private Integer faltaJusti;
  //  private Double remFaltaJusti;
  //  private Integer faltaInjusti;
  //  private Double dsctFaltaInjusti;
  //  private Integer tiempo_tardanza;
  //  private Double remFerdo;
  //  private Integer diaCompbl;
  //  private Double hoExt25;
  //  private Double remHoExt25;
   // private Double hoExt35;
   // private Double remHoExt35;
   // private Double remHoraNoctur;
  //  private Integer diaFerdoLabo;
  //  private Double remDiaFerdoLabo;
  //  private Double remJorNorm;
   // private Double asigFam;
   // private Double remGrati;
   // private Integer diaVaca;
   // private Double remVacaVend;
   // private Double cts;
   // private Double remDiaVaca;
    //private Double tot_comp;
//    private Double movilidad;
  //  private Double totIngre;
   // private Double dsctFondObl;
  //  private Double dsctComSobFLu;
  //  private Double dsctComMixSobFlu;
  //  private Double dsctComMixAnualSal;
  //  private Double dsctPriSeg;
  //  private Double dsctOnp;


    public PlanillaHistorico() {
    }

    public PlanillaHistorico(PdoAno pdoAno, PdoMes pdoMes) {
        this.pdoAno = pdoAno;
        this.pdoMes = pdoMes;
    }

    public PdoAno getPdoAno() {
        return pdoAno;
    }

    public void setPdoAno(PdoAno pdoAno) {
        this.pdoAno = pdoAno;
    }

    public PdoMes getPdoMes() {
        return pdoMes;
    }

    public void setPdoMes(PdoMes pdoMes) {
        this.pdoMes = pdoMes;
    }

    /*
    private Contrato contrato;
    private Afp afp;
    private PdoAno pdoAno;
    private PdoMes pdoMes;
    private Parametro tipoTardanza;
    private Parametro claseTipoTardanza;*/
}
