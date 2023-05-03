package com.elumini.miniautorizador.service;

import java.util.List;

import com.elumini.miniautorizador.model.Cartao;

public interface CartaoService {
	Cartao criarCartao(Cartao cartao);
	Cartao buscarCartao(Long numeroCartao);
	List<Cartao> buscarTodosCartoes();
	String atualizarSaldo(Long numeroCartao, Double valor);
}