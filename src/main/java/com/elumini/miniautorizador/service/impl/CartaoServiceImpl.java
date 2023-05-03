package com.elumini.miniautorizador.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.mongodb.core.ExecutableFindOperation.ExecutableFind;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import com.elumini.miniautorizador.model.Cartao;
import com.elumini.miniautorizador.repository.CartaoRepository;
import com.elumini.miniautorizador.service.CartaoService;


@Service
public class CartaoServiceImpl implements CartaoService {
  
  private CartaoRepository cartaoRepository;
  
  @Value("${elumini.saldopadrao}")
  private Double saldoPadrao;
  
  @Autowired
  public CartaoServiceImpl(CartaoRepository cartaoRepository) {
    this.cartaoRepository = cartaoRepository;
  }
  
  @Override
  public Cartao criarCartao(Cartao cartao) {
	  cartao.setSaldo(saldoPadrao);
	  return cartaoRepository.insert(cartao);
  }  

  @Override
  public Cartao buscarCartao(Long numeroCartao) {
	  Cartao cartao = cartaoRepository.findCartaoByNumeroCartao(numeroCartao);
	  Optional.ofNullable(cartao)
        .orElseThrow(() -> new IllegalArgumentException("Cartão não encontrado."));
	  return cartao;
  }
  
  @Override
  public List<Cartao> buscarTodosCartoes() {
	  return cartaoRepository.findAll();
  }  

  @Override
  public String atualizarSaldo(Long numeroCartao, Double valor) {
	  Cartao cartaoAtualizado = cartaoRepository.findCartaoByNumeroCartao(numeroCartao);
	  Optional.ofNullable(cartaoAtualizado)
      	.orElseThrow(() -> new IllegalArgumentException("Cartão não encontrado."));	  
	  cartaoAtualizado.setSaldo(cartaoAtualizado.getSaldo()-valor);
	  cartaoRepository.save(cartaoAtualizado);
	  return "OK";
  }
}
