/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpi.capar.para.poucos.dao;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Denylson Melo
 * @author Lucas Fontenele
 */
public class TestarConnection {

    public static void main(String[] args) {
        EntityManagerFactory emf = null;
        EntityManager em = null;
        try {

            emf = Persistence.createEntityManagerFactory("para-poucosPU");
            em = emf.createEntityManager();

        } catch (Exception e) {
            System.out.println();
        } finally {
            em.close();
            emf.close();
        }
        /*
        Jogador jogador = new Jogador("seijuh", "Denylson Melo",
                LocalDate.of(1988, Month.NOVEMBER, 17).atStartOfDay(),
                "masculino", 1);

        Jogador jogador2 = new Jogador("patrick", "Patrick",
                LocalDate.of(1988, Month.NOVEMBER, 17).atStartOfDay(),
                "masculino", 2);

        jogador2.setDeletado(true);

        em.getTransaction().begin();
        em.persist(jogador);
        em.persist(jogador2);
        em.getTransaction().commit();

        List<Jogador> jogadors = em.createQuery("select j from Jogador j where j.deletado = :deletado", Jogador.class)
                .setParameter("deletado", false)
                .getResultList();

        for (Jogador jogadorBanco : jogadors) {
            System.out.println(jogadorBanco);
        }

        /*  
        jogadorRecuperadoDoBanco.setNome("denylson melo pereira");
        
        em.getTransaction().begin();
        em.merge(jogador);
        em.getTransaction().commit();
         */

    }
}
