package br.edu.ifpi.capar.para.poucos.mb;
import br.edu.ifpi.capar.para.poucos.dao.OrganizadorDAO;
import br.edu.ifpi.capar.para.poucos.dao.ParticipanteDAO;
import br.edu.ifpi.capar.para.poucos.modelo.Organizador;
import br.edu.ifpi.capar.para.poucos.modelo.Participante;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Lucas
 */

@Named
@RequestScoped
public class ListarParticipantesBean {

    @Inject
    private ParticipanteDAO dao;
    private List<Participante> participante;

    @PostConstruct
    private void init(){
        this.participante = dao.buscarTodos();
    }
    
    public List<Participante> getParticipante() {
        return participante;
    }   
}



