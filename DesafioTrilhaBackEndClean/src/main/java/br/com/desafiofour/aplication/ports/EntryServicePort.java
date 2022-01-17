package br.com.desafiofour.aplication.ports;

import java.util.List;
import java.util.Map;

import br.com.desafiofour.adapters.outbound.entities.EntryEntity;

public interface EntryServicePort {
	
	 List<EntryEntity> listEntry();
	 EntryEntity save(EntryEntity entryEntity);
	 void delete(long entryIid);
	 boolean validateCategoryById(long idCategory);
	 EntryEntity listOrFail(Long entryId);	
	 Integer calculaMedia(Integer x, Integer y);
	  Map<Long, List<EntryEntity>> listByCategory();

}
