package com.example.Eleicao.repository;

import com.example.Eleicao.models.Eleitor;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EleitorRepository extends JpaRepository<Eleitor, Long> {

    public Eleitor findByCpf(String cpf);
}
