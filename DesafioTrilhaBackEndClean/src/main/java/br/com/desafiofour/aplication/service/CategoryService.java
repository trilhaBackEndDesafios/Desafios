package br.com.desafiofour.aplication.service;

import java.util.List;

import br.com.desafiofour.adapters.outbound.entities.Category;
import br.com.desafiofour.aplication.exception.EntityNotFoundException;
import br.com.desafiofour.aplication.ports.CategoryRepositoryPort;
import br.com.desafiofour.aplication.ports.CategoryServicePort;

public class CategoryService implements CategoryServicePort {

	private CategoryRepositoryPort categoryRepositoryPort;

	public CategoryService(CategoryRepositoryPort categoryRepositoryPort) {

		this.categoryRepositoryPort = categoryRepositoryPort;
	}

	public List<Category> listCategory() {

		return categoryRepositoryPort.findAll();
	}

	public Category save(Category category) {

		return categoryRepositoryPort.save(category);
	}

	public void delete(long id) {

		categoryRepositoryPort.deleteById(id);
	}

	public String getByName(String nameCategory) {

		String idCategoryByName = categoryRepositoryPort.findByName(nameCategory).getId().toString();

		return idCategoryByName;

	}

	public Category listOrFail(Long categoryId) {

		return categoryRepositoryPort.findById(categoryId).orElseThrow(
				() -> new EntityNotFoundException(String.format("Categoria %d não encontrada:", categoryId)));
	}
}
