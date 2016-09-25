package br.edu.ifpi.capar.para.poucos.modelo;

/**
 * Classe com as especificações do Local onde será realizado o Evento.
 * @author Diovanna Araujo da Silva
 * @author Denylson Melo
 * @author Lucas Fontenele
 * @author Lucas Rafael
 * @author Ana Flavia
 * @author Gregorio Magno
 * @author Jean Jr
 * @author Vanessa Pinto
 * @author Arllayne Carvalho
 * @author Endrilenne Véras
 * @author Ramon jose
 * @author Ruan Vinicios
 */
public class Local {

    private int id;
    private String nome;
    private int capacidade;
    private String cidade;
    private String uf;
    private String rua;
    private int numero;

    /**
     * @return retorna o id do Local onde será realizado o Evento.
     */
    public int getId() {
        return id;
    }

    /**
     * @param id recebe o id do Local onde será realizado o Evento.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return retorna o nome do Local onde será realizado o Evento.
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome recebe o nome do Local onde será realizado o Evento.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return retorna a quantidade máxima de participantes que o Local, onde será realizado o Evento, pode acomodar.
     */
    public int getCapacidade() {
        return capacidade;
    }

    /**
     * @param capacidade recebe a quantidade máxima de participantes que o Local, onde será realizado o Evento, pode acomodar.
     */
    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    /**
     * @return retorna a cidade onde será realizado o Evento.
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * @param cidade recebe a cidade onde será realizado o Evento.
     */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    /**
     * @return retorna a unidade federal onde será realizado o Evento.
     */
    public String getUf() {
        return uf;
    }

    /**
     * @param uf a unidade federal onde será realizado o Evento.
     */
    public void setUf(String uf) {
        this.uf = uf;
    }

    /**
     * @return retorna a rua do Local onde será realizado o Evento.
     */

    public String getRua() {
        return rua;
    }

    /**
     * @param rua recebe a rua do Local onde será realizado o Evento.
     */
    public void setRua(String rua) {
        this.rua = rua;
    }

    /**
     * @return retorna o numero de identificação do Local onde será realizado o Evento. 
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero recebe o numero de identificação do Local onde será realizado o Evento. 
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }
}
