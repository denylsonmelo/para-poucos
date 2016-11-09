package br.edu.ifpi.capar.para.poucos.modelo;

import java.io.Serializable;
import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Classe com as especificações de Evento.
 * @author Diovanna Araujo da Silva
 * @author Denylson Melo
 * @author Lucas Fontenele
 * @author Lucas Rafael
 * @author Ana Flavia
 * @author Gregorio Magno
 * @author Jean Jr
 * @author Vanessa Pinto
 * @author Arllayne Carvalhos
 * @author Endrilenne Véras
 * @author Ramon jose
 * @author Ruan Vinicios
 */
@Entity
public class Evento implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    
    private String nome;
    
    private LocalDateTime dataTempo;
    
    private int idadeMinima;
    private int tipo;

    /**
     * @return  retorna o id do Evento.
     */
    public int getId() {
        return id;
    }

    /**
     * @param id recebe id do Evento.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return retorna a idade mínima que uma pessoa deve ter para participar do Evento.
     */
    public int getIdadeMinima() {
        return idadeMinima;
    }

    /**
     * @param idadeMinima recebe a idade minima que uma pessoa deve ter para participar do Evento.
     */
    public void setIdadeMinima(int idadeMinima) {
        this.idadeMinima = idadeMinima;
    }

    /**
     * @return retorna o tipo do Evento.
     */
    public int getTipo() {
        return tipo;
    }

    /**
     * @param tipo recebe o tipo do Evento.
     */
    public void setTipo(int tipo){
        this.tipo = tipo;
    }
    
    /**
     * @return retorna o nome do Evento.
     */
    public String getNome() {
        return nome;
    }
    
    /**
     * @param nome recebe o nome do Evento.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return retorna a data em que será realizado do Evento.
     */
    public LocalDateTime getDataTempo() {
        return dataTempo;
    }

    /**
     * @param dataTempo recebe a data em que será realizado do Evento.
     */
    public void setDataTempo(LocalDateTime dataTempo) {
        this.dataTempo = dataTempo;
    }
}