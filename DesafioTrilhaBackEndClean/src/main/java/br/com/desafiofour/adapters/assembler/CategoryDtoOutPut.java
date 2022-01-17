package br.com.desafiofour.adapters.assembler;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.desafiofour.adapters.dto.CategoryDto;
import br.com.desafiofour.adapters.outbound.entities.Category;

@Component
public class CategoryDtoOutPut {

	@Autowired
	private ModelMapper modelMapper;

	public CategoryDto toModel(Category category) {

		return modelMapper.map(category, CategoryDto.class);
	}

	public List<CategoryDto> toCollectionModel(List<Category> categories) {
		return categories.stream().map(categorie -> toModel(categorie)).collect(Collectors.toList());
	}
}
