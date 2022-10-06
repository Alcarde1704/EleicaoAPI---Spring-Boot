package com.example.Eleicao.services;

import com.example.Eleicao.models.Candidato;
import com.example.Eleicao.models.Eleitor;
import com.example.Eleicao.models.Urna;
import com.example.Eleicao.models.Voto;
import com.example.Eleicao.repository.CandidatoRepository;
import com.example.Eleicao.repository.EleitorRepository;
import com.example.Eleicao.repository.UrnaRepository;
import com.example.Eleicao.repository.VotoRepository;
import com.example.Eleicao.services.dto.EleitorDto;
import com.example.Eleicao.services.dto.VotoDto;
import com.example.Eleicao.services.form.VotoForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@Service
public class UrnaService {

    @Autowired
    private EleitorRepository eleitorRepository;

    @Autowired
    private CandidatoRepository candidatoRepository;

    @Autowired
    private VotoRepository votoRepository;

    @Autowired
    private UrnaRepository urnaRepository;

    public List<VotoDto> listaVotos(int numero){

        if (numero != 0){
            Candidato candidato = candidatoRepository.findByNumero(numero);
            List<Voto> votos = votoRepository.findByCandidato(candidato);
            return VotoDto.converter(votos);
        } else {
            List<Voto> votos = votoRepository.findAll();
            return VotoDto.converter(votos);
        }


    }

    public ResponseEntity<VotoDto> votar(VotoForm votoForm, UriComponentsBuilder uriComponentsBuilder){
        Eleitor eleitor = eleitorRepository.findByTitulo(votoForm.getTitulo());

        Candidato candidato = candidatoRepository.findByNumero(votoForm.getNumeroCandidato());

        if(eleitor != null){
            if (candidato != null){
                Voto validaVotacao = votoRepository.findByEleitor(eleitor);
                if(validaVotacao != null){
                    return new ResponseEntity("Usuário já realizou votação" ,HttpStatus.BAD_REQUEST);
                } else {
                    Urna urna = urnaRepository.findByBlocoAndSala(votoForm.getBloco(), votoForm.getSala());
                    if (urna != null){
                        Voto voto = new Voto(eleitor, candidato, urna);
                        votoRepository.save(voto);
                        URI uri = uriComponentsBuilder.path("/voto/{id}").buildAndExpand(voto.getId()).toUri();
                        return ResponseEntity.created(uri).body(new VotoDto(voto));
                    } else {
                        return new ResponseEntity("Urna inválida, verifique novamente os dados" ,HttpStatus.BAD_REQUEST);
                    }

                }
            } else {
                return new ResponseEntity("Candidato inválido",HttpStatus.BAD_REQUEST);
            }
        } else {
            return new ResponseEntity("Eleitor inválido",HttpStatus.BAD_REQUEST);
        }



    }




}
