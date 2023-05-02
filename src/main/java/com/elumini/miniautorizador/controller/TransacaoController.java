package com.elumini.miniautorizador.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.elumini.miniautorizador.facade.AutorizadorFacade;
import com.elumini.miniautorizador.model.Cartao;
import com.elumini.miniautorizador.service.CartaoService;

@RestController
@RequestMapping("/cartoes")
public class TransacaoController {
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
	
}
