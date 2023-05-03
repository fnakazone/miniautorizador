package com.elumini.miniautorizador.service;

import com.elumini.miniautorizador.model.Cartao;

public interface CartaoService {
	Cartao criarCartao(Cartao cartao);
	Cartao buscarCartao(Long numeroCartao);
	String atualizarSaldo(Long numeroCartao, Double valor);
}