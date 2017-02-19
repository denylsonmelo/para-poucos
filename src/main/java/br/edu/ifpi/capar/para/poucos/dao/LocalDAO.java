package br.edu.ifpi.capar.para.poucos.dao;
import br.edu.ifpi.capar.para.poucos.modelo.Local;
import java.util.List;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

/**
 *
 * @author Lucas Fontenele
 */
public class LocalDAO {

    @Inject
    private EntityManager em;

    public List<Local> buscarTodos(){
        TypedQuery<Local> query = em.
                createQuery("select c from Local c", Local.class);
        return query.getResultList();
    }
    
//    @Transactional
//    public void cadastrar(Evento evento){
//        em.persist(evento);
//    }
}
