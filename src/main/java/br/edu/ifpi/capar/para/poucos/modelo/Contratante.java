package br.edu.ifpi.capar.para.poucos.modelo;

/* @author SOFTWARE III */
/* @author Vanessa Pinto*/

public class Contratante {
    private int id;
    private int cpf;
    private String nome;
    private String endereco;

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
}
