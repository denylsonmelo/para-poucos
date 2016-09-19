package br.edu.ifpi.capar.para.poucos.modelo;

import br.edu.ifpi.capar.para.poucos.generico.EntidadeGenerica;

/**Classe que faz especificação de evento
 * 
 * @author Denylson Melo
 * @author Lucas Fontenele
 * @author Lucas Rafael
 * @author Ana Flavia
 */
public class Evento extends EntidadeGenerica{

    private String nome;
    private String data;
    private int horario;
    private int idadeMinima;
    private int tipo;

    /**Método que retorna o nome do evento
     * 
     * @return Retorna o nome completo do evento
     */
    public String getNome() {
        return nome;
    }

    /**Método que seta o nome do evento
     * 
     * @param nome O nome do evento propriamente dito
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
/**
 * @return retorna a data do evento
   */ 
    public String getData() {
        return data;
    }
/**
 * @param data indica a data
   */ 
    public void setData(String data) {
        this.data = data;
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
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
}
