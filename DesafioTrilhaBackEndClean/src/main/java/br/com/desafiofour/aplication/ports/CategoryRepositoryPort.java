package br.com.desafiofour.aplication.ports;

import java.util.List;
import java.util.Optional;

import br.com.desafiofour.adapters.outbound.entities.Category;

public interface CategoryRepositoryPort {

	List<Category> findAll();

	Category save(Category category);

	Optional<Category> findById(Long categoryId);

	void deleteById(long id);

	Category findByName(String nameCategory);

}
