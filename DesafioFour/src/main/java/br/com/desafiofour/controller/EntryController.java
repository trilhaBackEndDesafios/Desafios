package br.com.desafiofour.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.desafiofour.exception.EntityNotFoundException;
import br.com.desafiofour.model.Category;
import br.com.desafiofour.model.Entry;
import br.com.desafiofour.repositoy.CategoryRepository;
import br.com.desafiofour.repositoy.EntryRepository;

@RestController
@RequestMapping("/entry")
public class EntryController {

	@Autowired
	private EntryRepository entryRepository;

	@Autowired
	private CategoryRepository categoryRepository;

	@GetMapping
	public List<Entry> read() {
		return entryRepository.findAll();
	}

	@GetMapping("/{entryId}")
	public Entry findById(@PathVariable Long entryId) {

		return listOrFail(entryId);

	}

	/*
	 * @PostMapping
	 * 
	 * @ResponseStatus(HttpStatus.CREATED) public Entry create(@RequestBody Entry
	 * entry) {
	 * 
	 * return entryRepository.save(entry); }
	 */

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<Entry> create(@RequestBody Entry entry) {

		Long categoryId = entry.getCategoryId();

		Optional<Category> category = categoryRepository.findById(categoryId);

		if (category.isPresent()) {

			entryRepository.save(entry);

			return ResponseEntity.ok(entry);

		} else {
			return ResponseEntity.notFound().build();
		}
	}

	@PutMapping("/{entryId}")
	public Entry upDate(@PathVariable Long entryId, @RequestBody Entry entry) {

		Entry entryAtual = listOrFail(entryId);

		BeanUtils.copyProperties(entry, entryAtual, "id");

		return entryRepository.save(entryAtual);

	}

	@DeleteMapping("/{entryId}")
	public ResponseEntity<Entry> delete(@PathVariable Long entryId) {

		Entry entry = listOrFail(entryId);

		entryRepository.delete(entry);

		return ResponseEntity.noContent().build();

	}

	public Entry listOrFail(Long entryId) {

		return entryRepository.findById(entryId).orElseThrow(
				() -> new EntityNotFoundException(String.format("Lançamento %d não encontrada:", entryId)));
	}

}
