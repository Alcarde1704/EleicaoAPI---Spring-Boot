package com.example.Eleicao.repository;

import com.example.Eleicao.models.Candidato;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidatoRepository extends JpaRepository<Candidato, Long> {

    public Candidato findByNumero(int numero);
}
