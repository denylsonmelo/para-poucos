package br.edu.ifpi.capar.para.poucos.modelo;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

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
    
    @Temporal(TemporalType.DATE) //configurar como mapear um Calendar para o banco, usado apenas a data.
    private String data;
    
    @Temporal(TemporalType.TIME) //usado apenas a hora.
    private int horario;
    
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
     * @return retorna o horário do Evento
     */
    public int getHorario() {
        return horario;
    }

    /**
     * @param horario recebe o horário em que será realizado o Evento.
     */
    public void setHorario(int horario) {
        this.horario = horario;
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
    public String getData() {
        return data;
    }

    /**
     * @param data recebe a data em que será realizado do Evento.
     */
    public void setData(String data) {
        this.data = data;
    }
}