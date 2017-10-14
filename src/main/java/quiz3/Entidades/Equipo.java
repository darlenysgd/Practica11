package quiz3.Entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import java.util.List;

/**
 * Created by darle on 10/12/2017.
 */
@Entity
@Inheritance
public class Equipo {

    @Id
    @GeneratedValue
    private long id;
    private String nombre;
    private int cantidad;
    private List<SubEquipos> subEquiposList;

    public Equipo() {
    }

    public Equipo(String nombre, int cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;

    }

    public Equipo(String nombre) {
        this.nombre = nombre;
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

    public List<SubEquipos> getSubEquiposList() {
        return subEquiposList;
    }

    public void setSubEquiposList(List<SubEquipos> subEquiposList) {
        this.subEquiposList = subEquiposList;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
