package br.edu.ifpi.capar.para.poucos.infra.converter;

import br.edu.ifpi.capar.para.poucos.dao.ContratanteDAO;
import br.edu.ifpi.capar.para.poucos.modelo.Contratante;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.inject.Inject;

/**
 *
 * @author Denylson Melo
 */
@FacesConverter(value = "ContratanteConverter")
public class ContratanteConverter implements Converter {

    @Inject
    private ContratanteDAO dao;

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        if (value == null || value.isEmpty()) {
            return null;
        } else {
            int id = Integer.valueOf(value);
            Contratante contratante = dao.buscarPorId(id);
            return contratante;
        }
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        if (value == null || value.toString().isEmpty()) {
            return null;
        } else {
            Contratante contratante = (Contratante) value;
            int id = contratante.getId();
            return String.valueOf(id);
        }
    }
}
