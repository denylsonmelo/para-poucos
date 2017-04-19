package br.edu.ifpi.capar.para.poucos.dao;

import br.edu.ifpi.capar.para.poucos.modelo.Contratante;
import java.io.Serializable;
import java.util.List;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

/**
 *
 * @author Denylson Melo
 */
public class ContratanteDAO implements Serializable{

    @Inject
    private EntityManager manager;

    public List<Contratante> buscarTodos() {
        TypedQuery<Contratante> query = manager.
                createQuery("select c from Contratante c", Contratante.class);
        return query.getResultList();
    }

    public List<String> buscarEnderecos() {
        TypedQuery<String> query = manager.
                createQuery("select c.endereco from Contratante c group by c.endereco order by c.endereco asc", String.class);
        return query.getResultList();
    }

    public void cadastrar(Contratante contratante) {
        manager.persist(contratante);
    }

    public Contratante buscarPorId(int id) {
        return manager.find(Contratante.class, id);
    }

    public void atualizar(Contratante contratante) {
        manager.merge(contratante);
    }

    public void excluir(Contratante contratante) {
        manager.remove(manager.contains(contratante) ? contratante : manager.merge(contratante));
    }
}
