package br.edu.ifpi.capar.para.poucos.mb;

import br.edu.ifpi.capar.para.poucos.dao.ContratanteDAO;
import br.edu.ifpi.capar.para.poucos.modelo.Contratante;
import java.util.Arrays;
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
    private boolean exibirCombos = false;

    @PostConstruct
    private void init(){
        this.contratantes = dao.buscarTodos();
    }
    
    public List<Contratante> getContratantes() {
        return contratantes;
    }
    
    public boolean deveExibir(){
        return this.exibirCombos;
    }
    
    public void mudarExibicao(){
        this.exibirCombos = true;
    }
}
