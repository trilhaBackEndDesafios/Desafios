package br.com.desafiofour.exception;

//@ResponseStatus(HttpStatus.NOT_FOUND)
public class EntityIsEmptyExceptions extends RuntimeException{

	
	private static final long serialVersionUID = 1L;
	
	public EntityIsEmptyExceptions(String message) {
		
		super(message);
	}

}
