package br.com.desafiofour.controller;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.validation.Valid;

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
import org.springframework.web.bind.annotation.RestController;

import br.com.desafiofour.dto.EntryDto;
import br.com.desafiofour.model.entity.Entry;
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
	public ResponseEntity<List<Entry>> listAll() {

		List<Entry> listAllEntry = entryService.listEntry();

		return ResponseEntity.ok(listAllEntry);
	}

	
	  @ApiOperation("Agrupar por Categoria")
	  
	  @GetMapping("GroupEntryById") public ResponseEntity<Map<Long,
	  List<EntryDto>>> groupByCategory() {
	  
	  Map<Long, List<EntryDto>> entry = entryService.listByCategory();
	  
	  return ResponseEntity.ok(entry); }
	 

	@ApiOperation("Listar por Id")
	@GetMapping("/{entryId}")
	public ResponseEntity<Entry> findById(@PathVariable Long entryId) {

		return ResponseEntity.ok(entryService.listOrFail(entryId));

	}

	@ApiOperation("Lançamentos pagos")
	@GetMapping("/entry/pagos")
	public ResponseEntity<List<Entry>> getPaid() {

		List<Entry> listaPagos = entryService.listEntry();

		return ResponseEntity
				.ok(listaPagos.stream().filter(lista -> lista.isPaid() == true).collect(Collectors.toList()));

	}

	@ApiOperation("Lançamentos não pagos")
	@GetMapping("/entry/naopagos")
	public ResponseEntity<List<Entry>> getNotPaid() {

		List<Entry> listaNaoPagos = entryService.listEntry();

		return ResponseEntity
				.ok(listaNaoPagos.stream().filter(lista -> lista.isPaid() == false).collect(Collectors.toList()));

	}

	@ApiOperation("Criar")
	@PostMapping
	public ResponseEntity<Entry> create(@RequestBody @Valid Entry entry) {

		boolean categoryId = entryService.validateCategoryById(entry.getCategoryId());

		if (categoryId == true) {

			Entry entrySave = entryService.save(entry);

			return ResponseEntity.status(HttpStatus.CREATED).body(entrySave);

		} else {
			return ResponseEntity.notFound().build();
		}
	}

	@ApiOperation("Atualizar")
	@PutMapping("/{entryId}")
	public ResponseEntity<Entry> upDate(@PathVariable Long entryId, @RequestBody @Valid Entry entry) {

		Entry entryAtual = entryService.listOrFail(entryId);

		BeanUtils.copyProperties(entry, entryAtual, "id");

		Entry savedEntry = entryService.save(entryAtual);

		return ResponseEntity.ok(savedEntry);

	}

	@ApiOperation("Excluir")
	@DeleteMapping("/{entryId}")
	public ResponseEntity<Void> delete(@PathVariable Long entryId) {

		Entry entry = entryService.listOrFail(entryId);

		entryService.delete(entry.getId());

		return ResponseEntity.noContent().build();

	}

}
