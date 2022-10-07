package com.example.Eleicao.services.dto;

import com.example.Eleicao.models.Candidato;

public class ApuracaoDto {

    private String candidato;

    private Long total;

    private Long id;

    public ApuracaoDto(Candidato candidato, Long total){
        this.candidato = candidato.getNome();
        this.total = total;
        this.id = candidato.getId();
    }

    public String getCandidato() {
        return candidato;
    }

    public void setCandidato(String candidato) {
        this.candidato = candidato;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

}
