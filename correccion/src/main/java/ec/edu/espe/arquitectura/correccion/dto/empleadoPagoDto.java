package ec.edu.espe.arquitectura.correccion.dto;

import java.math.BigDecimal;

public class empleadoPagoDto {

    private String numeroCuenta;
    private BigDecimal valor;
    public empleadoPagoDto() {
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
    public empleadoPagoDto(String numeroCuenta, BigDecimal valor) {
        this.numeroCuenta = numeroCuenta;
        this.valor = valor;
    }

}
