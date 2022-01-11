package br.com.desafiofour.dto;

import javax.validation.constraints.Negative;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EntryDto {
	
	@NotBlank()
	@Size(min = 3, max = 10)
	private String type;
	
	@Negative
	@Size(min = 3, max = 15)
	private String amount;

}
