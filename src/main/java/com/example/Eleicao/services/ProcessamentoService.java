package com.example.Eleicao.services;

import com.example.Eleicao.models.Candidato;
import com.example.Eleicao.repository.CandidatoRepository;
import com.example.Eleicao.repository.VotoRepository;
import com.example.Eleicao.services.dto.ProcessamentoDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProcessamentoService {

    @Autowired
    private VotoRepository votoRepository;

    @Autowired
    private CandidatoRepository candidatoRepository;
    public List<ProcessamentoDto> apuracao(){
        Candidato candidatoBolsonaro = candidatoRepository.findByNumero(22);
        Candidato candidatoLula = candidatoRepository.findByNumero(13);

        Long votosBolsonaro = votoRepository.countByCandidato(candidatoBolsonaro);
        ProcessamentoDto processamentoBolsonaro = new ProcessamentoDto(candidatoBolsonaro, votosBolsonaro);

        Long votosLula = votoRepository.countByCandidato(candidatoLula);
        ProcessamentoDto processamentoLula = new ProcessamentoDto(candidatoLula, votosLula);

        List<ProcessamentoDto> apuracoes = new ArrayList<>();
        apuracoes.add(processamentoBolsonaro);
        apuracoes.add(processamentoLula);
        return apuracoes;

    }

}
