package br.edu.ifpi.capar.para.poucos.modelo;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 * Classe com as especificaões do Tema de um Evento.
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
public class Tema implements Serializable {

    @OneToOne(mappedBy = "tema")
    private Evento evento;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    
    private String nome;
    private String descricao;

    /**
     * @return retorna o id do Tema de um Evento.
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @param id recebe o id do Tema de um Evento.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     *
     * @return retorna o nome do Tema de um Evento.
     */
    public String getNome() {
        return nome;
    }

    /**
     *
     * @param nome recebe o nome do Tema de um Evento.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     *
     * @return retorna a descrição do Tema de um Evento.
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao recebe a descrição do Tema de um Evento.
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
