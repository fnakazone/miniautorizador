package com.elumini.miniautorizador.model;


public class Transacao {
	private Long numeroCartao;
	private int senha;
	private Double valor;
	public Long getNumeroCartao() {
		return numeroCartao;
	}
	public void setNumeroCartao(Long numeroCartao) {
		this.numeroCartao = numeroCartao;
	}
	public int getSenha() {
		return senha;
	}
	public void setSenha(int senha) {
		this.senha = senha;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
}
