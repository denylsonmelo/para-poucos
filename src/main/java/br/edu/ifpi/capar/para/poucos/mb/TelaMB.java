package br.edu.ifpi.capar.para.poucos.mb;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 * TODO para que a classe serve
 *
 * @author Diovanna Araujo da Silva
 * @author Denylson Melo
 * @author Ana Flávia
 * @author Lucas Fontenele
 */
@Named("mbTela")
@RequestScoped
public class TelaMB {

    //TODO coloca algum lembrete
    private String nome = "sistema web gerenciador de eventos";

    /**
     * @return nomeModificado
     */
    public String getNomeModificado() {
        return nome + "mais alguma coisa";
    }
}
