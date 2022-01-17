package br.com.desafiofour.aplication.ports;

import java.util.List;

import br.com.desafiofour.adapters.outbound.entities.Category;

public interface CategoryServicePort {
 
	 List<Category> listCategory();
	 Category save(Category category);
	 Category listOrFail(Long categoryId);
	 void delete(long id);
	 String getByName(String nameCategory);
}
