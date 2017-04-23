package br.edu.ifpi.capar.para.poucos.mb;

import br.edu.ifpi.capar.para.poucos.infra.mail.EnviadorDeEmail;
import br.edu.ifpi.capar.para.poucos.dao.ContratanteDAO;
import br.edu.ifpi.capar.para.poucos.infra.message.MessageUtils;
import br.edu.ifpi.capar.para.poucos.modelo.Contratante;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;

/**
 *
 * @author Denylson Melo
 */
@Named(value = "mbCadastrarContratante")
@RequestScoped
public class CadastrarContratanteBean {
    
    @Inject
    private ContratanteDAO dAO;
    private Contratante contratante = new Contratante();
    @Inject
    private EnviadorDeEmail enviadorDeEmail;
    @Inject
    private MessageUtils message;
    
    @Transactional
    public void cadastrar(){
        dAO.cadastrar(contratante);
        /*enviadorDeEmail.
                envia("ifpisoftware3@gmail.com", 
                "anaflaviasabinoalburquerque@gmail.com", 
                "Contratante cadastrado", "Você foi cadastrado, uhu!!!");
        */
        message.adicionarInformacao("Cadastro feito", "Cadastro muito bem feito");
    }

    public Contratante getContratante() {
        return contratante;
    }

    public void setContratante(Contratante contratante) {
        this.contratante = contratante;
    }
}
