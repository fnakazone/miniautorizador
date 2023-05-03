package com.elumini.miniautorizador.api;

public class BusinessException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public BusinessException(String msg){
        super(msg);
    }

    public BusinessException(String msg, Throwable cause){
        super(msg, cause);
    }

}
