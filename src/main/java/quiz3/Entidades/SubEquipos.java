package quiz3.Entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by darle on 10/12/2017.
 */
@Entity
public class SubEquipos extends Equipo{
    @Id
    @GeneratedValue
    private long id;
    private String codigo_id;
    private String marca;
    private String modelo;
    private String valor;
    private String precioAlquiler;
    private String imagen;

    public SubEquipos() {
    }

    public SubEquipos(String codigo_id, String marca, String modelo, String valor, String precioAlquiler, String imagen) {
        this.codigo_id = codigo_id;
        this.marca = marca;
        this.modelo = modelo;
        this.valor = valor;
        this.precioAlquiler = precioAlquiler;
        this.imagen = imagen;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCodigo_id() {
        return codigo_id;
    }

    public void setCodigo_id(String codigo_id) {
        this.codigo_id = codigo_id;
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

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getPrecioAlquiler() {
        return precioAlquiler;
    }

    public void setPrecioAlquiler(String precioAlquiler) {
        this.precioAlquiler = precioAlquiler;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
}
