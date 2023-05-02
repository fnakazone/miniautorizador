package com.elumini.miniautorizador.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Cartao")
public class Cartao {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Long numeroCartao;
	
	@JsonIgnore
	private Long saldo;	
	private int senha;

	public int getSenha() {
		return senha;
	}
	public Long getNumeroCartao() {
		return numeroCartao;
	}
	public void setNumeroCartao(Long numeroCartao) {
		this.numeroCartao = numeroCartao;
	}
	public void setSenha(int senha) {
		this.senha = senha;
	}
	public Long getSaldo() {
		return saldo;
	}
	public void setSaldo(Long saldo) {
		this.saldo = saldo;
	}
	
}
