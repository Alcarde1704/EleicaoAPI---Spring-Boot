package com.example.Eleicao.services.dto;

import com.example.Eleicao.models.Eleitor;
import com.example.Eleicao.models.Voto;

import java.util.List;
import java.util.stream.Collectors;

public class VotoDto {

    private String titulo;

    private int numeroCandidato;

    private String bloco;

    private int sala;

    public VotoDto(Voto voto){
        this.titulo = voto.getEleitor().getTitulo();
        this.numeroCandidato = voto.getCandidato().getNumero();
        this.bloco = voto.getUrna().getBloco();
        this.sala = voto.getUrna().getSala();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumeroCandidato() {
        return numeroCandidato;
    }

    public void setNumeroCandidato(int numeroCandidato) {
        this.numeroCandidato = numeroCandidato;
    }

    public String getBloco() {
        return bloco;
    }

    public void setBloco(String bloco) {
        this.bloco = bloco;
    }

    public int getSala() {
        return sala;
    }

    public void setSala(int sala) {
        this.sala = sala;
    }

    public static List<VotoDto> converter(List<Voto> votos){
        return votos.stream().map(VotoDto::new).collect(Collectors.toList());
    }
}
