package quiz3.Entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

/**
 * Created by darle on 10/13/2017.
 */
@Entity
public class FamiliaEquipos {
    @Id
    @GeneratedValue
    private long id;
    private String nombreFamilia;
    private int cantidadExistente;
    private int cantAlquilado = 0;
    private int diasTotalAlquiler = 0;
    @OneToMany
    private List<SubFamiliaEquipos> subFamiliaEquipos;

    public FamiliaEquipos() {
    }

    public FamiliaEquipos(String nombreFamilia, int cantidadExistente) {
        this.nombreFamilia = nombreFamilia;
        this.cantidadExistente = cantidadExistente;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombreFamilia() {
        return nombreFamilia;
    }

    public void setNombreFamilia(String nombreFamilia) {
        this.nombreFamilia = nombreFamilia;
    }

    public int getCantidadExistente() {
        return cantidadExistente;
    }

    public void setCantidadExistente(int cantidadExistente) {
        this.cantidadExistente = cantidadExistente;
    }

    public List<SubFamiliaEquipos> getSubFamiliaEquipos() {
        return subFamiliaEquipos;
    }

    public void setSubFamiliaEquipos(List<SubFamiliaEquipos> subFamiliaEquipos) {
        this.subFamiliaEquipos = subFamiliaEquipos;
    }

    public int getCantAlquilado() {
        return cantAlquilado;
    }

    public void setCantAlquilado(int cantAlquilado) {
        this.cantAlquilado = cantAlquilado;
    }

    public int getDiasTotalAlquiler() {
        return diasTotalAlquiler;
    }

    public void setDiasTotalAlquiler(int diasTotalAlquiler) {
        this.diasTotalAlquiler = diasTotalAlquiler;
    }
}
