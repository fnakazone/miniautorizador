package com.elumini.miniautorizador.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.elumini.miniautorizador.model.Cartao;

@Repository
public interface TransacaoRepository extends JpaRepository<Cartao, String> {
}