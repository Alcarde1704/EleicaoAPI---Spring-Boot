package com.example.Eleicao.services.form;

import com.example.Eleicao.models.Eleitor;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.br.CPF;
import org.hibernate.validator.constraints.br.TituloEleitoral;

import javax.validation.constraints.NotBlank;

public class EleitorForm {

    @CPF
    private String cpf;

    @TituloEleitoral
    private String tituloeleitor;

    @NotBlank
    private String nome;


    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTituloeleitor() {
        return tituloeleitor;
    }

    public void setTituloeleitor(String tituloeleitor) {
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
