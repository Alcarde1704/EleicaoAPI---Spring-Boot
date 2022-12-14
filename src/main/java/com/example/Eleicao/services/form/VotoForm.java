package com.example.Eleicao.services.form;

import com.example.Eleicao.models.Voto;
import org.hibernate.validator.constraints.br.TituloEleitoral;

import javax.validation.constraints.Min;

public class VotoForm {

    @TituloEleitoral
    private String titulo;

    @Min(2)
    private int numeroCandidato;


    private String bloco;

    private int sala;



    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumeroCandidato() {
        return numeroCandidato;
    }

    public void setNumeroCandidato(int numeroCandidato) {
        this.numeroCandidato = numeroCandidato;
    }

    public String getBloco() {
        return bloco.toUpperCase();
    }

    public void setBloco(String bloco) {
        this.bloco = bloco;
    }

    public int getSala() {
        return sala;
    }

    public void setSala(int sala) {
        this.sala = sala;
    }
}
