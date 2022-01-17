package br.com.desafiofour.adapters.assembler;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import br.com.desafiofour.adapters.dto.EntryDto;
import br.com.desafiofour.adapters.outbound.entities.EntryEntity;

public class EntryDtoInput {

	@Autowired
	private ModelMapper modelMapper;

	public EntryEntity toDomainObject(EntryDto EntryInput) {

		return modelMapper.map(EntryInput, EntryEntity.class);
	}

}
