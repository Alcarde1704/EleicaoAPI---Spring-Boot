package com.example.Eleicao.services.form;

import com.example.Eleicao.models.Candidato;


public class CandidatoForm {


    private String nome;

    private int numero;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Candidato converter(){
        return new Candidato(this.nome, this.numero);
    }


}
