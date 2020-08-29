package com.app.partner.plan.Model.Request.MODEL;

import java.sql.Timestamp;
import java.util.List;

public class TrabajadorMODEL {

    private int idTrabajador;
    private String nombres;
    private String apePater;
    private String apeMater;
    private String nroDoc;
    private String fecNac;
    private String sexo;
    private String correo;
    private String nroCel;
    private String direccion;
    private String nomZona;
    private String referencia;
    private int nroHij;
    private String fecRegPens;
    private String nroCuspp;//////////////////////////
    private Timestamp fecIngrSalud;///////////////////////
    private String nroEssalud;
    private int essaludVida;
    private int afilAseguPens;
    private int epsServProp;
    private int comiMixta;
    private String foto;
    private Boolean estado;/////////////////////
    private TipoDocMODEL tipoDoc;
    private PaisMODEL pais;///////////////////
    private EstadoCivilMODEL estadoCivil;
    private DepartamentoMODEL departamento;
    private ProvinciaMODEL provincia;
    private DistritoMODEL distrito;
    private TipoZonaMODEL tipoZona;
    private NivelEduMODEL nivelEdu;
    private OcupacionMODEL ocupacion;
    private EmpresaMODEL empresa;
    private AFPMODEL afp;///////////////////////
    private EPSMODEL eps;///////////////////
    private RegSaludMODEL regSalud;///////////////////////
    private SituacionMODEL situacion;
    private HorarioMODEL horario;
    /*private List<ContratoMODEL> lsContrato;/////////////////////
    private List<DerechoHabientesMODEL> lsderechoHabiente;/////////////////////////
    private SuspencionMODEL suspencion;//////////////
    private List<RheMODEL> rhe;///////////////////
    private EncargadoPlanillaMODEL encargadoPlanilla;/////////////////////
    private List<SolicitudMODEL> lsSolicitud;//////////////////
*/
    public TrabajadorMODEL() {
    }



    @Override
    public String toString(){

        return "Id: '" + this.idTrabajador + "', Nombre: '" + this.nombres + "', ApellidoP: '" +
                this.apePater + "'" + "', Apellido Mater: '" + this.apeMater + "'" + "', Numero doc: '" +
                this.nroDoc + "'" + "', Fecha N: '" + this.fecNac + "'" + "', Sexo: '" +
                this.sexo + "'" + "', Correo: '" + this.correo + "'" + "', Numero Cel: '" +
                this.nroCel + "'" + "', Direccion: '" + this.direccion + "'" + "', Nom Zona: '" +
                this.nomZona + "'" + "', Referencia: '" + this.referencia + "'" + "', Nro hijos: '" +
                this.nroHij + "'" + "', FecReg: '" + this.fecRegPens + "'" + "', Nro cuspp: '" +
                this.nroCuspp + "'" + "', fecIngrSalud: '" + this.fecIngrSalud + "'" + "', Numero essalud: '" +
                this.nroEssalud + "'" + "', EssaludVida: '" + this.essaludVida + "'" + "', afilAseguPens: '" +
                this.afilAseguPens + "'" + "', Eps: '" + this.epsServProp + "'" + "', comiMixta: '" +
                this.comiMixta + "'" + "', Foto: '" + this.foto + "'" + "', estado: '" +
                this.estado + "'" + "', tipoDoc descripcion: '" + this.tipoDoc.getDescripcion() + "'" + "', Tipo doc id: '" +
                this.tipoDoc.getIdTipoDoc() + "'" + "', pais: '" + this.pais + "'" + "', estado civil id: '" +
                this.estadoCivil.getIdEstadoCivil() + "'" + "', estadoC descipcion: '" + this.estadoCivil.getDescripcion() + "'" + "', departamentoId: '" +
                this.departamento.getIdDepartamento() + "'" + "', departamentoDescr: '" + this.departamento.getDescripcion() + "'" + "', provincia id: '" +

                this.provincia.getIdProvincia() + "'" + "', provincia descip: '" + this.provincia.getDescripcion() + "'" + "', distrito: '" +
                this.distrito + "'" + "', TipoZona: '" + this.tipoZona + "'" + "', NivelEdu: '" +
                this.nivelEdu + "'" + "', Ocupacion: '" + this.ocupacion + "'" + "', empresa: '" +
                this.empresa + "'" + "', afp: '" + this.afp + "'" + "', eps: '" +
                this.eps + "'" + "', regsalud: '" + this.regSalud + "'" + "', Situacion: '" +
                this.situacion + "'" + "', horario: '" +
                this.horario + "'";

    }
    public TrabajadorMODEL(int idTrabajador) {
        this.idTrabajador = idTrabajador;
    }

