package br.edu.ifpi.capar.para.poucos.mb;

import javax.faces.bean.ManagedBean;

/**TODO
 * para que a classe serve
 *@author Diovanna Araujo
 * @author Denylson Melo
 * @author Ana Flávia
 * @author Lucas Fontenele
 */
@ManagedBean(name = "mbTela")
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
