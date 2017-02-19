package br.edu.ifpi.capar.para.poucos.dao;
import br.edu.ifpi.capar.para.poucos.modelo.Participante;
import java.util.List;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

/**
 *
 * @author Lucas Fontenele
 */
public class ParticipanteDAO {

    @Inject
    private EntityManager em;

    public List<Participante> buscarTodos(){
        TypedQuery<Participante> query = em.
                createQuery("select c from Participante c", Participante.class);
        return query.getResultList();
    }
    
//    @Transactional
//    public void cadastrar(Evento evento){
//        em.persist(evento);
//    }
}
