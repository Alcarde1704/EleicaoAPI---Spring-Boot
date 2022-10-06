package com.example.Eleicao.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Urna {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String bloco;

    private String sala;
}
