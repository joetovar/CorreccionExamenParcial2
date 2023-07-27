package ec.edu.espe.arquitectura.correccion.model;

import java.math.BigDecimal;

public class empleadoPago {

private String numeroCuenta;
    private BigDecimal valor;
    private String estado;
    public empleadoPago() {
    }
    public String getNumeroCuenta() {
        return numeroCuenta;
    }
    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
    public BigDecimal getValor() {
        return valor;
    }
    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public empleadoPago(String numeroCuenta, BigDecimal valor, String estado) {
        this.numeroCuenta = numeroCuenta;
        this.valor = valor;
        this.estado = estado;
    }

}
