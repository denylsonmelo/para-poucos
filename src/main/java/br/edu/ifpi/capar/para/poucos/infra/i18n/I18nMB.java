package br.edu.ifpi.capar.para.poucos.infra.i18n;

import java.io.Serializable;
import java.util.Locale;
import javax.enterprise.context.SessionScoped;
import javax.faces.component.UIViewRoot;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Denylson Melo
 */
@SessionScoped
@Named("mbI18n")
public class I18nMB implements Serializable{
    
    @Inject
    private UIViewRoot viewRoot;
    
    public void trocaIdioma(String idioma){
        System.out.println(idioma);
        viewRoot.setLocale(Locale.ITALY);
    }
}
