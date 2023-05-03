package com.elumini.miniautorizador.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.elumini.miniautorizador.model.Cartao;

public interface CartaoRepository extends MongoRepository<Cartao, String> {
	
	@Query("{'numeroCartao': ?0}")
	Cartao findCartaoByNumeroCartao(Long numeroCartao);
}
