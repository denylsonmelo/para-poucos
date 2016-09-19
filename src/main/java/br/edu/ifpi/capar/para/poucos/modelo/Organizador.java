package br.edu.ifpi.capar.para.poucos.modelo;

/**Classe que faz especificação de Organizador
 * 
 * @author Denylson Melo
 * @author Lucas Fontenele
 * @author Lucas Rafael
 * @author Gregorio Magno
 * @author Ramon josé
 */

public class Organizador {
    private int id;
    private int cpf;
    private int contato;
    private String nome;
    private String agencia;
    private String email;
/**
 * 
 * @return retorna o cpf do organizador
 */
    public int getCpf() {
        return cpf;
    }
/**
 * 
 * @param cpf seta o cpf do organizador
 */
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
/**
 * 
 * @return retorna o contato do organizador
 */
    public int getContato() {
        return contato;
    }
/**
 * 
 * @param contato seta o numero para contato do organizador
 */
    public void setContato(int contato) {
        this.contato = contato;
    }
/**
 * 
 * @return retorna o nome do organizador
 */
    public String getNome() {
        return nome;
    }
/**
 * 
 * @param nome seta o nome do organizador do evento
 */
    public void setNome(String nome) {
        this.nome = nome;
    }
/**
 * 
 * @return retorna a agencia do organizador
 */
    public String getAgencia() {
        return agencia;
    }
/**
 * 
 * @param agencia seta a agencia que o organizador trabalha
 */
    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }
/**
 * 
 * @return retorna o email do organizador
 */
    public String getEmail() {
        return email;
    }
/**
 * 
 * @param email insere o email do organizador
 */
    public void setEmail(String email) {
        this.email = email;
    }
/**
 * 
 * @return retorna o id de quem organiza o evento
 */
    public int getId() {
        return id;
    }
/**
 * 
 * @param id insere o id do organizador do evento
 */
    public void setId(int id) {
        this.id = id;
    }
}
