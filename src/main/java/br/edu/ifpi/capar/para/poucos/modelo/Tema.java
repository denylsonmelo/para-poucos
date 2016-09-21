package br.edu.ifpi.capar.para.poucos.modelo;

/**
 * 
 * @author Lucas Rafael
 * @author Jean Jr
 * @author Ana Flavia
 * @author Lucas Fontenele
 * @author Diovanna Araujo
 */
public class Tema {
    private int id;
    private String nome;
    private String descricao;
    /**
     * @return retorna o id do tema 
     */
    public int getId() {
        return id;
    }
    /**
     * 
     * @param id insere o id do tema  do vento 
     */
    public void setId(int id) {
        this.id = id;
    }
    /**
     * 
     * @return retorna o nome
     */
    public String getNome() {
        return nome;
    }
    /**
     * 
     * @param nome insere o nome 
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    /**
     * 
     * @return retorna a descrição do tema do evento
     */
    public String getDescricao() {
        return descricao;
    }
    /**
     * @param descricao insere a descrição do tema
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
