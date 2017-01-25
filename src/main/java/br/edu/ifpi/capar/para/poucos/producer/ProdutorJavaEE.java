package br.edu.ifpi.capar.para.poucos.producer;

import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Denylson Melo
 */
public class ProdutorJavaEE {

    @PersistenceContext(unitName = "para-poucosPU")
    @Produces 
    EntityManager em;
}
