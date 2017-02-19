package br.edu.ifpi.capar.para.poucos.mb;
import br.edu.ifpi.capar.para.poucos.dao.InscricaoDAO;
import br.edu.ifpi.capar.para.poucos.dao.LocalDAO;
import br.edu.ifpi.capar.para.poucos.modelo.Inscricao;
import br.edu.ifpi.capar.para.poucos.modelo.Local;
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
public class ListarLocaisBean {

    @Inject
    private LocalDAO dao;
    private List<Local> local;

    @PostConstruct
    private void init(){
        this.local = dao.buscarTodos();
    }
    
    public List<Local> getLocal() {
        return local;
    }
    
    
}



