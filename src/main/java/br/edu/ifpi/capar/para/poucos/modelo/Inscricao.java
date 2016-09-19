package br.edu.ifpi.capar.para.poucos.modelo;


/**Classe que faz especificação de Inscricao
 * 
 * @author Denylson Melo
 * @author Lucas Fontenele
 * @author Lucas Rafael
 * @author Gregorio Magno
 * @author Ramon josé
 */

public class Inscricao {
    private int numero;
    private int codParticipante;
    
 /**
  * 
  * @return retorno o numero de pessoas inscritas 
  */ 
    public int getNumero() {
        return numero;
    }
    /**
     * 
     * @param numero insere o numero de inscrições
     */
 
    public void setNumero(int numero) {
        this.numero = numero;
    }
    /**
     * 
     * @return irá retorna o codigo do participante do evento
     */
    public int getCodParticipante() {
        return codParticipante;
    }
    /**
     * 
     * @param codParticipante insere o codigo do participante 
     */
    public void setCodParticipante(int codParticipante) {
        this.codParticipante = codParticipante;
    }
}
