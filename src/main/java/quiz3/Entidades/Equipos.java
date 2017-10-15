package quiz3.Entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Created by darle on 10/13/2017.
 */
@Entity
public class Equipos {
    @Id
    @GeneratedValue
    private long id;
    private String nombre;
    private String modelo;
    private String codigo_unico;
    private long valorCompra;
    private boolean alquilado;
    private float costoAlquilerDia;
    @ManyToOne
    private SubFamiliaEquipos subFamiliaEquipos;

    public Equipos() {
    }

    public Equipos(String nombre, String modelo, String codigo_unico, long valorCompra, boolean alquilado, float costoAlquilerDia, SubFamiliaEquipos subFamiliaEquipos) {
        this.nombre = nombre;
        this.modelo = modelo;
        this.codigo_unico = codigo_unico;
        this.valorCompra = valorCompra;
        this.alquilado = alquilado;
        this.costoAlquilerDia = costoAlquilerDia;
        this.subFamiliaEquipos = subFamiliaEquipos;
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

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCodigo_unico() {
        return codigo_unico;
    }

    public void setCodigo_unico(String codigo_unico) {
        this.codigo_unico = codigo_unico;
    }

    public boolean isAlquilado() {
        return alquilado;
    }

    public void setAlquilado(boolean alquilado) {
        this.alquilado = alquilado;
    }

    public float getCostoAlquilerDia() {
        return costoAlquilerDia;
    }

    public void setCostoAlquilerDia(float costoAlquilerDia) {
        this.costoAlquilerDia = costoAlquilerDia;
    }

    public long getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(long valorCompra) {
        this.valorCompra = valorCompra;
    }

    public SubFamiliaEquipos getSubFamiliaEquipos() {
        return subFamiliaEquipos;
    }

    public void setSubFamiliaEquipos(SubFamiliaEquipos subFamiliaEquipos) {
        this.subFamiliaEquipos = subFamiliaEquipos;
    }
}
