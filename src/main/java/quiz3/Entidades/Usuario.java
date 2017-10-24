package quiz3.Entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by darle on 10/24/2017.
 */
@Entity
public class Usuario {

    @Id
    @GeneratedValue
    private long id;
    private String username;
    private String clave;
    private boolean admin;

    public Usuario() {
    }

    public Usuario(String username, String clave, boolean admin) {
        this.username = username;
        this.clave = clave;
        this.admin = admin;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }
}
