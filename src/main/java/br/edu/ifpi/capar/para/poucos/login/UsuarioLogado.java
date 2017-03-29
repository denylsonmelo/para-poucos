package br.edu.ifpi.capar.para.poucos.login;

import java.security.Principal;
import javax.annotation.PostConstruct;
import javax.enterprise.inject.Model;
import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author Denylson Melo
 */
@Model
//@RequestScoped
//@Named
public class UsuarioLogado {
    
    @Inject
    private HttpServletRequest request;
    @Inject
    private SegurancaDAO segurancaDAO;
    private UsuarioSistema usuarioSistema;
    
    public UsuarioSistema get(){
        return this.usuarioSistema;
    }
    
    @PostConstruct
    private void carregarUsuarioSistema(){
        Principal principal = request.getUserPrincipal();
        if(principal != null){
            this.usuarioSistema = segurancaDAO.carregaUsuarioPorUsername((principal.getName()));
        }
    }
}
