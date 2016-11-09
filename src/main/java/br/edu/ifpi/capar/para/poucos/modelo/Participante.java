package br.edu.ifpi.capar.para.poucos.modelo;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Classe com as especificações do Participante de um Evento.
 *
 * @author Diovanna Araujo da Silva
 * @author Lucas Rafael
 * @author Jean Jr
 * @author Ana Flavia
 * @author Lucas Fontenele
 * @author Arllayne Carvalho
 * @author Endrilenne Véras
 * @author Ramon jose
 * @author Ruan Vinicios
 */
@Entity
public class Participante implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    
    private int cpf;
    private int rg;
    private int idade;
    private String nome;

    /**
     * @return retorna o numero do cpf do Participante de um Evento.
     */
    public int getCpf() {
        return cpf;
    }

    /**
     * @param cpf recebe o numero do cpf do Participante de um Evento.
     */
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    /**
     * @return retorna o rg do Participante de um Evento.
     */
    public int getRg() {
        return rg;
    }

    /**
     * @param rg recebe o rg do Participante de um Evento.
     */
    public void setRg(int rg) {
        this.rg = rg;
    }

    /**
     * @return retorna a idade do Participante de um Evento.
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade recebe a idade do Participante de um Evento.
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * @return retorna o nome do Participante de um Evento.
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome recebe o nome do Participante de um Evento.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return retorna o id do Participante de um Evento.
     */
    public int getId() {
        return id;
    }

    /**
     * @param id recebe o id do Participante de um Evento.
     */
    public void setId(int id) {
        this.id = id;
    }
}
