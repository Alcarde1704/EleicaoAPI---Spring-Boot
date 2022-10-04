package com.example.Eleicao.services.form;

import com.example.Eleicao.models.Eleitor;

public class EleitorForm {

    private Long cpf;

    private Long tituloeleitor;

    private String nome;


    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public Long getTituloeleitor() {
        return tituloeleitor;
    }

    public void setTituloeleitor(Long tituloeleitor) {
        this.tituloeleitor = tituloeleitor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Eleitor converter(){
        return new Eleitor(cpf, tituloeleitor, nome);
    }
}
