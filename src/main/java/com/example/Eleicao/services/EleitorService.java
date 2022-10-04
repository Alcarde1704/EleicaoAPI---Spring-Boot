package com.example.Eleicao.services;

import com.example.Eleicao.models.Eleitor;
import com.example.Eleicao.repository.EleitorRepository;
import com.example.Eleicao.services.dto.EleitorDto;
import com.example.Eleicao.services.form.EleitorForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;

@Service
public class EleitorService {

    @Autowired
    private EleitorRepository eleitorRepository;

    public List<EleitorDto> listaEleitores(){
        List<Eleitor> eleitores = eleitorRepository.findAll();
        return EleitorDto.converter(eleitores);
    }

    public ResponseEntity<EleitorDto> cadastrar(EleitorForm eleitorForm, UriComponentsBuilder uriComponentsBuilder){

        Eleitor eleitor = eleitorForm.converter();

        eleitorRepository.save(eleitor);

        URI uri = uriComponentsBuilder.path("/eleitor/{id}").buildAndExpand(eleitor.getId()).toUri();
        return ResponseEntity.created(uri).body(new EleitorDto(eleitor));
    }

}
