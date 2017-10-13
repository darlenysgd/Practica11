package quiz3.Entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by darle on 10/12/2017.
 */
@Entity
public class Equipo {

    @Id
    @GeneratedValue
    private long id;
    private String nombre;
    private String marca;
    private String modelo;
    private long valor;
    private long precioAlquiler;

    public Equipo() {
    }

    public Equipo(String nombre, String marca, String modelo, long valor, long precioAlquiler) {
        this.nombre = nombre;
        this.marca = marca;
        this.modelo = modelo;
        this.valor = valor;
        this.precioAlquiler = precioAlquiler;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public long getValor() {
        return valor;
    }

    public void setValor(long valor) {
        this.valor = valor;
    }

    public long getPrecioAlquiler() {
        return precioAlquiler;
    }

    public void setPrecioAlquiler(long precioAlquiler) {
        this.precioAlquiler = precioAlquiler;
    }
}