    //public TrabajadorMODEL(TrabajadorMODEL trabajadorMODEL){
    //}

    public TrabajadorMODEL(int idTrabajador, String nombres, String apePater, String apeMater, String nroDoc, String fecNac, String sexo, String correo, String nroCel, String direccion, String nomZona, String referencia, int nroHij, String fecRegPens, String nroCuspp, Timestamp fecIngrSalud, String nroEssalud, int essaludVida, int afilAseguPens, int epsServProp, int comiMixta, String foto, Boolean estado, TipoDocMODEL tipoDoc, PaisMODEL pais, EstadoCivilMODEL estadoCivil, DepartamentoMODEL departamento, ProvinciaMODEL provincia, DistritoMODEL distrito, TipoZonaMODEL tipoZona, NivelEduMODEL nivelEdu, OcupacionMODEL ocupacion, EmpresaMODEL empresa, AFPMODEL afp, EPSMODEL eps, RegSaludMODEL regSalud, SituacionMODEL situacion, HorarioMODEL horario) {
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
        this.foto = foto;
        this.estado = estado;
        this.tipoDoc = tipoDoc;
        this.pais = pais;
        this.estadoCivil = estadoCivil;
        this.departamento = departamento;
        this.provincia = provincia;
        this.distrito = distrito;
        this.tipoZona = tipoZona;
        this.nivelEdu = nivelEdu;
        this.ocupacion = ocupacion;
        this.empresa = empresa;
        this.afp = afp;
        this.eps = eps;
        this.regSalud = regSalud;
        this.situacion = situacion;
        this.horario = horario;
    }

    public TrabajadorMODEL(int idTrabajador, String nombres, String apePater, String apeMater, String nroDoc, String fecNac, String sexo, String correo, String nroCel, String direccion, String nomZona, String referencia, int nroHij, String fecRegPens, int essaludVida, int afilAseguPens, int epsServProp, int comiMixta, String foto, TipoDocMODEL tipoDoc, EstadoCivilMODEL estadoCivil, DepartamentoMODEL departamento, ProvinciaMODEL provincia, DistritoMODEL distrito, TipoZonaMODEL tipoZona, NivelEduMODEL nivelEdu, OcupacionMODEL ocupacion, EmpresaMODEL empresa, SituacionMODEL situacion, HorarioMODEL horario) {
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
        this.essaludVida = essaludVida;
        this.afilAseguPens = afilAseguPens;
        this.epsServProp = epsServProp;
        this.comiMixta = comiMixta;
        this.foto = foto;
        this.tipoDoc = tipoDoc;
        this.estadoCivil = estadoCivil;
        this.departamento = departamento;
        this.provincia = provincia;
        this.distrito = distrito;
        this.tipoZona = tipoZona;
        this.nivelEdu = nivelEdu;
        this.ocupacion = ocupacion;
        this.empresa = empresa;
        this.situacion = situacion;
        this.horario = horario;
    }

