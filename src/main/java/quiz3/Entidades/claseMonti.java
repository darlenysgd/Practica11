package quiz3.Entidades;

public class claseMonti {

    private String equipo;
    private String cantidad;
    private String fechaEntrega;

    public claseMonti(String equipo, String cantidad, String fechaEntrega) {
        this.equipo = equipo;
        this.cantidad = cantidad;
        this.fechaEntrega = fechaEntrega;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(String fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }
}
