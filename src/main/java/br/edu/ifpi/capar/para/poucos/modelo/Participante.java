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
/**
 * 
 * @return retorna o CPF do participante
 */
  public int getCpf() {
        return cpf;
    }
/**
 * 
 * @param cpf seta o cpf do participante
 */
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
/**
 * 
 * @return retorna o rg do participante
 */
    public int getRg() {
        return rg;
    }
/**
 * 
 * @param rg seta o RG do participante
 */
    public void setRg(int rg) {
        this.rg = rg;
    }
/**
 * 
 * @return retorna a idade do participante
 */
    public int getIdade() {
        return idade;
    }
/**
 * 
 * @param idade insere a idade do participante
 */
    public void setIdade(int idade) {
        this.idade = idade;
    }
/**
 * 
 * @return retorna o nome do participante
 */
    public String getNome() {
        return nome;
    }
/**
 * 
 * @param nome insere o nome do participante
 */
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
