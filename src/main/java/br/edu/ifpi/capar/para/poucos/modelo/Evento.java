package br.edu.ifpi.capar.para.poucos.modelo;/**Classe que faz especificação de evento
 * 
 * @author Denylson Melo
 * @author Lucas Fontenele
 * @author Lucas Rafael
 * @author Ana Flavia
 * @author Gregorio Magno
 * @author Jean Jr
 * @author Vanessa Pinto
 */
public class Evento {
    private int idEvento;
    private String nomeEvento;
    private String dataEvento;
    private int horario;
    private int idadeMinima;
    private int tipo;

    /**
     * @return the idEvento
     */
    public int getIdEvento() {
        return idEvento;
    }

    /**
     * @param idEvento the idEvento to set
     */
    public void setIdEvento(int idEvento) {
        this.idEvento = idEvento;
    }

    /**
     * @return the nomeEvento
     */
    public String getNomeEvento() {
        return nomeEvento;
    }
/**
 * @return retorna a data do evento
   */ 
    public String getData() {
        return dataEvento;
    }
/**
 * @param data indica a data
   */ 
    public void setData(String data) {
        this.dataEvento = data;
    }
    /**
 * @return retorna o horario do evento
   */ 
    public int getHorario() {
        return horario;
    }
/**
 * @param horario indica o horario do evento
   */ 
    public void setHorario(int horario) {
        this.horario = horario;
    }
/**
 * @return retorna a idade minima para uma pessoa entrar no evento
   */ 
    public int getIdadeMinima() {
        return idadeMinima;
    }
    /**
 * @param idadeMinima indica a idade  minima que se precisa ter.
   */ 
    public void setIdadeMinima(int idadeMinima) {
        this.idadeMinima = idadeMinima;
    }
/**
 * @return retorna que tipo de evento vai ser feito
 */
    public int getTipo() {
        return tipo;
    }
    /**
     *@param tipo insere o tipo de evento
    */ 

    /**
     * @param nomeEvento the nomeEvento to set
     */
    public void setNomeEvento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }

    /**
     * @return the dataEvento
     */
    public String getDataEvento() {
        return dataEvento;
    }

    /**
     * @param dataEvento the dataEvento to set
     */
    public void setDataEvento(String dataEvento) {
        this.dataEvento = dataEvento;
    }}

    