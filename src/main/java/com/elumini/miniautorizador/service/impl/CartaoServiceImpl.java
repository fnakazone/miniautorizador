package com.elumini.miniautorizador.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.elumini.miniautorizador.model.Cartao;
import com.elumini.miniautorizador.repository.CartaoRepository;
import com.elumini.miniautorizador.service.CartaoService;


@Service
public class CartaoServiceImpl implements CartaoService {
  
  private CartaoRepository cartaoRepository;
  
  @Value("${elumini.saldopadrao}")
  private Long saldoPadrao;
  
  @Autowired
  public CartaoServiceImpl(CartaoRepository cartaoRepository) {
    this.cartaoRepository = cartaoRepository;
  }
  
  @Override
  public Cartao criarCartao(Cartao cartao) {
	  cartao.setSaldo(saldoPadrao);
	  return cartaoRepository.save(cartao);
  }
}
