package com.example.Eleicao.services.dto;

import com.example.Eleicao.models.Candidato;


public class ProcessamentoDto {

    private Long id;

    private String nome;

    private int numeroCandidato;

    private Long votos;

    public ProcessamentoDto(Candidato candidato, Long votos){
        this.id = candidato.getId();
        this.nome = candidato.getNome();
        this.numeroCandidato = candidato.getNumero();
        this.votos = votos;
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

    public int getNumeroCandidato() {
        return numeroCandidato;
    }

    public void setNumeroCandidato(int numeroCandidato) {
        this.numeroCandidato = numeroCandidato;
    }

    public Long getVotos() {
        return votos;
    }

    public void setVotos(Long votos) {
        this.votos = votos;
    }

}
