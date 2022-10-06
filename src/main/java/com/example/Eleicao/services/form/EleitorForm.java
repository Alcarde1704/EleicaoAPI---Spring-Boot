package com.example.Eleicao.services.form;

import com.example.Eleicao.models.Eleitor;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.br.CPF;
import org.hibernate.validator.constraints.br.TituloEleitoral;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class EleitorForm {

    @CPF
    private String cpf;

    @TituloEleitoral
    private String titulo;

    @NotBlank
    @Size(min = 5, max = 200)
    private String nome;


    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Eleitor converter(){
        String cpfNovo = cpf.replaceAll("\\p{Punct}", "");

        return new Eleitor(cpfNovo, titulo, nome);
    }
}
