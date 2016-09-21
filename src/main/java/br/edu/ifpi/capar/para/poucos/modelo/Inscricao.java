package br.edu.ifpi.capar.para.poucos.modelo;

 /**Classe que faz especificação de Inscricao
 * @author Denylson Melo
 * @author Lucas Fontenele
 * @author Lucas Rafael
 * @author Gregorio Magno
 * @author Jean Jr
 * @author Ana Flavia
 * @author Vanessa Pinto
 * @author Diovanna Araujo
 * @author Arllayne Carvalho
 * @author Endrilenne Véras
 */
public class Inscricao {

    private int numero;
    private int codParticipante;

    /**
     * @return retorna o numero de inscritos
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero insere o numero de inscritos
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return retorna o código de cada participante do evento
     */
    public int getCodParticipante() {
        return codParticipante;
    }

    /**
     * @param codParticipante insere o código de cada particiante
     */
    public void setCodParticipante(int codParticipante) {
        this.codParticipante = codParticipante;
    }
}
