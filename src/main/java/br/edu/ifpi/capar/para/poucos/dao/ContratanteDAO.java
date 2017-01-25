package br.edu.ifpi.capar.para.poucos.dao;

import br.edu.ifpi.capar.para.poucos.modelo.Contratante;
import java.util.Arrays;
import java.util.List;
import javax.inject.Inject;
import javax.persistence.EntityManager;

/**
 *
 * @author Denylson Melo
 */
public class ContratanteDAO {

    @Inject
    private EntityManager em;

    public List<Contratante> buscarTodos(){
        return Arrays.asList(em.find(Contratante.class, 1));
    }
}
