package com.example.Eleicao.models;

import javax.persistence.*;

@Entity
@Table(name = "eleitor")
public class Eleitor {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String cpf;
    private String tituloeleitor;
    private String nome;


    public Eleitor(){}

    public Eleitor(String cpf, String tituloeleitor, String nome){
        this.cpf = cpf;
        this.tituloeleitor = tituloeleitor;
        this.nome = nome;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTituloEleitor() {
        return tituloeleitor;
    }

    public void setTituloEleitor(String tituloEleitor) {
        this.tituloeleitor = tituloEleitor;
    }
}