package quiz3.Entidades;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created by darle on 10/27/2017.
 */
@Entity
public class EquiposAlquiler {
    @Id
    @GeneratedValue
    private long id;
    @OneToOne
    private Equipos equipo;
    private int cantidad;
    private Date fechaEntrega;

    public EquiposAlquiler() {
    }

    public EquiposAlquiler(Equipos equipo, int cantidad, Date fechaEntrega) {
        this.equipo = equipo;
        this.cantidad = cantidad;
        this.fechaEntrega = fechaEntrega;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public Equipos getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipos equipo) {
        this.equipo = equipo;
    }
}
