package br.com.desafiofour.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CategoryDto {
	
	
	@Size(min = 3, max = 45)
	private String name;

}
