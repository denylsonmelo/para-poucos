package br.edu.ifpi.capar.para.poucos.infra.message;

/**
 *
 * @author Denylson Melo
 */
public interface MessageUtils {
    
    public MessageUtils adicionarInformacao(String sumario);
    
    public MessageUtils adicionarInformacao(String sumario, String detalhe);
    
    public MessageUtils adicionarErro(String sumario);
    
    public MessageUtils adicionarErro(String sumario, String detalhe);
    
    public void persistente();
}
