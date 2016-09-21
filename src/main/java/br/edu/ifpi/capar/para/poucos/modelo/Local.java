package br.edu.ifpi.capar.para.poucos.modelo;

/**Classe que faz especificação de Local
 * 
 * @author Denylson Melo
 * @author Lucas Fontenele
 * @author Lucas Rafael
 * @author Ana Flavia
 * @author Gregorio Magno
 * @author Jean Jr
 * @author Vanessa Pinto
 */


public class Local {
    private int id;
    private String nome;
    private int capacidade;
    private String cidade;
    private String estado;
    private String rua;
    private int numero;

    /**
 * @return retorna o id(enderço) do local
   */ 
    public int getId() {
        return id;
    }
    /**
 * @param id insere o id do local
   */ 
    public void setId(int id) {
        this.id = id;
    }
/**
 * @return retorna o nome do local do evento
   */ 
    public String getNome() {
        return nome;
    }
/**
 * @param nome insere o nome do local
   */ 
    public void setNome(String nome) {
        this.nome = nome;
    }
/**
 * @return retorna a capacidade do local
 */ 
    public int getCapacidade() {
        return capacidade;
    }
/**
 * @param capacidade insere a capacidade quantas pessoas cabem no local
   */ 
    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
    /**
 * @return retorna em que cidade vai ser o evento
   */ 
    public String getCidade() {
        return cidade;
    }
    /**
 * @param cidade insere em que cidade vai ser o evento
   */ 
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    /**
 * @return retorna em qu estado vai ser o evento
   */ 
    public String getEstado() {
        return estado;
    }
    /**
 * @param estado insere o estado(local) vai ser o evento
   */ 
    public void setEstado(String estado) {
        this.estado = estado;
    }
    /**
     * @return retorna em que rua vai ser o evento
     */
       
    public String getRua() {
        return rua;
    }
    /**
     * @param rua insere a rua que vai ser o evento
     */
    public void setRua(String rua) {
        this.rua = rua;
    }
    /**
     * @return retorna o numero(da casa ou apartamento) do evento
     */
    public int getNumero() {
        return numero;
    }
    /**
     * @param numero insere o numero da casa ou apartamento 
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }
}
