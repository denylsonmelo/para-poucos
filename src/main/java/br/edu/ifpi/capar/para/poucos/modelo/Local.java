package br.edu.ifpi.capar.para.poucos.modelo;

/**Classe que faz especificação de Local
 * 
 * @author Denylson Melo
 * @author Lucas Fontenele
 * @author Lucas Rafael
 * @author Gregorio Magno
 * @author Ramon josé
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
 * 
 * @return retorna o id
 */
    public int getId() {
        return id;
    }
/**
 * 
 * @param id seta o id do local
 */
    public void setId(int id) {
        this.id = id;
    }
/**
 * 
 * @return retorna o nome do local
 */
    public String getNome() {
        return nome;
    }
/**
 * 
 * @param nome seta o nome do local 
 */
    public void setNome(String nome) {
        this.nome = nome;
    }
/**
 * 
 * @return retorna a capacidade que o local suporta
 */
    public int getCapacidade() {
        return capacidade;
    }
/**
 * 
 * @param capacidade seta a capacidade do local
 */
    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
/**
 * 
 * @return retorna a cidade onde o local do evento está
 */
    public String getCidade() {
        return cidade;
    }
/**
 * 
 * @param cidade seta a cidade onde o local do evento se encontra
 */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
/**
 * 
 * @return retorna o estado em que o local do evento está
 */
    public String getEstado() {
        return estado;
    }
/**
 * 
 * @param estado seta o estado onde o local do evento se encontra
 */
    public void setEstado(String estado) {
        this.estado = estado;
    }
/**
 * 
 * @return retorna a rua do estabelecimento
 */
    public String getRua() {
        return rua;
    }
/**
 * 
 * @param rua seta a rua do estabelecimento
 */
    public void setRua(String rua) {
        this.rua = rua;
    }
/**
 * 
 * @return retorna o numero do estabelecimento
 */
    public int getNumero() {
        return numero;
    }
/**
 * 
 * @param numero insere o numero do estabelecimento que vai sediar o evento
 */
    public void setNumero(int numero) {
        this.numero = numero;
    }
}
