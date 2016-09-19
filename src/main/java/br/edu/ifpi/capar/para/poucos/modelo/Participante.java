package br.edu.ifpi.capar.para.poucos.modelo;


/**
 * 
 * @author Lucas Rafael
 * @author Ramon josé
 */

public class Participante {
    private int id;
    private int cpf;
    private int rg;
    private int idade;
    private String nome;

 
    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getRg() {
        return rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return retorna o ID do participante
     */
    public int getId() {
        return id;
    }

    /**
     * @param id inseri o ID do participante
     */
    public void setId(int id) {
        this.id = id;
    }
}
