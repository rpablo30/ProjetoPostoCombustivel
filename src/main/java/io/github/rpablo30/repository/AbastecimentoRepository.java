package io.github.rpablo30.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.github.rpablo30.entity.Abastecimento;

@Repository
public interface AbastecimentoRepository extends JpaRepository<Abastecimento, Integer>{

	
}
