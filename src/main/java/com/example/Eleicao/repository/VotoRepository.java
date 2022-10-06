package com.example.Eleicao.repository;

import com.example.Eleicao.models.Candidato;
import com.example.Eleicao.models.Eleitor;
import com.example.Eleicao.models.Voto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VotoRepository extends JpaRepository<Voto, Long> {


    public Voto findByEleitor(Eleitor eleitor);

    public List<Voto> findByCandidato(Candidato candidato);

    public Long countByCandidato(Candidato candidato);
}
