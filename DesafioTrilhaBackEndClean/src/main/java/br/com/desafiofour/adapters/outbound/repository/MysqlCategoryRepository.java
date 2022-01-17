package br.com.desafiofour.adapters.outbound.repository;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import br.com.desafiofour.adapters.outbound.entities.Category;
import br.com.desafiofour.aplication.ports.CategoryRepositoryPort;

@Component
@Primary
public class MysqlCategoryRepository implements CategoryRepositoryPort {

	private CategoryRepository categoryRepository;

	public MysqlCategoryRepository(CategoryRepository categoryRepository) {

		this.categoryRepository = categoryRepository;
	}
	@Autowired
	ModelMapper modelMapper;
	
	@Override
	public List<Category> findAll() {
		return categoryRepository.findAll();
	}

	@Override
	public Category save(Category category) {
		return categoryRepository.save(category);
	}

	@Override
	public Optional<Category> findById(Long categoryId) {
		return categoryRepository.findById(categoryId);
	}

	@Override
	public void deleteById(long id) {

		categoryRepository.deleteById(id);

	}

	@Override
	public Category findByName(String nameCategory) {

		return categoryRepository.findByName(nameCategory);

	}

}
