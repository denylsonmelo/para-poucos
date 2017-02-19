package br.edu.ifpi.capar.para.poucos.dao;
import br.edu.ifpi.capar.para.poucos.modelo.Evento;
import java.util.List;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

/**
 *
 * @author Lucas Fontenele
 */
public class EventoDAO {

    @Inject
    private EntityManager em;

    public List<Evento> buscarTodos(){
        TypedQuery<Evento> query = em.
                createQuery("select c from Evento c", Evento.class);
        return query.getResultList();
    }
    
//    @Transactional
//    public void cadastrar(Evento evento){
//        em.persist(evento);
//    }
}
