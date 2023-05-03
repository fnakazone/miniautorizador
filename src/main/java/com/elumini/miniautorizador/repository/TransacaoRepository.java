package com.elumini.miniautorizador.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.elumini.miniautorizador.model.Cartao;

public interface TransacaoRepository extends MongoRepository<Cartao, String> {
}