    public TrabajadorMODEL(TrabajadorMODEL p) {
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

    public String getFecNac() {
        return fecNac;
    }

    public void setFecNac(String fecNac) {
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

    public String getFecRegPens() {
        return fecRegPens;
    }

    public void setFecRegPens(String fecRegPens) {
        this.fecRegPens = fecRegPens;
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

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public TipoDocMODEL getTipoDoc() {
        return tipoDoc;
    }

    public void setTipoDoc(TipoDocMODEL tipoDoc) {
        this.tipoDoc = tipoDoc;
    }

    public EstadoCivilMODEL getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivilMODEL estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public DepartamentoMODEL getDepartamento() {
        return departamento;
    }

    public void setDepartamento(DepartamentoMODEL departamento) {
        this.departamento = departamento;
    }

    public ProvinciaMODEL getProvincia() {
        return provincia;
    }

    public void setProvincia(ProvinciaMODEL provincia) {
        this.provincia = provincia;
    }

    public DistritoMODEL getDistrito() {
        return distrito;
    }

    public void setDistrito(DistritoMODEL distrito) {
        this.distrito = distrito;
    }

    public TipoZonaMODEL getTipoZona() {
        return tipoZona;
    }

    public void setTipoZona(TipoZonaMODEL tipoZona) {
        this.tipoZona = tipoZona;
    }

    public NivelEduMODEL getNivelEdu() {
        return nivelEdu;
    }

    public void setNivelEdu(NivelEduMODEL nivelEdu) {
        this.nivelEdu = nivelEdu;
    }

    public OcupacionMODEL getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(OcupacionMODEL ocupacion) {
        this.ocupacion = ocupacion;
    }

    public EmpresaMODEL getEmpresa() {
        return empresa;
    }

    public void setEmpresa(EmpresaMODEL empresa) {
        this.empresa = empresa;
    }

    public SituacionMODEL getSituacion() {
        return situacion;
    }

    public void setSituacion(SituacionMODEL situacion) {
        this.situacion = situacion;
    }

    public HorarioMODEL getHorario() {
        return horario;
    }

    public void setHorario(HorarioMODEL horario) {
        this.horario = horario;
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

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public PaisMODEL getPais() {
        return pais;
    }

    public void setPais(PaisMODEL pais) {
        this.pais = pais;
    }

    public AFPMODEL getAfp() {
        return afp;
    }

    public void setAfp(AFPMODEL afp) {
        this.afp = afp;
    }

    public EPSMODEL getEps() {
        return eps;
    }

    public void setEps(EPSMODEL eps) {
        this.eps = eps;
    }

    public RegSaludMODEL getRegSalud() {
        return regSalud;
    }

    public void setRegSalud(RegSaludMODEL regSalud) {
        this.regSalud = regSalud;
    }

   /* public List<ContratoMODEL> getLsContrato() {
        return lsContrato;
    }

    public void setLsContrato(List<ContratoMODEL> lsContrato) {
        this.lsContrato = lsContrato;
    }

    public List<DerechoHabientesMODEL> getLsderechoHabiente() {
        return lsderechoHabiente;
    }

    public void setLsderechoHabiente(List<DerechoHabientesMODEL> lsderechoHabiente) {
        this.lsderechoHabiente = lsderechoHabiente;
    }

    public SuspencionMODEL getSuspencion() {
        return suspencion;
    }

    public void setSuspencion(SuspencionMODEL suspencion) {
        this.suspencion = suspencion;
    }

    public List<RheMODEL> getRhe() {
        return rhe;
    }

    public void setRhe(List<RheMODEL> rhe) {
        this.rhe = rhe;
    }

    public EncargadoPlanillaMODEL getEncargadoPlanilla() {
        return encargadoPlanilla;
    }

    public void setEncargadoPlanilla(EncargadoPlanillaMODEL encargadoPlanilla) {
        this.encargadoPlanilla = encargadoPlanilla;
    }

    public List<SolicitudMODEL> getLsSolicitud() {
        return lsSolicitud;
    }

    public void setLsSolicitud(List<SolicitudMODEL> lsSolicitud) {
        this.lsSolicitud = lsSolicitud;
    }*/
}
