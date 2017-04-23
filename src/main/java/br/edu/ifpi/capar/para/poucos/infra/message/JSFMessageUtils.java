package br.edu.ifpi.capar.para.poucos.infra.message;

import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.context.Flash;
import javax.inject.Inject;

/**
 *
 * @author Denylson Melo
 */
public class JSFMessageUtils implements MessageUtils,Serializable{

    @Inject
    private FacesContext context;
    @Inject
    private Flash flash;
    
    @Override
    public MessageUtils adicionarInformacao(String sumario){
        this.adicionarInformacao(sumario, "");
        return this;
    }
    
    @Override
    public MessageUtils adicionarInformacao(String sumario, String detalhe){
        adicionarMensagem(FacesMessage.SEVERITY_INFO, sumario, detalhe);
        return this;
    }
    
    @Override
    public MessageUtils adicionarErro(String sumario){
        this.adicionarErro(sumario, "");
        return this;
    }
    
    @Override
    public MessageUtils adicionarErro(String sumario, String detalhe){
        adicionarMensagem(FacesMessage.SEVERITY_ERROR, sumario, detalhe);
        return this;
    }
    
    @Override
    public void persistente(){
        flash.setKeepMessages(true);
    }
    
    private MessageUtils adicionarMensagem(FacesMessage.Severity severity, String sumario, String detalhe){
        context.addMessage(null,
                new FacesMessage(severity, sumario, detalhe));
        return this;
    }
    
}
