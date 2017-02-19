package br.edu.ifpi.capar.para.poucos.dao;
import br.edu.ifpi.capar.para.poucos.modelo.Inscricao;
import java.util.List;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

/**
 *
 * @author Lucas Fontenele
 */
public class InscricaoDAO {

    @Inject
    private EntityManager em;

    public List<Inscricao> buscarTodos(){
        TypedQuery<Inscricao> query = em.
                createQuery("select c from Inscricao c", Inscricao.class);
        return query.getResultList();
    }
    
//    @Transactional
//    public void cadastrar(Evento evento){
//        em.persist(evento);
//    }
}
