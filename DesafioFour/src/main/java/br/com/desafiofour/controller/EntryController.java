package br.com.desafiofour.controller;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.desafiofour.exception.EntityNotFoundException;
import br.com.desafiofour.model.Category;
import br.com.desafiofour.model.Entry;
import br.com.desafiofour.repositoy.CategoryRepository;
import br.com.desafiofour.repositoy.EntryRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(tags = "Entry")
@RestController
@RequestMapping("/entry")
public class EntryController {

	@Autowired
	private EntryRepository entryRepository;

	@Autowired
	private CategoryRepository categoryRepository;
	
	@ApiOperation("Listar")
	@GetMapping
	public List<Entry> listAll() {
		return entryRepository.findAll();
	}
	
	@ApiOperation("Listar por Id")
	@GetMapping("/{entryId}")
	public Entry findById(@PathVariable Long entryId) {

		return listOrFail(entryId);

	}
	
	@ApiOperation("Lançamentos pagos")
	@GetMapping("/entry/pagos")
	public List<Entry> getPaid() {

		List<Entry> listaPagos = listAll();

		return listaPagos.stream().filter(l -> l.isPaid() == true).collect(Collectors.toList());

	}
	
	@ApiOperation("Lançamentos não pagos")
	@GetMapping("/entry/naopagos")
	public List<Entry> getNotPaid() {

		List<Entry> listaPagos = entryRepository.findAll();

		return listaPagos.stream().filter(l -> l.isPaid() == false).collect(Collectors.toList());

	}
	
	@ApiOperation("Criar")
	@PostMapping
	public ResponseEntity<Entry> create(@RequestBody Entry entry) {

		Optional<Category> category = categoryRepository.findById(entry.getCategoryId());

		if (category.isPresent()) {

			Entry entrySave = entryRepository.save(entry);

			return ResponseEntity.ok(entrySave);

		} else {
			return ResponseEntity.notFound().build();
		}
	}
	
	@ApiOperation("Atualizar")
	@PutMapping("/{entryId}")
	public Entry upDate(@PathVariable Long entryId, @RequestBody Entry entry) {

		Entry entryAtual = listOrFail(entryId);

		BeanUtils.copyProperties(entry, entryAtual, "id");

		return entryRepository.save(entryAtual);

	}

	@ApiOperation("Excluir")
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
