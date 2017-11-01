package quiz3.Entidades;

/**
 * Created by darle on 10/30/2017.
 */
public class classAux {
    private long id;
    private String nombre;
    private int cantidad;
    private float precioDia;

    public classAux(long id, String nombre, int cantidad, float precioDia) {
        this.id = id;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precioDia = precioDia;
    }

    public float getPrecioDia() {
        return precioDia;
    }

    public void setPrecioDia(float precioDia) {
        this.precioDia = precioDia;
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

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
