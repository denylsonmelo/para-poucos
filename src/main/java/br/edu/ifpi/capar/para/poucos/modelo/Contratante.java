package br.edu.ifpi.capar.para.poucos.modelo;

/**Classe que faz especificação de Contratante
 * 
 * @author Denylson Melo
 * @author Lucas Fontenele
 * @author Lucas Rafael
 * @author Ana Flavia
 * @author Gregorio Magno
 * @author Jean Jr
 * @author Vanessa Pinto
 */

public class Contratante {
    private int id;
    private int cpf;
    private String nome;
    private String endereco;
/**
 * @return  
 * retorna o numero de cpf do cliente.
   */ 
    public int getCpf() {
        return cpf;
    }
/**
 * @param cpf
   */ 
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
/**
 * @return retorna o nome do cliente.
   */ 
    public String getNome() {
        return nome;
    }
/**
 * @param nome
   */ 
    public void setNome(String nome) {
        this.nome = nome;
    }
/**
 * @return  
 * retorna o endereço do cliente.
   */ 
    public String getEndereco() {
        return endereco;
    }
/**
 * @param endereco
   */ 
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    /**
 * @return  retorna o id cliente.
   */ 
    public int getId() {
        return id;
    }
    /**
 * @param id insere o id do contratante
   */ 
    public void setId(int id) {
        this.id = id;
    }
}
