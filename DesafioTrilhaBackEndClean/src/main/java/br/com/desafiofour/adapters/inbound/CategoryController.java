package br.com.desafiofour.adapters.inbound;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
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

import br.com.desafiofour.adapters.outbound.entities.Category;
import br.com.desafiofour.aplication.ports.CategoryServicePort;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(tags = "Category")
@RestController
@RequestMapping("/categories")
public class CategoryController {

	private final CategoryServicePort categoryServicePort;

	public CategoryController(CategoryServicePort categoryServicePort) {

		this.categoryServicePort = categoryServicePort;
	}

	@ApiOperation("Listar")

	@GetMapping
	public ResponseEntity<List<Category>> read() {

		List<Category> categoryList = categoryServicePort.listCategory();

		return ResponseEntity.ok(categoryList);
	}

	@ApiOperation("Listar por Id")
	@GetMapping("/{categoryId}")
	public ResponseEntity<Category> getById(@PathVariable Long categoryId) {

		return ResponseEntity.ok(categoryServicePort.listOrFail(categoryId));

	}

	@ApiOperation("Listar Id por nome")

	@GetMapping("/searchByName")
	public ResponseEntity<String> getByName(@RequestParam String name) {

		return ResponseEntity.ok(categoryServicePort.getByName(name));

	}

	@ApiOperation("Criar")

	@PostMapping
	public ResponseEntity<Category> create(@RequestBody @Valid Category category) {

		Category savedCategory = categoryServicePort.save(category);

		return ResponseEntity.status(HttpStatus.CREATED).body(savedCategory);

	}

	@ApiOperation("Atualizar")
	@PutMapping("/{categoryId}")
	public ResponseEntity<Category> upDate(@PathVariable Long categoryId, @RequestBody @Valid Category category) {

		Category categoryAtual = categoryServicePort.listOrFail(categoryId);

		BeanUtils.copyProperties(category, categoryAtual, "id");

		Category savedCategory = categoryServicePort.save(categoryAtual);

		return ResponseEntity.ok(savedCategory);

	}

	@ApiOperation("Excluir")
	@DeleteMapping("/{categoryId}")
	public ResponseEntity<Void> delete(@PathVariable Long categoryId) {

		Category category = categoryServicePort.listOrFail(categoryId);

		categoryServicePort.delete(category.getId());

		return ResponseEntity.noContent().build();

	}

}
