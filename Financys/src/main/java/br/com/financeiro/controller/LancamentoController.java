package br.com.financeiro.controller;

import java.util.ArrayList;
import java.util.Comparator;
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
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(tags = "Lancamento")
@RestController
@RequestMapping("/lancamento")
public class LancamentoController {

	private List<Lancamento> listLancamento = new ArrayList<Lancamento>();

	@ApiOperation("Criar")
	@PostMapping
	public ResponseEntity<?> createLancamento(@RequestBody Lancamento lancamento) {

		if (lancamento != null) {

			listLancamento.add(lancamento);

		} else {

			ResponseEntity.badRequest().build();
		}

		return ResponseEntity.ok(listLancamento.lastIndexOf(lancamento) + 1);

	}

	@ApiOperation("Listar")
	@GetMapping
	@ResponseStatus(HttpStatus.CREATED)
	public List<Lancamento> readLancamento() {

		return listLancamento.stream().sorted((d1, d2) -> d1.getDate().compareTo(d2.getDate()))
				.collect(Collectors.toList());
	}
}
