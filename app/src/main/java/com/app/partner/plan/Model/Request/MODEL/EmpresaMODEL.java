package com.app.partner.plan.Model.Request.MODEL;

public class EmpresaMODEL {
    private int idEmpresa;
    private String razonSocial;
    private String ruc;
    private String ubicacion;
    private int estado;
    private String fechaRegistro;
    private int sector;
    private String urlImagen;///////////////
    private String logo;/////////////////
    private int companyLimit;////////////////
    private RegTribMODEL regTribMODEL;
    private int limiteAutorizacion;////////////////
    private TipoEmpMODEL tipoEmpMODEL;

    public EmpresaMODEL() {
    }


    public EmpresaMODEL(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public EmpresaMODEL(int idEmpresa, String razonSocial, String ruc, String ubicacion, int estado, String fechaRegistro, int sector, String urlImagen, String logo, int companyLimit, RegTribMODEL regTribMODEL, int limiteAutorizacion, TipoEmpMODEL tipoEmpMODEL) {
        this.idEmpresa = idEmpresa;
        this.razonSocial = razonSocial;
        this.ruc = ruc;
        this.ubicacion = ubicacion;
        this.estado = estado;
        this.fechaRegistro = fechaRegistro;
        this.sector = sector;
        this.urlImagen = urlImagen;
        this.logo = logo;
        this.companyLimit = companyLimit;
        this.regTribMODEL = regTribMODEL;
        this.limiteAutorizacion = limiteAutorizacion;
        this.tipoEmpMODEL = tipoEmpMODEL;
    }

    public EmpresaMODEL(int idEmpresa, String razonSocial, String ruc, String ubicacion, int estado, String fechaRegistro, int sector, RegTribMODEL regTribMODEL, TipoEmpMODEL tipoEmpMODEL) {
        this.idEmpresa = idEmpresa;
        this.razonSocial = razonSocial;
        this.ruc = ruc;
        this.ubicacion = ubicacion;
        this.estado = estado;
        this.fechaRegistro = fechaRegistro;
        this.sector = sector;
        this.regTribMODEL = regTribMODEL;
        this.tipoEmpMODEL = tipoEmpMODEL;
    }

    public int getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public int getSector() {
        return sector;
    }

    public void setSector(int sector) {
        this.sector = sector;
    }

    public RegTribMODEL getRegTribMODEL() {
        return regTribMODEL;
    }

    public void setRegTribMODEL(RegTribMODEL regTribMODEL) {
        this.regTribMODEL = regTribMODEL;
    }

    public TipoEmpMODEL getTipoEmpMODEL() {
        return tipoEmpMODEL;
    }

    public void setTipoEmpMODEL(TipoEmpMODEL tipoEmpMODEL) {
        this.tipoEmpMODEL = tipoEmpMODEL;
    }

    public String getUrlImagen() {
        return urlImagen;
    }

    public void setUrlImagen(String urlImagen) {
        this.urlImagen = urlImagen;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public int getCompanyLimit() {
        return companyLimit;
    }

    public void setCompanyLimit(int companyLimit) {
        this.companyLimit = companyLimit;
    }

    public int getLimiteAutorizacion() {
        return limiteAutorizacion;
    }

    public void setLimiteAutorizacion(int limiteAutorizacion) {
        this.limiteAutorizacion = limiteAutorizacion;
    }
}
