package com.example.Eleicao.services;

import com.example.Eleicao.repository.CandidatoRepository;
import com.example.Eleicao.repository.VotoRepository;
import com.example.Eleicao.services.dto.ApuracaoDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProcessamentoService {

    @Autowired
    private VotoRepository votoRepository;

    @Autowired
    private CandidatoRepository candidatoRepository;
    public List<ApuracaoDto> apuracao(){


        return votoRepository.apuracao();


    }


}
