package com.example.Eleicao.services.dto;

import com.example.Eleicao.models.Eleitor;

import java.util.List;
import java.util.stream.Collectors;

public class EleitorDto {

    private Long id;

    private String nome;

    private String tituloeleitor;

    public EleitorDto(Eleitor eleitor){
        this.id = eleitor.getId();
        this.nome = eleitor.getNome();
        this.tituloeleitor = eleitor.getTituloEleitor();
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

    public String getTituloeleitor() {
        return tituloeleitor;
    }

    public void setTituloeleitor(String tituloeleitor) {
        this.tituloeleitor = tituloeleitor;
    }




    public static List<EleitorDto> converter(List<Eleitor> eleitores){
        return eleitores.stream().map(EleitorDto::new).collect(Collectors.toList());
    }
}
