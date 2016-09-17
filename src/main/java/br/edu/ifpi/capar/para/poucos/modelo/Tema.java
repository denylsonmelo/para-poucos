package br.edu.ifpi.capar.para.poucos.modelo;

/* @author SOFTWARE III */
/* @author Ana Flavia*/
public class Tema {
    private int CodTema;
    private String nomeTema;
    private String descricao;

    public int getCodTema() {
        return CodTema;
    }

    public void setCodTema(int CodTema) {
        this.CodTema = CodTema;
    }

    public String getNomeTema() {
        return nomeTema;
    }

    public void setNomeTema(String nomeTema) {
        this.nomeTema = nomeTema;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
