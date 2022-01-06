package br.com.desafiofour.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.desafiofour.exception.EntityNotFoundException;
import br.com.desafiofour.model.Category;
import br.com.desafiofour.repositoy.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;

	public List<Category> listCategory() {

		return categoryRepository.findAll();
	}

	public Category save(Category category) {

		return categoryRepository.save(category);
	}

	public void delete(long id) {

		categoryRepository.deleteById(id);
	}

	public String getByName(String nameCategory) {

		String idCategoryByName = categoryRepository.findByName(nameCategory).getId().toString();

		return idCategoryByName;

	}

	public Category listOrFail(Long categoryId) {

		return categoryRepository.findById(categoryId).orElseThrow(
				() -> new EntityNotFoundException(String.format("Categoria %d não encontrada:", categoryId)));
	}
}
