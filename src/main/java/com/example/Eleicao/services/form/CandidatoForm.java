package com.example.Eleicao.services.form;

import com.example.Eleicao.models.Candidato;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;


public class CandidatoForm {

    @NotBlank
    @Size(min = 5, max = 100)
    private String nome;

    @Min(value = 2, message = "Deve ser um número maior que 1 digito")
    @Max(value = 100)
    private int numero;

    @NotBlank
    private String partido;

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

    public String getPartido() {
        return partido;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }

    public Candidato converter(){
        return new Candidato(this.nome, this.numero, this.partido);
    }


}
