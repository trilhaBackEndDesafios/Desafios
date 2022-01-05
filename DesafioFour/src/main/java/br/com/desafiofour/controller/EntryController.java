package br.com.desafiofour.controller;

import java.util.List;
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

import br.com.desafiofour.model.Entry;
import br.com.desafiofour.service.EntryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(tags = "Entry")
@RestController
@RequestMapping("/entry")
public class EntryController {

	@Autowired
	private EntryService entryService;

	@ApiOperation("Listar")
	@GetMapping
	public List<Entry> listAll() {

		return entryService.listEntry();
	}

	@ApiOperation("Listar por Id")
	@GetMapping("/{entryId}")
	public Entry findById(@PathVariable Long entryId) {

		return entryService.listOrFail(entryId);

	}

	@ApiOperation("Lançamentos pagos")
	@GetMapping("/entry/pagos")
	public List<Entry> getPaid() {

		List<Entry> listaPagos = entryService.listEntry();

		return listaPagos.stream().filter(lista -> lista.isPaid() == true).collect(Collectors.toList());

	}

	@ApiOperation("Lançamentos não pagos")
	@GetMapping("/entry/naopagos")
	public List<Entry> getNotPaid() {

		List<Entry> listaNaoPagos = entryService.listEntry();

		return listaNaoPagos.stream().filter(lista -> lista.isPaid() == false).collect(Collectors.toList());

	}

	@ApiOperation("Criar")
	@PostMapping
	public ResponseEntity<Entry> create(@RequestBody Entry entry) {

		boolean categoryId = entryService.validateCategoryById(entry.getCategoryId());

		if (categoryId == true) {

			Entry entrySave = entryService.save(entry);

			return ResponseEntity.ok(entrySave);

		} else {
			return ResponseEntity.notFound().build();
		}
	}

	@ApiOperation("Atualizar")
	@PutMapping("/{entryId}")
	public ResponseEntity<Entry> upDate(@PathVariable Long entryId, @RequestBody Entry entry) {

		Entry entryAtual = entryService.listOrFail(entryId);

		BeanUtils.copyProperties(entry, entryAtual, "id");

		Entry savedEntry = entryService.save(entryAtual);

		return ResponseEntity.ok(savedEntry);

	}

	@ApiOperation("Excluir")
	@DeleteMapping("/{entryId}")
	public ResponseEntity<Entry> delete(@PathVariable Long entryId) {

		Entry entry = entryService.listOrFail(entryId);

		entryService.delete(entry.getId());

		return ResponseEntity.noContent().build();

	}

}
