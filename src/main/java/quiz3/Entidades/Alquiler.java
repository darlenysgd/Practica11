package quiz3.Entidades;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created by darle on 10/14/2017.
 */
@Entity
public class Alquiler {
    @Id
    @GeneratedValue
    private long id;
    private long cliente;
    private Date fechaAlquiler;
    private long montoTotal;
    private long equipoId;
    private int cantidad;
    private Date fechaEntrega;

    public Alquiler() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getCliente() {
        return cliente;
    }

    public void setCliente(long cliente) {
        this.cliente = cliente;
    }

    public long getEquipoId() {
        return equipoId;
    }

    public void setEquipoId(long equipoId) {
        this.equipoId = equipoId;
    }

    public Date getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(Date fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public long getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(long montoTotal) {
        this.montoTotal = montoTotal;
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
}
