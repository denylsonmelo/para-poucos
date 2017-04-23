package br.edu.ifpi.capar.para.poucos.mb;

import br.edu.ifpi.capar.para.poucos.dao.ContratanteDAO;
import br.edu.ifpi.capar.para.poucos.modelo.Contratante;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.inject.Model;
import javax.inject.Inject;

/**
 *
 * @author Denylson Melo
 */
@Model
public class ExemploConverterContratanteBean implements Serializable{

    @Inject
    private ContratanteDAO dao;
    private Contratante contratanteSelecionado;
    private List<Contratante> contratantes;

    @PostConstruct
    private void init() {
        this.contratantes = dao.buscarTodos();
    }

    public Contratante getContratanteSelecionado() {
        return contratanteSelecionado;
    }

    public void setContratanteSelecionado(Contratante contratanteSelecionado) {
        this.contratanteSelecionado = contratanteSelecionado;
    }

    public List<Contratante> getContratantes() {
        return contratantes;
    }
}
