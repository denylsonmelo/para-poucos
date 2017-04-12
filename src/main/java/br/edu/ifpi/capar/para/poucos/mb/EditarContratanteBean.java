package br.edu.ifpi.capar.para.poucos.mb;

import br.edu.ifpi.capar.para.poucos.dao.ContratanteDAO;
import br.edu.ifpi.capar.para.poucos.modelo.Contratante;
import javax.enterprise.inject.Model;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.transaction.Transactional;

/**
 *
 * @author Denylson Melo
 */
@Model
public class EditarContratanteBean {
    
    @Inject
    private ContratanteDAO dAO;
    private Contratante contratante = new Contratante();
    @Inject
    private FacesContext context;

    @Transactional
    public void atualizar(){
        dAO.cadastrar(contratante);
        /*enviadorDeEmail.
                envia("ifpisoftware3@gmail.com", 
                "anaflaviasabinoalburquerque@gmail.com", 
                "Contratante cadastrado", "Você foi cadastrado, uhu!!!");
        */
        context.addMessage(null, 
                new FacesMessage(FacesMessage.SEVERITY_INFO, "Cadastro atualizado", "Cadastro muito bem atualizado"));
    }

    public Contratante getContratante() {
        return contratante;
    }

    public void setContratante(Contratante contratante) {
        this.contratante = contratante;
    }
}
