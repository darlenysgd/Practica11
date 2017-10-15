package quiz3.Entidades;

import javax.persistence.*;
import java.util.List;

/**
 * Created by darle on 10/13/2017.
 */
@Entity
public class SubFamiliaEquipos {
    @Id
    @GeneratedValue
    private long id;
    private String nombreSubFamilia;
    private int cantidadExistente;
    @OneToMany
    private List<Equipos> equipos;
    @ManyToOne
    private FamiliaEquipos familiaEquipos;

    public SubFamiliaEquipos() {
    }

    public SubFamiliaEquipos(String nombreSubFamilia, int cantidadExistente, FamiliaEquipos familiaEquipos) {
        this.nombreSubFamilia = nombreSubFamilia;
        this.cantidadExistente = cantidadExistente;
        this.familiaEquipos = familiaEquipos;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombreSubFamilia() {
        return nombreSubFamilia;
    }

    public void setNombreSubFamilia(String nombreSubFamilia) {
        this.nombreSubFamilia = nombreSubFamilia;
    }

    public int getCantidadExistente() {
        return cantidadExistente;
    }

    public void setCantidadExistente(int cantidadExistente) {
        this.cantidadExistente = cantidadExistente;
    }

    public List<Equipos> getEquipos() {
        return equipos;
    }

    public void setEquipos(List<Equipos> equipos) {
        this.equipos = equipos;
    }

    public FamiliaEquipos getFamiliaEquipos() {
        return familiaEquipos;
    }

    public void setFamiliaEquipos(FamiliaEquipos familiaEquipos) {
        this.familiaEquipos = familiaEquipos;
    }
}
