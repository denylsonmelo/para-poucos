package br.edu.ifpi.capar.para.poucos.modelo;

/**
 * Classe que faz especificação de evento
 * @author Denylson Melo
 * @author Lucas Fontenele
 * @author Lucas Rafael
 * @author Ana Flavia
 * @author Gregorio Magno
 * @author Jean Jr
 * @author Vanessa Pinto
 * @author Diovanna Araujo
 * @author Arllayne Carvalhos
 * @author Endrilenne Véras
 * @author Ramon jose
 * @author Ruan Vinicios
 */
public class Evento {

    private int id;
    private String nome;
    private String data;
    private int horario;
    private int idadeMinima;
    private int tipo;

    /**
     * @return  retorna o id do evento
     */
    public int getId() {
        return id;
    }

    /**
     * @param id 
     * Insere ID do Evento
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return retorna o horario do Evento
     */
    public int getHorario() {
        return horario;
    }

    /**
     * @param horario 
     * Define o horario para o Evento
     */
    public void setHorario(int horario) {
        this.horario = horario;
    }

    /**
     * @return retorna a idade minima para uma pessoa entrar no Evento
     */
    public int getIdadeMinima() {
        return idadeMinima;
    }

    /**
     * @param idadeMinima 
     * Define a idade minima para o Evento.
     */
    public void setIdadeMinima(int idadeMinima) {
        this.idadeMinima = idadeMinima;
    }

    /**
     * @return retorna o tipo do Evento
     */
    public int getTipo() {
        return tipo;
    }

    /**
     * @param tipo
     * Define o tipo de Evento
     */
    public void setTipo(int tipo){
        this.tipo = tipo;
    }
    
    /**
     * @param nome 
     * Define o nome do Evento
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    /**
     * @return retorna o nome do Evento
     */
    public String getNome() {
        return nome;
    }

    /**
     * @return exibe a data do Evento
     */
    public String getData() {
        return data;
    }

    /**
     * @param data insere a data 
     */
    public void setData(String data) {
        this.data = data;
    }
}