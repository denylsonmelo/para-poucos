package br.edu.ifpi.capar.para.poucos.mb;

import br.edu.ifpi.capar.para.poucos.infra.mail.EnviadorDeEmail;
import br.edu.ifpi.capar.para.poucos.dao.ContratanteDAO;
import br.edu.ifpi.capar.para.poucos.modelo.Contratante;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
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
    private FacesContext context;
    
    @Transactional
    public void cadastrar(){
        dAO.cadastrar(contratante);
        /*enviadorDeEmail.
                envia("ifpisoftware3@gmail.com", 
                "anaflaviasabinoalburquerque@gmail.com", 
                "Contratante cadastrado", "Você foi cadastrado, uhu!!!");
        */
        context.addMessage(null, 
                new FacesMessage(FacesMessage.SEVERITY_INFO, "Cadastro feito", "Cadastro muito bem feito"));
    }

    public Contratante getContratante() {
        return contratante;
    }

    public void setContratante(Contratante contratante) {
        this.contratante = contratante;
    }
}
