package br.edu.ifpi.capar.para.poucos.modelo;

/**
 * Classe que faz especificação de Organizador
 *
 * @author Denylson Melo
 * @author Lucas Fontenele
 * @author Lucas Rafael
 * @author Ana Flavia
 * @author Gregorio Magno
 * @author Jean Jr
 * @author Vanessa Pinto
 * @author Diovanna Araujo
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
     * @return retorna o cpf do organizador
     */
    public int getCpf() {
        return cpf;
    }

    /**
     * @param cpf insere o cpf do organizador
     */
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    /**
     * @return returna o contato do organizador do evento
     */

    public int getContato() {
        return contato;
    }

    /**
     * @param contato insere o contato do organizador do eevento
     */
    public void setContato(int contato) {
        this.contato = contato;
    }

    /**
     * @return retorna o nome do organizador
     */
    public String getNome() {
        return nome;
    }

    /**
     *
     * @param nome insere o nome do organizador
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     *
     * @return retorna o nome da agência
     */
    public String getAgencia() {
        return agencia;
    }

    /**
     * @param agencia insere a agência
     */
    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    /**
     * @return retorna o email do organizador
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email insere o email do organizador
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     *
     * @return retorna o id do organizador
     */
    public int getId() {
        return id;
    }

    /**
     * @param id insere o id do organizador
     */
    public void setId(int id) {
        this.id = id;
    }
}