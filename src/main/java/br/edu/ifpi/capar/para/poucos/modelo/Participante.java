package br.edu.ifpi.capar.para.poucos.modelo;

/**
 *
 * @author Lucas Rafael
 * @author Jean Jr
 * @author Ana Flavia
 * @author Lucas Fontenele
 * @author Diovanna Araujo
 * @author Arllayne Carvalho
 * @author Endrilenne Véras
 * @author Ramon jose
 * @author Ruan Vinicios
 */
public class Participante {

    private int id;
    private int cpf;
    private int rg;
    private int idade;
    private String nome;

    /**
     *
     * @return retorna o cpf do participante do evento
     */
    public int getCpf() {
        return cpf;
    }

    /**
     * @param cpf insere o cpf do participante
     */
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    /**
     *
     * @return retorna o rg do participante
     */
    public int getRg() {
        return rg;
    }

    /**
     *
     * @param rg insere o rg do participante
     */
    public void setRg(int rg) {
        this.rg = rg;
    }

    /**
     *
     * @return retorna a idade do participante
     */
    public int getIdade() {
        return idade;
    }

    /**
     *
     * @param idade insere a idade do participante
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     *
     * @return retorna o nome participante
     */
    public String getNome() {
        return nome;
    }

    /**
     *
     * @param nome insere o nome do paricipante
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return retorna o id do partipante
     */
    public int getId() {
        return id;
    }

    /**
     * @param id insere o id do participante
     */
    public void setId(int id) {
        this.id = id;
    }
}
