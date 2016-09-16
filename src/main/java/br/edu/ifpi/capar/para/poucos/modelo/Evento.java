package br.edu.ifpi.capar.para.poucos.modelo;

import br.edu.ifpi.capar.para.poucos.generico.EntidadeGenerica;

/**Classe que faz especificação de evento
 * 
 * @author Diovanna Araujo
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

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    
    public int getHorario() {
        return horario;
    }

    public void setHorario(int horario) {
        this.horario = horario;
    }

    public int getIdadeMinima() {
        return idadeMinima;
    }
    
    public void setIdadeMinima(int idadeMinima) {
        this.idadeMinima = idadeMinima;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
}
