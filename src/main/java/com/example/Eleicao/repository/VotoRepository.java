package com.example.Eleicao.repository;

import com.example.Eleicao.models.Candidato;
import com.example.Eleicao.models.Eleitor;
import com.example.Eleicao.models.Voto;
import com.example.Eleicao.services.dto.ApuracaoDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface VotoRepository extends JpaRepository<Voto, Long> {


    public Voto findByEleitor(Eleitor eleitor);

    public List<Voto> findByCandidato(Candidato candidato);


    @Query("SELECT NEW com.example.Eleicao.services.dto.ApuracaoDto(v.candidato as Candidato, COUNT(*) as Total) FROM Voto v GROUP BY v.candidato ORDER BY Total DESC")
    public List<ApuracaoDto> apuracao();
}
