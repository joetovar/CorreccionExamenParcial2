package ec.edu.espe.arquitectura.correccion.model;

import java.util.List;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import ec.edu.espe.arquitectura.correccion.dto.empleadoDto;


@Document(collection = "empresa")
public class empresa {

    @Id
    private String RUC;
    private String razonSocial;
    private String cuentaPrincipal;
    private List<empleadoDto> empleados;

    public empresa() {
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

    public void setEmpleados(List<empleadoDto> list) {
        this.empleados = list;
    }

    public empresa(String rUC, String razonSocial, String cuentaPrincipal, List<empleadoDto> empleados) {
        RUC = rUC;
        this.razonSocial = razonSocial;
        this.cuentaPrincipal = cuentaPrincipal;
        this.empleados = empleados;
    }
}
