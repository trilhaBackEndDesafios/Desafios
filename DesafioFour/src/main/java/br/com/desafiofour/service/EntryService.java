package br.com.desafiofour.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.desafiofour.exception.EntityNotFoundException;
import br.com.desafiofour.model.Entry;
import br.com.desafiofour.repositoy.CategoryRepository;
import br.com.desafiofour.repositoy.EntryRepository;

@Service
public class EntryService {

	@Autowired
	private EntryRepository entryRepository;

	@Autowired
	private CategoryRepository categoryRepository;

	public List<Entry> listEntry() {

		return entryRepository.findAll();

	}

	public Entry save(Entry entry) {

		return entryRepository.save(entry);

	}

	public void delete(long entryIid) {

		entryRepository.deleteById(entryIid);

	}

	public boolean validateCategoryById(long idCategory) {

		return categoryRepository.existsById(idCategory);

	}

	public Entry listOrFail(Long entryId) {

		return entryRepository.findById(entryId).orElseThrow(
				() -> new EntityNotFoundException(String.format("Lançamento %d não encontrada:", entryId)));
	}

}
