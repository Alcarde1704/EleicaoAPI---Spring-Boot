package com.example.Eleicao.models;

import javax.persistence.*;

@Entity
public class Voto {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Eleitor eleitor;

    @ManyToOne
    private Candidato candidato;

    @ManyToOne
    private Urna urna;

    public Voto() {
    }

    public Voto(Eleitor eleitor, Candidato candidato, Urna urna){
        this.eleitor = eleitor;
        this.candidato = candidato;
        this.urna = urna;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Eleitor getEleitor() {
        return eleitor;
    }

    public void setEleitor(Eleitor eleitor) {
        this.eleitor = eleitor;
    }

    public Candidato getCandidato() {
        return candidato;
    }

    public void setCandidato(Candidato candidato) {
        this.candidato = candidato;
    }

    public Urna getUrna() {
        return urna;
    }

    public void setUrna(Urna urna) {
        this.urna = urna;
    }
}
