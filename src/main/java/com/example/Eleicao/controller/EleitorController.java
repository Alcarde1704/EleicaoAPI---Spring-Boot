package com.example.Eleicao.controller;

import com.example.Eleicao.services.EleitorService;
import com.example.Eleicao.services.dto.EleitorDto;
import com.example.Eleicao.services.form.EleitorForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/eleitor", produces = "application/json")
public class EleitorController {

    @Autowired
    private EleitorService eleitorService;

    @GetMapping
    public List<EleitorDto> listaEleitores(){
        return this.eleitorService.listaEleitores();
    }

    @PostMapping
    public ResponseEntity<EleitorDto> cadastrar(@RequestBody EleitorForm eleitorForm, UriComponentsBuilder uriComponentsBuilder){
        return this.eleitorService.cadastrar(eleitorForm, uriComponentsBuilder);
    }

}
