package br.edu.ifpi.capar.para.poucos.login;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 *
 * @author Denylson Melo
 */
@Entity
public class UsuarioSistema implements Serializable {
    
    @Id
    private String email;
    private String senha;
    @ManyToMany(fetch = FetchType.EAGER)
    private List<PerfilSistema> perfis = new ArrayList<>();

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public UsuarioSistema() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public List<PerfilSistema> getPerfis() {
        return perfis;
    }

    public void setPerfis(List<PerfilSistema> perfis) {
        this.perfis = perfis;
    }

    
}
