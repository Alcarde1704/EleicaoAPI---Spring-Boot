package com.example.Eleicao.services;

import com.example.Eleicao.models.Candidato;
import com.example.Eleicao.repository.CandidatoRepository;
import com.example.Eleicao.services.dto.CandidatoDto;
import com.example.Eleicao.services.dto.EleitorDto;
import com.example.Eleicao.services.form.CandidatoForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;

@Service
public class CandidatoService {

    @Autowired
    private CandidatoRepository candidatoRepository;

    public List<CandidatoDto> listaCandidatos(){
        List<Candidato> candidatos = candidatoRepository.findAll();
        return CandidatoDto.converter(candidatos);
    }

    public ResponseEntity<CandidatoDto> cadastrar(CandidatoForm candidatoForm, UriComponentsBuilder uriComponentsBuilder){
        Candidato candidato = candidatoForm.converter();

        Candidato validaCandidato = candidatoRepository.findByNumero(candidato.getNumero());

        if (validaCandidato != null){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        } else {
            candidatoRepository.save(candidato);
            URI uri = uriComponentsBuilder.path("/eleitor/{id}").buildAndExpand(candidato.getId()).toUri();
            return ResponseEntity.created(uri).body(new CandidatoDto(candidato));
        }

    }



}
