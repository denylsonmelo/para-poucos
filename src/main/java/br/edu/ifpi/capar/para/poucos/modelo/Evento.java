package br.edu.ifpi.capar.para.poucos.modelo;

import br.edu.ifpi.capar.para.poucos.generico.EntidadeGenerica;

/* @author SOFTWARE III */
public class Evento extends EntidadeGenerica{

    private String nome;
    private String data;
    private int horario;
    private int idadeMinima;
    private int tipo;
    private boolean aceitarInstituicao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getHorario() {
        return horario;
    }

    public void setHorario(int horario) {
        this.horario = horario;
    }

    public int getIdadeMinima() {
        return idadeMinima;
    }

    public void setIdadeMinima(int idadeMinima) {
        this.idadeMinima = idadeMinima;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public boolean isAceitarInstituicao() {
        return aceitarInstituicao;
    }

    public void setAceitarInstituicao(boolean aceitarInstituicao) {
        this.aceitarInstituicao = aceitarInstituicao;
    }

}
