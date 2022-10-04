package com.example.Eleicao.models;

import javax.persistence.*;

@Entity
@Table(name = "eleitor")
public class Eleitor {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private Long cpf;
    private Long tituloeleitor;
    private String nome;


    public Eleitor(){}

    public Eleitor(Long cpf, Long tituloeleitor, String nome){
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

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getTituloEleitor() {
        return tituloeleitor;
    }

    public void setTituloEleitor(Long tituloEleitor) {
        this.tituloeleitor = tituloEleitor;
    }
}