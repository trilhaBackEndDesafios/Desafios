package br.com.desafiofour.adapters.assembler;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import br.com.desafiofour.adapters.dto.CategoryDto;
import br.com.desafiofour.adapters.outbound.entities.Category;

public class CategoryDtoInput {

	@Autowired
	private ModelMapper modelMapper;

	public Category toDomainObject(CategoryDto categoryInput) {

		return modelMapper.map(categoryInput, Category.class);
	}

}
