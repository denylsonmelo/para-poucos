package br.edu.ifpi.capar.para.poucos.infra.products;

import javax.enterprise.inject.Produces;
import javax.faces.component.UIViewRoot;
import javax.faces.context.FacesContext;

/**
 *
 * @author Denylson Melo
 */
public class ProdutoraCDI {
    
    @Produces
    public FacesContext criarFacesContext(){
        return FacesContext.getCurrentInstance();
    }
    
    @Produces
    public UIViewRoot criarViewRoot(){
        return criarFacesContext().getViewRoot();
    }
}
