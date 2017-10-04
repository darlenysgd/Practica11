package Entidades;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by darle on 10/4/2017.
 */

@Entity
public class Cliente {

    @Id
    private String cedula;
    private String nombre;
    private String apellido;
    private String telefono;
    private byte[] imagen;

    public Cliente(String cedula, String nombre, String apellido, String telefono, byte[] imagen) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.imagen = imagen;
    }

    public Cliente() {
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public byte[] getImagen() {
        return imagen;
    }

    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
    }
}
