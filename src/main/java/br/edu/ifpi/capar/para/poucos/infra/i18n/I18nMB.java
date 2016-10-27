package br.edu.ifpi.capar.para.poucos.infra.i18n;

import br.edu.ifpi.capar.para.poucos.infra.constant.SystemConstant;
import java.io.Serializable;
import java.util.Locale;
import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Denylson Melo
 */
@SessionScoped
@Named("mbI18n")
public class I18nMB implements Serializable {

    @Inject
    private FacesContext context;
    private Locale locale;

    @PostConstruct
    private void loadDefaultLocale() {
        this.locale = context.getApplication().getDefaultLocale();
    }

    public String trocaIdioma(String idioma) {
        this.locale = new Locale(idioma);
        return SystemConstant.REDIRECT_TO_INDEX;
    }

    public Locale getLocale() {
        return this.locale;
    }
}
