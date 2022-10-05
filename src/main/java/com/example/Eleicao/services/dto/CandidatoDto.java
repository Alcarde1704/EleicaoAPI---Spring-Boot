package com.example.Eleicao.services.dto;

import com.example.Eleicao.models.Candidato;
import com.example.Eleicao.models.Eleitor;

import java.util.List;
import java.util.stream.Collectors;

public class CandidatoDto {
    private Long id;

    private String nome;

    private int numero;

    public CandidatoDto(Candidato candidato){
        this.id = candidato.getId();
        this.nome = candidato.getNome();
        this.numero = candidato.getNumero();
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


    public static List<CandidatoDto> converter(List<Candidato> candidatos){
        return candidatos.stream().map(CandidatoDto::new).collect(Collectors.toList());
    }
}
