package br.com.desafiofour.exception;

import java.util.List;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ErrorResponse {

	private Integer status;
	private String type;
	private String title;
	private String detail;
	private List<Field> fields;
	private String message;

	@Getter
	@Builder
	public static class Field {

		private String name;
		private String message;
	}
}