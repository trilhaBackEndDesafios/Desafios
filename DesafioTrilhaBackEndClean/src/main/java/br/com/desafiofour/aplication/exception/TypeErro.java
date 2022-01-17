package br.com.desafiofour.aplication.exception;

import lombok.Getter;

@Getter
public enum TypeErro {

	DADOS_INVALIDOS("/dados-invalidos", "Dados inválidos");

	private String title;
	private String uri;
	
	
	private TypeErro(String title, String uri) {
		this.title = title;
		this.uri = "https://trilhaBackEnd.com.br";
	}

}
