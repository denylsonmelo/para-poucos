package br.edu.ifpi.capar.para.poucos.dao;
import br.edu.ifpi.capar.para.poucos.modelo.Organizador;
import java.util.List;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

/**
 *
 * @author Lucas Fontenele
 */
public class OrganizadorDAO {

    @Inject
    private EntityManager em;

    public List<Organizador> buscarTodos(){
        TypedQuery<Organizador> query = em.
                createQuery("select c from Organizador c", Organizador.class);
        return query.getResultList();
    }
    
//    @Transactional
//    public void cadastrar(Evento evento){
//        em.persist(evento);
//    }
}
