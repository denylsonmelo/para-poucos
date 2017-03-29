package br.edu.ifpi.capar.para.poucos.login;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Denylson Melo
 */
@Entity
public class PerfilSistema implements Serializable{
    
    @Id
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PerfilSistema(String name) {
        this.name = name;
    }

    public PerfilSistema() {
    }
}
