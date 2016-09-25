package br.edu.ifpi.capar.para.poucos.modelo;

 /**Classe com as especificações de Inscricao.
 * @author Diovanna Araujo da Silva
 * @author Denylson Melo
 * @author Lucas Fontenele
 * @author Lucas Rafael
 * @author Ruan Vinicios
 * @author Gregorio Magno
 * @author Jean Jr
 * @author Ana Flavia
 * @author Vanessa Pinto
 * @author Arllayne Carvalho
 * @author Endrilenne Véras
 * @author Ramon jose
 * 
 */
public class Inscricao {

    private int numero;
    private int participante;

    /**
     * @return retorna o numero da inscrição do Participante.
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero recebe o numero da inscrição do Participante.
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return retorna o id do Participante do Evento.
     */
    public int getParticipante() {
        return participante;
    }

    /**
     * @param participante recebe o id do Participante do Evento.
     */
    public void setParticipante(int participante) {
        this.participante = participante;
    }
}
