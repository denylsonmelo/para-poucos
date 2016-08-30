package br.edu.ifpi.capar.para.poucos.modelo;

/* @author SOFTWARE III */

public class Organizador {
    private int cpfOrganizador;
    private int contato;
    private String nomeOrganizador;
    private String agencia;
    private String email;

    public int getCpfOrganizador() {
        return cpfOrganizador;
    }

    public void setCpfOrganizador(int cpfOrganizador) {
        this.cpfOrganizador = cpfOrganizador;
    }

    public int getContato() {
        return contato;
    }

    public void setContato(int contato) {
        this.contato = contato;
    }

    public String getNomeOrganizador() {
        return nomeOrganizador;
    }

    public void setNomeOrganizador(String nomeOrganizador) {
        this.nomeOrganizador = nomeOrganizador;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
