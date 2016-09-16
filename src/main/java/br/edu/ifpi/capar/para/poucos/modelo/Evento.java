package br.edu.ifpi.capar.para.poucos.modelo;

/* @author SOFTWARE III */
/* @author Gregorio Magno */

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
    }

    /**
     * @return the horario
     */
    public int getHorario() {
        return horario;
    }

    /**
     * @param horario the horario to set
     */
    public void setHorario(int horario) {
        this.horario = horario;
    }

    /**
     * @return the idadeMinima
     */
    public int getIdadeMinima() {
        return idadeMinima;
    }

    /**
     * @param idadeMinima the idadeMinima to set
     */
    public void setIdadeMinima(int idadeMinima) {
        this.idadeMinima = idadeMinima;
    }

    /**
     * @return the tipo
     */
    public int getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
}
