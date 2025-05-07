package models;

import java.io.Serializable;

public class cliente implements Serializable {
    private static final long serialVersionUID = 1L;

    private String nombre;
    private String cedula;
    private String telefono;
    private String correo;
    private String direccion;

    public cliente(String nombre, String cedula, String telefono, String correo, String direccion) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.telefono = telefono;
        this.correo = correo;
        this.direccion = direccion;
    }

    public String getNombre() { return nombre; }
    public String getCedula() { return cedula; }
    public String getTelefono() { return telefono; }
    public String getCorreo() { return correo; }
    public String getDireccion() { return direccion; }

    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setCedula(String cedula) { this.cedula = cedula; }
    public void setTelefono(String telefono) { this.telefono = telefono; }
    public void setCorreo(String correo) { this.correo = correo; }
    public void setDireccion(String direccion) { this.direccion = direccion; }

    @Override
    public String toString() {
        return nombre + " - " + cedula;
    }
}
