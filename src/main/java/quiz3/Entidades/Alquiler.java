package quiz3.Entidades;

import javax.persistence.*;
import java.util.List;

/**
 * Created by darle on 10/14/2017.
 */
@Entity
public class Alquiler {
    @Id
    @GeneratedValue
    private long id;
    @OneToOne
    private Cliente cliente;
    private String fechaAlquiler;
    private String fechaEntrega;
    private long montoTotal;
    @OneToMany
    List<Equipos> equipos;

    public Alquiler() {
    }

    public Alquiler(Cliente cliente, String fechaAlquiler, String fechaEntrega, long montoTotal, List<Equipos> equipos) {
        this.cliente = cliente;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaEntrega = fechaEntrega;
        this.montoTotal = montoTotal;
        this.equipos = equipos;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(String fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public String getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(String fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public long getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(long montoTotal) {
        this.montoTotal = montoTotal;
    }

    public List<Equipos> getEquipos() {
        return equipos;
    }

    public void setEquipos(List<Equipos> equipos) {
        this.equipos = equipos;
    }
}
