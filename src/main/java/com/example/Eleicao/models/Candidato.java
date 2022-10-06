package com.example.Eleicao.models;

import com.example.Eleicao.services.form.CandidatoForm;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "candidato")
public class Candidato {



    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;


    private int numero;


    private String partido;


    public Candidato(){}

    public Candidato(String nome, int numero){
        this.nome = nome;
        this.numero = numero;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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
}
