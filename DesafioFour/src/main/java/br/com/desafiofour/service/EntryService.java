package br.com.desafiofour.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.desafiofour.assembler.EntryDtoOutPut;
import br.com.desafiofour.dto.EntryDto;
import br.com.desafiofour.exception.EntityNotFoundException;
import br.com.desafiofour.model.entity.Entry;
import br.com.desafiofour.repositoy.CategoryRepository;
import br.com.desafiofour.repositoy.EntryRepository;

@Service
public class EntryService {

	@Autowired
	private EntryRepository entryRepository;

	@Autowired
	private CategoryRepository categoryRepository;

	@Autowired
	private EntryDtoOutPut entryDtoOutPut;

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

	public Map<Long, List<EntryDto>> listByCategory() {

		List<Entry> list = listEntry();

		Map<Long, List<EntryDto>> groupIdCategory = new HashMap<Long, List<EntryDto>>();

		EntryDto entryDto = new EntryDto();

		for (Entry entry : list) {

			Long key = entry.getCategoryId();

			entryDto = entryDtoOutPut.toModel(entry);

			if (groupIdCategory.get(key) == null) {

				groupIdCategory.put(key, new ArrayList<EntryDto>());
				
			}else {
				
			groupIdCategory.get(key).add(entryDto);
			
			}
		}
		return groupIdCategory;
	}

}
