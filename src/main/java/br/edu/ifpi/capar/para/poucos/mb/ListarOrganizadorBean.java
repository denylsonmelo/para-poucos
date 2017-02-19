package br.edu.ifpi.capar.para.poucos.mb;
import br.edu.ifpi.capar.para.poucos.dao.OrganizadorDAO;
import br.edu.ifpi.capar.para.poucos.modelo.Organizador;
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
public class ListarOrganizadorBean {

    @Inject
    private OrganizadorDAO dao;
    private List<Organizador> organizador;

    @PostConstruct
    private void init(){
        this.organizador = dao.buscarTodos();
    }
    
    public List<Organizador> getOrganizador() {
        return organizador;
    }   
}



