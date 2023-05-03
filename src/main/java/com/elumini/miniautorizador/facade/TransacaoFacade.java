package com.elumini.miniautorizador.facade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.elumini.miniautorizador.model.Transacao;
import com.elumini.miniautorizador.service.CartaoService;
import com.elumini.miniautorizador.service.TransacaoService;


@Component
public class TransacaoFacade {
  
  private CartaoService cartaoService;
  private TransacaoService transacaoService;
  
  @Autowired
  public TransacaoFacade(CartaoService cartaoService, TransacaoService transacaoService) {
    this.cartaoService = cartaoService;
    this.transacaoService = transacaoService;
  }
  
  public String efetuarTransacao(Transacao transacao) {
	  
	String validacao = validarTransacao(transacao);
	if (validacao==null)
		return cartaoService.atualizarSaldo(transacao.getNumeroCartao(), transacao.getValor());
	else
		return validacao;
  }
  
  public String validarTransacao(Transacao transacao) {
	  if (validarCartao(transacao.getNumeroCartao()))
		  if (validarSenha(transacao.getNumeroCartao(),transacao.getSenha()))
			  if (validarSaldo(transacao.getNumeroCartao(),transacao.getValor()))
				  return null;
			  else
				  return "SALDO_INSUFICIENTE";
		  else
			  return "SENHA_INVALIDA";
	  else
		  return "CARTAO_INEXISTENTE";
  }

  
  public boolean validarCartao(Long numeroCartao) {
	  if (cartaoService.buscarCartao(numeroCartao) != null)
	  	return true;
	  else
		return false;
  }
  
  public boolean validarSenha(Long numeroCartao,int senha) {
	  if (cartaoService.buscarCartao(numeroCartao).getSenha()==senha)
	  	return true;
	  else
		return false;  
  }
  
  public boolean validarSaldo(Long numeroCartao,Double valor) {
	  if (cartaoService.buscarCartao(numeroCartao).getSaldo()>=valor)
	  	return true;
	  else
		return false;  
  }
  
  
}
