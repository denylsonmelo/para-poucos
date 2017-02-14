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
    private String nome = "";

    /**
     * @return nomeModificado
     */
    public String getNomeModificado() {
        return nome;
        /*
        switch(valorEscolhido){
            case 'participante':
                break;
            case 'realizador' :
        }
        
        na tela
        <h:selectOneMenu id="txt3" value="#{managerBean.valorEscolhido}" required="true" label="Text 3">
                <f:selectItem itemLabel="Select One" itemValue="" noSelectionOption="true" />
                <f:selectItem itemLabel="Option 1" itemValue="participante" />
                <f:selectItem itemLabel="Option 2" itemValue="realizador" />
        </h:selectOneMenu>
        
        
        email : ifpisoftware3@gmail.com
        senhas: gatinhosegatinhas
        */
    }
}
