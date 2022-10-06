package com.example.Eleicao.services.dto;

import com.example.Eleicao.models.Candidato;
import com.example.Eleicao.models.Eleitor;

import java.util.List;
import java.util.stream.Collectors;

public class CandidatoDto {
    private Long id;

    private String nome;

    private int numero;

    private String partido;

    public CandidatoDto(Candidato candidato){
        this.id = candidato.getId();
        this.nome = candidato.getNome();
        this.numero = candidato.getNumero();
        this.partido = candidato.getPartido();
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

    public static List<CandidatoDto> converter(List<Candidato> candidatos){
        return candidatos.stream().map(CandidatoDto::new).collect(Collectors.toList());
    }
}
