package com.elumini.miniautorizador.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.elumini.miniautorizador.model.Cartao;
import com.elumini.miniautorizador.service.CartaoService;

@RestController
@RequestMapping("/cartoes")
public class CartaoController {
	//@Autowired AutorizadorFacade autorizadorFacade;
	
	@Autowired CartaoService cartaoService;
    
    @PostMapping
    public ResponseEntity<Cartao> criarCartao(@RequestBody Cartao cartao) {
    	try {
    		cartaoService.criarCartao(cartao);
    		return new ResponseEntity<Cartao>(cartao, HttpStatus.CREATED);    	
    	}
    	catch(Exception e) {
    		return new ResponseEntity<Cartao>(cartao, HttpStatus.UNPROCESSABLE_ENTITY);    	
    	}
    		
    }
	
    @GetMapping("/{numeroCartao}")
    public ResponseEntity<Double> buscarSaldoCartao(@PathVariable Long numeroCartao) {
    	double saldo;
    	try {
    		saldo = cartaoService.buscarCartao(numeroCartao).getSaldo();
    		return new ResponseEntity<>(saldo, HttpStatus.OK);    	
    	}catch(IllegalArgumentException e) {
    		return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);    	
    	}
    	
    }    
    
}
