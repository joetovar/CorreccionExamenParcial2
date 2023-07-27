package ec.edu.espe.arquitectura.correccion.model;

public class empleado {

    private String cedulaIdentidad;
    private String apellidos;
    private String nombres;
    private String numeroCuenta;

    public empleado() {
    }

    public String getCedulaIdentidad() {
        return cedulaIdentidad;
    }
    public void setCedulaIdentidad(String cedulaIdentidad) {
        this.cedulaIdentidad = cedulaIdentidad;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public String getNombres() {
        return nombres;
    }
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    public String getNumeroCuenta() {
        return numeroCuenta;
    }
    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

     public empleado(String cedulaIdentidad, String apellidos, String nombres, String numeroCuenta) {
        this.cedulaIdentidad = cedulaIdentidad;
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.numeroCuenta = numeroCuenta;
    }

}
