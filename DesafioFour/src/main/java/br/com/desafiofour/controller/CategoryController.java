package br.com.desafiofour.controller;

import java.util.List;

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
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.desafiofour.model.Category;
import br.com.desafiofour.repositoy.CategoryRepository;
import br.com.desafiofour.service.CategoryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(tags = "Category")
@RestController
@RequestMapping("/categories")
public class CategoryController {

	@Autowired
	private CategoryService categoryService;

	@ApiOperation("Listar")
	@GetMapping
	public ResponseEntity<List<Category>> read() {

		List<Category> categoryList = categoryService.listCategory();

		return ResponseEntity.ok(categoryList);
	}

	@ApiOperation("Listar por Id")
	@GetMapping("/{categoryId}")
	public Category getById(@PathVariable Long categoryId) {

		return categoryService.listOrFail(categoryId);

	}

	@ApiOperation("Listar Id por nome")
	@GetMapping("/searchByName")
	public String getByName(@RequestParam String name) {

		return categoryService.getByName(name);

	}

	@ApiOperation("Criar")
	@PostMapping
	public ResponseEntity<Category> create(@RequestBody Category category) {

		Category savedCtegory = categoryService.save(category);

		return ResponseEntity.ok(savedCtegory);

	}

	@ApiOperation("Atualizar")
	@PutMapping("/{categoryId}")
	public ResponseEntity<Category> upDate(@PathVariable Long categoryId, @RequestBody Category category) {

		Category categoryAtual = categoryService.listOrFail(categoryId);

		BeanUtils.copyProperties(category, categoryAtual, "id");

		Category savedCategory = categoryService.save(categoryAtual);

		return ResponseEntity.ok(savedCategory);

	}

	@ApiOperation("Excluir")
	@DeleteMapping("/{categoryId}")
	public ResponseEntity<Category> delete(@PathVariable Long categoryId) {

		Category category = categoryService.listOrFail(categoryId);

		categoryService.delete(category.getId());

		return ResponseEntity.noContent().build();

	}

}
