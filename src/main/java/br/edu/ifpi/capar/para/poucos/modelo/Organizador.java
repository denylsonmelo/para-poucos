package br.edu.ifpi.capar.para.poucos.modelo;

/**
 * Classe com as especificações de Organizador do Evento.
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
public class Organizador {

    private int id;
    private int cpf;
    private int contato;
    private String nome;
    private String agencia;
    private String email;

    /**
     * @return retorna o numero do cpf do Organizador do Evento.
     */
    public int getCpf() {
        return cpf;
    }

    /**
     * @param cpf recebe o numero do cpf do Organizador do Evento.
     */
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    /**
     * @return returna o contato do Organizador do Evento.
     */

    public int getContato() {
        return contato;
    }

    /**
     * @param contato recebe o contato do Organizador do Evento.
     */
    public void setContato(int contato) {
        this.contato = contato;
    }

    /**
     * @return retorna o nome do Organizador do Evento.
     */
    public String getNome() {
        return nome;
    }

    /**
     *
     * @param nome recebe o nome do Organizador do Evento.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     *
     * @return retorna o nome da agência em que o Organizador do Evento faz parte.
     */
    public String getAgencia() {
        return agencia;
    }

    /**
     * @param agencia recebe o nome da agência em que o Organizador do Evento faz parte.
     */
    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    /**
     * @return retorna o email do Organizador do Evento.
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email recebe o email do Organizador do Evento.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     *
     * @return retorna o id do Organizador do Evento.
     */
    public int getId() {
        return id;
    }

    /**
     * @param id recebe o id do Organizador do Evento.
     */
    public void setId(int id) {
        this.id = id;
    }
}