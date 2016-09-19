package br.edu.ifpi.capar.para.poucos.modelo;

/**Classe que faz especificação de Contratante
 * 
 * @author Denylson Melo
 * @author Lucas Fontenele
 * @author Lucas Rafael
 * @author Gregorio Magno
 * @author Ramon josé
 */

public class Contratante {
    private int id;
    private int cpf;
    private String nome;
    private String endereco;
/**
 * 
 * @return retorna o cpf do contratante 
 */
    public int getCpf() {
        return cpf;
    }
/**
 * 
 * @param cpf seta o cpf do contratante
 */
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
/**
 * 
 * @return retorna o nome do contratante
 */
    public String getNome() {
        return nome;
    }
/**
 * 
 * @param nome seta o nome do contratante
 */
    public void setNome(String nome) {
        this.nome = nome;
    }
/**
 * 
 * @return retorna o endereço do contratante
 */
    public String getEndereco() {
        return endereco;
    }
/**
 * 
 * @param endereco seta o endereço do contratante
 */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
/**
 * 
 * @return retorna o ID do contratante
 */    
    public int getId() {
        return id;
    }
   /**
    * 
    * @param id seta o ID do contratante
    */ 
    public void setId(int id) {
        this.id = id;
    }
}
