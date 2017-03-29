package br.edu.ifpi.capar.para.poucos.login;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Denylson Melo
 */
public class SegurancaDAO {

    @PersistenceContext
    private EntityManager em;
    
    public UsuarioSistema carregaUsuarioPorUsername(String username) {
        String jpql = "select u from UsuarioSistema u where u.email = :login";
        
        UsuarioSistema usuario = em.createQuery(jpql, UsuarioSistema.class)
                .setParameter("login", username)
                .getSingleResult();
        
        usuario.setSenha(null);
        
        return usuario;
    }
    
}
