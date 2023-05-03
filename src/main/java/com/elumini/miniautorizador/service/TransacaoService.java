package com.elumini.miniautorizador.service;

import com.elumini.miniautorizador.model.Cartao;

public interface TransacaoService {
	Cartao atualizarSaldo(Cartao cartao, Double saldo);
}