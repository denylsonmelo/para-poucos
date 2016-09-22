package br.edu.ifpi.capar.para.poucos.generico;

import java.io.Serializable;
import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author Denylson Melo
 * @author Lucas Fontenele
 * @author Diovanna Araujo
 */
@Entity
public class EntidadeGenerica implements Serializable {

    @Id
    private int id;
    private LocalDateTime dataCriacao;
    private LocalDateTime dataModificacao;

    /**
     * @return ID de entidade generica
     */
    public int getId() {
        return id;
    }
    
    /**
     * @param id de entidade generica
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return Data/Time local 
     */
    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }
    
    /**
     * @param dataCriacao é descrita
     */
    public void setDataCriacao(LocalDateTime dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    /**
     * @return data modificada
     */
    public LocalDateTime getDataModificacao() {
        return dataModificacao;
    }

    /**
     * @param dataModificacao 
     * Descrever data de modificação
     */
    public void setDataModificacao(LocalDateTime dataModificacao) {
        this.dataModificacao = dataModificacao;
    }  
}
