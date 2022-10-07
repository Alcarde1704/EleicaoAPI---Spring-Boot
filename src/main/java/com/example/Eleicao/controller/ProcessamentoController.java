package com.example.Eleicao.controller;

import com.example.Eleicao.services.ProcessamentoService;
import com.example.Eleicao.services.dto.ApuracaoDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/processamento")
public class ProcessamentoController {

    @Autowired
    private ProcessamentoService processamentoService;

    @GetMapping
    public  List<ApuracaoDto> apuracao(){
        return this.processamentoService.apuracao();
    }

}
