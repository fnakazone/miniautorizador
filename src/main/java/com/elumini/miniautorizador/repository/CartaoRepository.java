package com.elumini.miniautorizador.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.elumini.miniautorizador.model.Cartao;

@Repository
public interface CartaoRepository extends JpaRepository<Cartao, String> {
	public Cartao findCartaoByNumeroCartao(String numeroCartao);
}
