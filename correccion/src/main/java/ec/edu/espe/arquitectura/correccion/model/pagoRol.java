package ec.edu.espe.arquitectura.correccion.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import ec.edu.espe.arquitectura.correccion.dto.empleadoPagoDto;

@Document(collection = "pagoRol")
public class pagoRol {

@Id
    private String mes;
    private Date fechaProceso;
    private String rucEmpresa;
    private String cuentaPrincipal;
    private BigDecimal valorTotal;
    private BigDecimal valorReal;
    private List<empleadoPagoDto> empleadosPago;
    public pagoRol() {
    }
    public String getMes() {
        return mes;
    }
    public void setMes(String mes) {
        this.mes = mes;
    }
    public Date getFechaProceso() {
        return fechaProceso;
    }
    public void setFechaProceso(Date fechaProceso) {
        this.fechaProceso = fechaProceso;
    }
    public String getRucEmpresa() {
        return rucEmpresa;
    }
    public void setRucEmpresa(String rucEmpresa) {
        this.rucEmpresa = rucEmpresa;
    }
    public String getCuentaPrincipal() {
        return cuentaPrincipal;
    }
    public void setCuentaPrincipal(String cuentaPrincipal) {
        this.cuentaPrincipal = cuentaPrincipal;
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
    public List<empleadoPagoDto> getEmpleadosPago() {
        return empleadosPago;
    }
    public void setEmpleadosPago(List<empleadoPagoDto> list) {
        this.empleadosPago = list;
    }
    public pagoRol(String mes, Date fechaProceso, String rucEmpresa, String cuentaPrincipal, BigDecimal valorTotal,
            BigDecimal valorReal, List<empleadoPagoDto> empleadosPago) {
        this.mes = mes;
        this.fechaProceso = fechaProceso;
        this.rucEmpresa = rucEmpresa;
        this.cuentaPrincipal = cuentaPrincipal;
        this.valorTotal = valorTotal;
        this.valorReal = valorReal;
        this.empleadosPago = empleadosPago;
    }
    

}
