package br.com.desafiofour.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class CalculateAverageException extends RuntimeException{

	
	private static final long serialVersionUID = 1L;
	
	public CalculateAverageException(String message) {
		
		super(message);
	}

}
