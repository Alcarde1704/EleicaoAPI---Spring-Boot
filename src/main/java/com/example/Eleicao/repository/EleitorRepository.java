package com.example.Eleicao.repository;

import com.example.Eleicao.models.Eleitor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EleitorRepository extends JpaRepository<Eleitor, Long> {
}
