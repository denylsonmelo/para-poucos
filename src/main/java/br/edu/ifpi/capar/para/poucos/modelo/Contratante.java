package br.edu.ifpi.capar.para.poucos.modelo;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

/**
 * Classe com as especificações de Contratante.
 * @author Diovanna Araujo da Silva
 * @author Denylson Melo
 * @author Lucas Fontenele
 * @author Ramon jose
 * @author Lucas Rafael
 * @author Ana Flavia
 * @author Gregorio Magno
 * @author Jean Jr
 * @author Vanessa Pinto
 * @author Arllayne Carvalho
 * @author Endrilenne Véras
 * @author Ruan Vinicios
 */
@Entity // indica que objetos dessa classe se tornem "persistíveis" no banco de dados. 
@SequenceGenerator(name = "SequenceContratante", allocationSize = 1, sequenceName = "contratante_id_seq")
public class Contratante implements Serializable {
    
    @Id // indica que o atributo id é nossa chave primária.
    @GeneratedValue(generator = "SequenceContratante")
    private int id;
    
    private String cpf;
    private String nome;
    private String endereco;

    /**
     * @return retorna o numero de cpf do Contratante.
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf recebe o cpf do Contratante.
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return retorna o nome do Contratante.
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome recebe o nome do Contratante.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return retorna o endereço do Contratante.
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco recebe o endereço do Contratante.
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * @return retorna o id do Contratante.
     */
    public int getId() {
        return id;
    }

    /**
     * @param id recebe o id do Contratante.
     */
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Contratante{" + "id=" + id + ", cpf=" + cpf + ", nome=" + nome + ", endereco=" + endereco + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Contratante other = (Contratante) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
}
