package br.edu.ifpi.capar.para.poucos.dao;

import br.edu.ifpi.capar.para.poucos.modelo.Contratante;
import java.util.Arrays;
import java.util.List;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

/**
 *
 * @author Denylson Melo
 */
public class ContratanteDAO {

    @Inject
    private EntityManager em;

    public List<Contratante> buscarTodos(){
        TypedQuery<Contratante> query = em.
                createQuery("select c from Contratante c", Contratante.class);
        return query.getResultList();
    }
    
    public List<String> buscarEnderecos(){
        TypedQuery<String> query = em.
                createQuery("select c.endereco from Contratante c group by c.endereco order by c.endereco asc", String.class);
        return query.getResultList();
    }
    
    public void cadastrar(Contratante contratante){
        em.persist(contratante);
    }
}
