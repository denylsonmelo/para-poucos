package br.edu.ifpi.capar.para.poucos.mb;

import br.edu.ifpi.capar.para.poucos.dao.ContratanteDAO;
import br.edu.ifpi.capar.para.poucos.infra.constant.FacesConstant;
import br.edu.ifpi.capar.para.poucos.infra.message.MessageUtils;
import br.edu.ifpi.capar.para.poucos.modelo.Contratante;
import java.io.Serializable;
import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;
import org.omnifaces.cdi.ViewScoped;

/**
 *
 * @author Denylson Melo
 */
@Named
@ViewScoped
public class CarregarContratanteBean implements Serializable {

    private int id;
    private Contratante contratante;
    @Inject
    private ContratanteDAO dao;
    @Inject
    private MessageUtils message;
    
    @Transactional
    public void atualizar() {
        dao.atualizar(contratante);
        message.adicionarInformacao("Cadastro atualizado");
    }

    @Transactional
    public String excluir() {
        //dao.excluir(contratante);
        message.adicionarInformacao("Cadastro excluido").persistente();
        return "index" + "?" + FacesConstant.FACES_REDIRECT;
    }

    public void carregarContratante() {
        this.contratante = dao.buscarPorId(this.id);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Contratante getContratante() {
        return contratante;
    }

    public void setContratante(Contratante contratante) {
        this.contratante = contratante;
    }

}
