package br.com.desafiofour.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.desafiofour.exception.EntityNotFoundException;
import br.com.desafiofour.model.Category;
import br.com.desafiofour.repositoy.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;

	public Category save(Category category) {
		
		return categoryRepository.save(category);
	}

	public void delete(long id) {

		categoryRepository.deleteById(id);
	}

	/*
	 * public String idCategoryByName(Category nameCategory) {
	 * 
	 * 
	 * 
	 * 
	 * return nameCategory; }
	 */
	
	public Category listOrFail(Long categoryId) {

		return categoryRepository.findById(categoryId)
				.orElseThrow(() -> new EntityNotFoundException(String.format("Categoria %d não encontrada:", categoryId)));
	}
}
