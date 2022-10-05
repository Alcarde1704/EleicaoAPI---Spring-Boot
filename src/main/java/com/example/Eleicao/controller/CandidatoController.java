package com.example.Eleicao.controller;

import com.example.Eleicao.services.CandidatoService;
import com.example.Eleicao.services.dto.CandidatoDto;
import com.example.Eleicao.services.form.CandidatoForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/candidatos")
public class CandidatoController {

    @Autowired
    private CandidatoService candidatoService;

    @GetMapping()
    public List<CandidatoDto> listaCandidatos(){
        return this.candidatoService.listaCandidatos();
    }

    @PostMapping()
    public ResponseEntity<CandidatoDto> cadastrar(@Valid @RequestBody CandidatoForm candidatoForm, UriComponentsBuilder uriComponentsBuilder){

        return this.candidatoService.cadastrar(candidatoForm, uriComponentsBuilder);
    }





}
