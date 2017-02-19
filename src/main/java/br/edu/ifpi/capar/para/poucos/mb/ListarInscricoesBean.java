package br.edu.ifpi.capar.para.poucos.mb;
import br.edu.ifpi.capar.para.poucos.dao.InscricaoDAO;
import br.edu.ifpi.capar.para.poucos.modelo.Inscricao;
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
public class ListarInscricoesBean {

    @Inject
    private InscricaoDAO dao;
    private List<Inscricao> inscricao;

    @PostConstruct
    private void init(){
        this.inscricao = dao.buscarTodos();
    }
    
    public List<Inscricao> getInscricoes() {
        return inscricao;
    }
    
    
}



