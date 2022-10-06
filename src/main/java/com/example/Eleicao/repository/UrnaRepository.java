package com.example.Eleicao.repository;

import com.example.Eleicao.models.Urna;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UrnaRepository extends JpaRepository<Urna, Long> {

    Urna findByBlocoAndSala(String bloco, int sala);
}
