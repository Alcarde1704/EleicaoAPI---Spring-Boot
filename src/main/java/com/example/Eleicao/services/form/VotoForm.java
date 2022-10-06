package com.example.Eleicao.services.form;

public class VotoForm {

    private String tituloEleitor;

    private int numeroCandidato;

    private int urna_id = 1;

    public String getTituloEleitor() {
        return tituloEleitor;
    }

    public void setTituloEleitor(String tituloEleitor) {
        this.tituloEleitor = tituloEleitor;
    }

    public int getNumeroCandidato() {
        return numeroCandidato;
    }

    public void setNumeroCandidato(int numeroCandidato) {
        this.numeroCandidato = numeroCandidato;
    }

    public int getUrna_id() {
        return urna_id;
    }

    public void setUrna_id(int urna_id) {
        this.urna_id = urna_id;
    }
}
