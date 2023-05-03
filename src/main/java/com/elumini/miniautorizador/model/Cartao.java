package com.elumini.miniautorizador.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Document(collection = "cards")
public class Cartao {
	
	@Id
	private String id;
	
	@Indexed(unique = true)
	private Long numeroCartao;
	
	@JsonIgnore
	private Double saldo;	
	private int senha;
	
	public Cartao(Long numeroCartao, Double saldo, int senha) {
		this.setNumeroCartao(numeroCartao);
		this.setSaldo(saldo);
		this.setSenha(senha);
	}	
	
	public Cartao() {
	}

	public Long getNumeroCartao() {
		return numeroCartao;
	}

	public void setNumeroCartao(Long numeroCartao) {
		this.numeroCartao = numeroCartao;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	
	
}
