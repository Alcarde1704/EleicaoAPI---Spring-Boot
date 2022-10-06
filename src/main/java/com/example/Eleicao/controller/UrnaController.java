package com.example.Eleicao.controller;

import com.example.Eleicao.services.UrnaService;
import com.example.Eleicao.services.dto.VotoDto;
import com.example.Eleicao.services.form.VotoForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@RestController
@RequestMapping("/urna")
public class UrnaController {

    @Autowired
    private UrnaService urnaService;

    @GetMapping
    public List<VotoDto> listaVotos(@RequestParam(defaultValue = "0") int numero){
        return this.urnaService.listaVotos(numero);
    }

    @PostMapping
    public ResponseEntity<VotoDto> votar(@RequestBody VotoForm votoForm, UriComponentsBuilder uriComponentsBuilder){
        return this.urnaService.votar(votoForm, uriComponentsBuilder);

    }

}
