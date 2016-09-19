package br.edu.ifpi.capar.para.poucos.modelo;

import br.edu.ifpi.capar.para.poucos.generico.EntidadeGenerica;

/**Classe que faz especificação de evento
 * 
 * @author Denylson Melo
 * @author Lucas Fontenele
 * @author Lucas Rafael
 * @author Gregorio Magno
 * @author Ramon josé
 */
public class Evento extends EntidadeGenerica{
    private int idEvento;
    private String nomeEvento;
    private String dataEvento;
    private int horario;
    private int idadeMinima;
    private int tipo;

    /**
     * @return retorna o idEvento
     */
    public int getIdEvento() {
        return idEvento;
    }

    /**
     * @param idEvento seta o idEvento 
     */
    public void setIdEvento(int idEvento) {
        this.idEvento = idEvento;
    }

    /**
     * @return retorna o nomeEvento
     */
    public String getNomeEvento() {
        return nomeEvento;
    }

    /**
     * @param nomeEvento o nomeEvento a setar
     */
    public void setNomeEvento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }

    /**
     * @return retorna a dataEvento
     */
    public String getDataEvento() {
        return dataEvento;
    }

    /**
     * @param dataEvento a dataEvento a setar
     */
    public void setDataEvento(String dataEvento) {
        this.dataEvento = dataEvento;
    }

    /**
     * @return retorna o horario
     */
    public int getHorario() {
        return horario;
    }

    /**
     * @param horario o horario a setar
     */
    public void setHorario(int horario) {
        this.horario = horario;
    }

    /**
     * @return retorna a idadeMinima
     */
    public int getIdadeMinima() {
        return idadeMinima;
    }

    /**
     * @param idadeMinima a idadeMinima a setar
     */
    public void setIdadeMinima(int idadeMinima) {
        this.idadeMinima = idadeMinima;
    }

    /**
     * @return retorna o tipo
     */
    public int getTipo() {
        return tipo;
    }

    /**
     * @param tipo o tipo a setar
     */
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
}
