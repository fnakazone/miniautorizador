package com.elumini.miniautorizador.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.elumini.miniautorizador.facade.TransacaoFacade;
import com.elumini.miniautorizador.model.Transacao;

@RestController
@RequestMapping("/transacoes")
public class TransacaoController {
	//@Autowired AutorizadorFacade autorizadorFacade;
	
	@Autowired TransacaoFacade transacaoFacade;
    
    @PostMapping
    public ResponseEntity<String> efetuarTransacao(@RequestBody Transacao transacao) {    	
    	try {
    		return new ResponseEntity<>(transacaoFacade.efetuarTransacao(transacao), HttpStatus.CREATED);    	
    	}
    	catch(Exception e) {
    		return new ResponseEntity<>(transacaoFacade.efetuarTransacao(transacao), HttpStatus.UNPROCESSABLE_ENTITY);    	
    	}
    		
    }
	
}
