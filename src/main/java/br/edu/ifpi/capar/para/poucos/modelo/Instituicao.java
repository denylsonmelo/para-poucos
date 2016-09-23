package br.edu.ifpi.capar.para.poucos.modelo;

/**
 * Classe com as especificações de Instituição.
 * @author Diovanna Araujo
 * @author Denylson Melo
 * @author Lucas Rafael
 * @author Ana Flavia
 * @author Gregorio Magno
 * @author Jean Jr
 * @author Lucas Fontenele
 * @author Vanessa Pinto
 * @author Arllayne Carvalho
 * @author Endrilenne Véras
 * @author Ramon jose
 * @author Ruan Vinicios
 */
public class Instituicao {
    private int id;
    private String nome;
    private String sigla;
    private String uf;
    private String cidade;
    private int numero;
    private String rua;

    /**
     * 
     * @return a unidade federal em que está localizada a Instituição.
     */
    
    public String getUf() {
        return uf;
    }
    
    /**
     * 
     * @param uf recebe a unidade federal em que está localizada a Instituição.
     */

    public void setUf(String uf) {
        this.uf = uf;
    }
    
    /**
     * 
     * @return a cidade em que está localizada a Instituição.
     */

    public String getCidade() {
        return cidade;
    }
    
    /**
     * 
     * @param cidade recebe a cidade em que está localizada a Instituição.
     */

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    
    /**
     * 
     * @return o numero de identicação para localização da Instituição.
     */

    public int getNumero() {
        return numero;
    }
    
    /**
     * 
     * @param numero recebe o numero de identicação para localização da Instituição.
     */

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    /**
     * 
     * @return retorna o id da Instituição. 
     */
    
    public int getId() {
        return id;
    }
    
    /**
     * 
     * @param id recebe o id da Instituição. 
     */
    
    public void setId(int id) {
        this.id = id;
    }
    
    /**
     * 
     * @return retorna o nome da Instituição. 
     */

    public String getNome() {
        return nome;
    }
    
    /**
     * 
     * @param nome recebe o nome da Instituição. 
     */

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    /**
     * 
     * @return retorna a sigla da Instituição. 
     */

    public String getSigla() {
        return sigla;
    }
    
    /**
     * 
     * @param sigla recebe a sigla da Instituição. 
     */

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }
    
    /**
     * 
     * @return a rua em que está localizada a Instituição.  
     */

    public String getRua() {
        return rua;
    }
    
    /**
     * 
     * @param rua recebe a rua em que está localizada a Instituição.
     */

    public void setRua(String rua) {
        this.rua = rua;
    }
}
