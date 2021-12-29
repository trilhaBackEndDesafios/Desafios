package br.com.financeiro.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.financeiro.model.Category;
import br.com.financeiro.model.Lancamento;

@RestController
@RequestMapping("/categories")
public class FinanceiroController {

	private List<Category> listaCategory = new ArrayList<Category>();
	// private List<Lancamento> lista = new ArrayList<Lancamento>();

	@PostMapping
	public ResponseEntity<?> createCategory(@RequestBody Category category) {
		
		if ( category != null) {

			listaCategory.add(category);

		} else {

			ResponseEntity.badRequest().build();
		}

		return ResponseEntity.ok(listaCategory.lastIndexOf(category) + 1);		
		
	}

	@GetMapping
	public List<Category> readCategory() {

		return listaCategory.stream().collect(Collectors.toList());

	}

}
