package br.edu.ifpi.capar.para.poucos.mb;

import br.edu.ifpi.capar.para.poucos.dao.ContratanteDAO;
import br.edu.ifpi.capar.para.poucos.modelo.Contratante;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Denylson Melo
 */
@Named
@RequestScoped
public class ListarContratanteBean {

    @Inject
    private ContratanteDAO dao;
    private List<Contratante> contratantes;

    @PostConstruct
    private void init(){
        this.contratantes = dao.buscarTodos();
    }
    
    public List<Contratante> getContratantes() {
        return contratantes;
    }
    
    public List<String> getEnderecos() {
        return dao.buscarEnderecos();
    }
}
