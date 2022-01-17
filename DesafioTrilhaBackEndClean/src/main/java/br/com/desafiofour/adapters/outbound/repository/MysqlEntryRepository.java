package br.com.desafiofour.adapters.outbound.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import br.com.desafiofour.adapters.outbound.entities.EntryEntity;
import br.com.desafiofour.aplication.ports.EntryRepositoryPort;

@Component
@Primary
public class MysqlEntryRepository implements EntryRepositoryPort {

	private EntryRepository entryRepository;

	public MysqlEntryRepository(EntryRepository entryRepository) {

		this.entryRepository = entryRepository;
	}

	@Override
	public List<EntryEntity> findAll() {
		
		return entryRepository.findAll();
	}

	@Override
	public EntryEntity save(EntryEntity entryEntity) {
		
		return entryRepository.save(entryEntity);
	}

	@Override
	public void deleteById(long entryIid) {
		entryRepository.deleteById(entryIid);
	}

	@Override
	public boolean existsById(long idCategory) {
		return entryRepository.existsById(idCategory);
	}

	@Override
	public Optional<EntryEntity> findById(Long entryId) {
		return entryRepository.findById(entryId);
	}

	@Override
	public Integer calculaMedia(Integer x, Integer y) {

		return null;
	}

}
