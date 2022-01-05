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
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.desafiofour.exception.EntityNotFoundException;
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
	private CategoryRepository categoryRepository;
	
	@Autowired
	private CategoryService categoryService;
	
	@ApiOperation("Listar")
	@GetMapping
	public List<Category> read() {

		return categoryRepository.findAll();
	}
	
	@ApiOperation("Listar por Id")
	@GetMapping("/{categoryId}")
	public Category findById(@PathVariable Long categoryId) {

		return categoryService.listOrFail(categoryId);

	}
	
	@ApiOperation("Criar")
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Category create(@RequestBody Category category) {

		return categoryService.save(category);

	}
	
	
	
	@ApiOperation("Atualizar")
	@PutMapping("/{categoryId}")
	public Category upDate(@PathVariable Long categoryId, @RequestBody Category category) {

		Category categoryAtual = listOrFail(categoryId);

		BeanUtils.copyProperties(category, categoryAtual, "id");

		return categoryService.save(categoryAtual);

	}
	
	@ApiOperation("Excluir")
	@DeleteMapping("/{categoryId}")
	public ResponseEntity<Category> delete(@PathVariable Long categoryId) {

		Category category = listOrFail(categoryId);

		categoryRepository.delete(category);

		return ResponseEntity.noContent().build();

	}

	public Category listOrFail(Long categoryId) {

		return categoryRepository.findById(categoryId)
				.orElseThrow(() -> new EntityNotFoundException(String.format("Categoria %d não encontrada:", categoryId)));
	}

}
