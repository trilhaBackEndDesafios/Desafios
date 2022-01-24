package br.com.desafiofour.service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.desafiofour.assembler.EntryDtoOutPut;
import br.com.desafiofour.dto.EntryDto;
import br.com.desafiofour.exception.CalculateAverageException;
import br.com.desafiofour.exception.EntityIsEmptyExceptions;
import br.com.desafiofour.exception.EntityNotFoundException;
import br.com.desafiofour.exception.EntityNullException;
import br.com.desafiofour.model.entity.Entry;
import br.com.desafiofour.repositoy.CategoryRepository;
import br.com.desafiofour.repositoy.EntryRepository;

@Service
public class EntryService {

	@Autowired
	private EntryRepository entryRepository;

	@Autowired
	private CategoryRepository categoryRepository;

	@Autowired
	private EntryDtoOutPut entryDtoOutPut;

	public List<Entry> listEntry() {

		return entryRepository.findAll();

	}

	public Entry save(Entry entry) {

		return entryRepository.save(entry);

	}

	public void delete(long entryIid) {

		entryRepository.deleteById(entryIid);

	}

	public boolean validateCategoryById(long idCategory) {

		return categoryRepository.existsById(idCategory);

	}

	public Entry listOrFail(Long entryId) {

		return entryRepository.findById(entryId).orElseThrow(
				() -> new EntityNotFoundException(String.format("Lançamento %d não encontrada:", entryId)));
	}

	public Map<Long, List<EntryDto>> listByCategory() {

		List<Entry> list = listEntry();

		Map<Long, List<EntryDto>> mapEntryDto = list.stream().collect(Collectors.groupingBy(Entry::getCategoryId,
				Collectors.mapping(p -> entryDtoOutPut.toModel(p), Collectors.toList())));

		return mapEntryDto;

	}

	public List<Entry> getLancamentosDependentes(String data_lancamento, String amount, boolean paid) {

		if ((StringUtils.isEmpty(data_lancamento)) && ((StringUtils.isEmpty(amount))) && (paid == false)) {

			throw new EntityNullException("Parâmetros com valores incorretos");

		}

		if ((data_lancamento == null) || (amount == null) || (paid == false)) {

			throw new EntityIsEmptyExceptions("Parâmetros com valores incorretos");

		}

		List<Entry> lancamentosPendentes = entryRepository.findByLancamentosPendentes(data_lancamento, amount, paid);

		return lancamentosPendentes.isEmpty() ? null : lancamentosPendentes;

	}

	public Integer calculaMedia(Integer x, Integer y) {

		try {

			return (x / y);

		} catch (ArithmeticException e) {

			throw new CalculateAverageException(e.getMessage());
		}
	}

}
