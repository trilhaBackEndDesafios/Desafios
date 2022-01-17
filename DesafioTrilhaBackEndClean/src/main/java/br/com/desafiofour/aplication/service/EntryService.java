package br.com.desafiofour.aplication.service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import br.com.desafiofour.adapters.outbound.entities.EntryEntity;
import br.com.desafiofour.aplication.exception.CalculateAverageException;
import br.com.desafiofour.aplication.exception.EntityNotFoundException;
import br.com.desafiofour.aplication.ports.EntryRepositoryPort;
import br.com.desafiofour.aplication.ports.EntryServicePort;

public class EntryService implements EntryServicePort {

	private EntryRepositoryPort entryRepositoryPort;

	public EntryService(EntryRepositoryPort entryRepositoryPort) {

		this.entryRepositoryPort = entryRepositoryPort;
	}

	public List<EntryEntity> listEntry() {

		return entryRepositoryPort.findAll();

	}

	public EntryEntity save(EntryEntity entryEntity) {

		return entryRepositoryPort.save(entryEntity);

	}

	public void delete(long entryIid) {

		entryRepositoryPort.deleteById(entryIid);

	}

	public boolean validateCategoryById(long idCategory) {

		return entryRepositoryPort.existsById(idCategory);

	}

	public EntryEntity listOrFail(Long entryId) {

		return entryRepositoryPort.findById(entryId).orElseThrow(
				() -> new EntityNotFoundException(String.format("Lançamento %d não encontrada:", entryId)));
	}

	public Map<Long, List<EntryEntity>> listByCategory() {

		List<EntryEntity> list = listEntry();

		Map<Long, List<EntryEntity>> mapEntry = list.stream().collect(
				Collectors.groupingBy(EntryEntity::getCategoryId, Collectors.mapping(entry -> entry, Collectors.toList())));

		return mapEntry;

	}

	public Integer calculaMedia(Integer x, Integer y) {

		try {

			return (x / y);

		} catch (ArithmeticException e) {

			throw new CalculateAverageException(e.getMessage());
		}
	}

}
