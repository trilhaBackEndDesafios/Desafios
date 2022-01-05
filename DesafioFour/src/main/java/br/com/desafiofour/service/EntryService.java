package br.com.desafiofour.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.desafiofour.model.Entry;
import br.com.desafiofour.repositoy.CategoryRepository;
import br.com.desafiofour.repositoy.EntryRepository;

@Service
public class EntryService {

	@Autowired
	private EntryRepository entryRepository;
	

	@Autowired
	private CategoryRepository categoryRepository;
	

	public Entry save(Entry entry) {
		
		return entryRepository.save(entry);
		
	}

	public void delete(long id) {
		

		entryRepository.deleteById(id);
		
	}

	public boolean validateCategoryById(long idCategory) {
		

		return categoryRepository.existsById(idCategory);

	}

}
