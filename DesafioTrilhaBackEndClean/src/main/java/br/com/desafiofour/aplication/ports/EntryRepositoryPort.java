package br.com.desafiofour.aplication.ports;

import java.util.List;
import java.util.Optional;

import br.com.desafiofour.adapters.outbound.entities.EntryEntity;

public interface EntryRepositoryPort {
	
	 List<EntryEntity> findAll();
	 EntryEntity save(EntryEntity entryEntity);
	 void deleteById(long entryIid);
	 boolean existsById(long idCategory);
	 Optional<EntryEntity> findById(Long entryId);	
	 Integer calculaMedia(Integer x, Integer y);

}
