package br.edu.ifpi.capar.para.poucos.infra.producer;

import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Denylson Melo
 */
public class JPAProducer {

    @PersistenceContext(unitName = "para-poucosPU")
    @Produces 
    EntityManager em;
}
