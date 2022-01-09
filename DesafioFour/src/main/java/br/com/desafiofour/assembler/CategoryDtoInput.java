package br.com.desafiofour.assembler;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import br.com.desafiofour.dto.CategoryDto;
import br.com.desafiofour.model.entity.Category;

public class CategoryDtoInput {

	@Autowired
	private ModelMapper modelMapper;

	public Category toDomainObject(CategoryDto categoryInput) {

		return modelMapper.map(categoryInput, Category.class);
	}

}
