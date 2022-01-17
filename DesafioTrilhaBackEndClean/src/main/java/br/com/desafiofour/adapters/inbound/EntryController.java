package br.com.desafiofour.adapters.inbound;

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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.desafiofour.adapters.outbound.entities.EntryEntity;
import br.com.desafiofour.aplication.ports.EntryServicePort;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(tags = "Entry")
@RestController
@RequestMapping("/entry")
public class EntryController {

	@Autowired
	private EntryServicePort entryServicePort ;

	@ApiOperation("Listar")
	@GetMapping
	public ResponseEntity<List<EntryEntity>> listAll() {

		List<EntryEntity> listAllEntry = entryServicePort.listEntry();

		return ResponseEntity.ok(listAllEntry);
	}

	
	
	 @ApiOperation("Agrupar por Categoria")
	  
		
		  @GetMapping("GroupEntryById") public ResponseEntity<Map<Long, List<EntryEntity>>>
		  groupByCategory() {
		  
		  Map<Long, List<EntryEntity>> entryEntity = entryServicePort.listByCategory();
		  
		  return ResponseEntity.ok(entryEntity); }
		 
	 

	@ApiOperation("Listar por Id")
	@GetMapping("/{entryId}")
	public ResponseEntity<EntryEntity> findById(@PathVariable Long entryId) {

		return ResponseEntity.ok(entryServicePort.listOrFail(entryId));

	}

	@ApiOperation("Lançamentos pagos")
	@GetMapping("/entry/pagos")
	public ResponseEntity<List<EntryEntity>> getPaid() {

		List<EntryEntity> listaPagos = entryServicePort.listEntry();

		return ResponseEntity
				.ok(listaPagos.stream().filter(lista -> lista.isPaid() == true).collect(Collectors.toList()));

	}

	@ApiOperation("Lançamentos não pagos")
	@GetMapping("/entry/naopagos")
	public ResponseEntity<List<EntryEntity>> getNotPaid() {

		List<EntryEntity> listaNaoPagos = entryServicePort.listEntry();

		return ResponseEntity
				.ok(listaNaoPagos.stream().filter(lista -> lista.isPaid() == false).collect(Collectors.toList()));

	}

	@ApiOperation("Criar")
	@PostMapping
	public ResponseEntity<EntryEntity> create(@RequestBody @Valid EntryEntity entryEntity) {

		boolean categoryId = entryServicePort.validateCategoryById(entryEntity.getCategoryId());

		if (categoryId == true) {

			EntryEntity entrySave = entryServicePort.save(entryEntity);

			return ResponseEntity.status(HttpStatus.CREATED).body(entrySave);

		} else {
			return ResponseEntity.notFound().build();
		}
	}
	
	@ApiOperation("Calcula Media")
	@GetMapping("/entry/calcula")
	public ResponseEntity<Integer> calcula(@RequestParam Integer x, @RequestParam Integer y) {

		Integer media = entryServicePort.calculaMedia(x, y);

		return ResponseEntity.ok(media);
				

	}

	@ApiOperation("Atualizar")
	@PutMapping("/{entryId}")
	public ResponseEntity<EntryEntity> upDate(@PathVariable Long entryId, @RequestBody @Valid EntryEntity entryEntity) {

		EntryEntity entryAtual = entryServicePort.listOrFail(entryId);

		BeanUtils.copyProperties(entryEntity, entryAtual, "id");

		EntryEntity savedEntry = entryServicePort.save(entryAtual);

		return ResponseEntity.ok(savedEntry);

	}

	@ApiOperation("Excluir")
	@DeleteMapping("/{entryId}")
	public ResponseEntity<Void> delete(@PathVariable Long entryId) {

		EntryEntity entryEntity = entryServicePort.listOrFail(entryId);

		entryServicePort.delete(entryEntity.getId());

		return ResponseEntity.noContent().build();

	}

}
