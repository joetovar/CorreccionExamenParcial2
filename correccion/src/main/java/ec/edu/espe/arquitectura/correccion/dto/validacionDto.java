package ec.edu.espe.arquitectura.correccion.dto;

import java.math.BigDecimal;

public class validacionDto {
    private String mes;
    private String rucEmpresa;
    private BigDecimal valorTotal;
    private BigDecimal valorReal;
    private int totalTransacciones;
    private Integer errores;
    public validacionDto() {
    }
    public String getMes() {
        return mes;
    }
    public void setMes(String mes) {
        this.mes = mes;
    }
    public String getRucEmpresa() {
        return rucEmpresa;
    }
    public void setRucEmpresa(String rucEmpresa) {
        this.rucEmpresa = rucEmpresa;
    }
    public BigDecimal getValorTotal() {
        return valorTotal;
    }
    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }
    public BigDecimal getValorReal() {
        return valorReal;
    }
    public void setValorReal(BigDecimal valorReal) {
        this.valorReal = valorReal;
    }
    public int getTotalTransacciones() {
        return totalTransacciones;
    }
    public void setTotalTransacciones(int totalTransacciones) {
        this.totalTransacciones = totalTransacciones;
    }
    public Integer getErrores() {
        return errores;
    }
    public void setErrores(Integer errores) {
        this.errores = errores;
    }
    public validacionDto(String mes, String rucEmpresa, BigDecimal valorTotal, BigDecimal valorReal,
            int totalTransacciones, Integer errores) {
        this.mes = mes;
        this.rucEmpresa = rucEmpresa;
        this.valorTotal = valorTotal;
        this.valorReal = valorReal;
        this.totalTransacciones = totalTransacciones;
        this.errores = errores;
    }
    
    

}