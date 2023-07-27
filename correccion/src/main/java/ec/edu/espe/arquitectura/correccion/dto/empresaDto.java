package ec.edu.espe.arquitectura.correccion.dto;

import java.util.List;

public class empresaDto {
    private String RUC;
    private String razonSocial;
    private String cuentaPrincipal;
    private List<empleadoDto> empleados;
    public empresaDto() {
    }
    public String getRUC() {
        return RUC;
    }
    public void setRUC(String rUC) {
        RUC = rUC;
    }
    public String getRazonSocial() {
        return razonSocial;
    }
    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }
    public String getCuentaPrincipal() {
        return cuentaPrincipal;
    }
    public void setCuentaPrincipal(String cuentaPrincipal) {
        this.cuentaPrincipal = cuentaPrincipal;
    }
    public List<empleadoDto> getEmpleados() {
        return empleados;
    }
    public void setEmpleados(List<empleadoDto> empleados) {
        this.empleados = empleados;
    }
    public empresaDto(String rUC, String razonSocial, String cuentaPrincipal, List<empleadoDto> empleados) {
        RUC = rUC;
        this.razonSocial = razonSocial;
        this.cuentaPrincipal = cuentaPrincipal;
        this.empleados = empleados;
    }
    
    
}
