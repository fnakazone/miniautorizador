package com.elumini.miniautorizador.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elumini.miniautorizador.model.Cartao;
import com.elumini.miniautorizador.repository.TransacaoRepository;
import com.elumini.miniautorizador.service.TransacaoService;

@Service
public class TransacaoServiceImpl implements TransacaoService {

	private TransacaoRepository transacaoRepository;
	  
	@Autowired
	public TransacaoServiceImpl(TransacaoRepository transacaoRepository) {
	   this.transacaoRepository = transacaoRepository;
	}	
	
	@Override
	public Cartao atualizarSaldo(Cartao cartao, Double saldo) {
		cartao.setSaldo(saldo);
		transacaoRepository.save(cartao);
		return null;
	}

}
