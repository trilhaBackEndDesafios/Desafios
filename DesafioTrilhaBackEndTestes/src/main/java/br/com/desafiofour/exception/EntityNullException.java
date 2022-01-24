package br.com.desafiofour.exception;

//@ResponseStatus(HttpStatus.NOT_FOUND)
public class EntityNullException extends RuntimeException{

	
	private static final long serialVersionUID = 1L;
	
	public EntityNullException(String message) {
		
		super(message);
	}

}
