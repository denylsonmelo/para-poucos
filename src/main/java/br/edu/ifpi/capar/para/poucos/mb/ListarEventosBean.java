package br.edu.ifpi.capar.para.poucos.mb;
import br.edu.ifpi.capar.para.poucos.dao.EventoDAO;
import br.edu.ifpi.capar.para.poucos.modelo.Evento;
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
public class ListarEventosBean {

    @Inject
    private EventoDAO dao;
    private List<Evento> eventos;

    @PostConstruct
    private void init(){
        this.eventos = dao.buscarTodos();
    }
    
    public List<Evento> getEventos() {
        return eventos;
    }
    
    
}



