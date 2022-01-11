package br.com.desafiofour.assembler;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import br.com.desafiofour.dto.EntryDto;
import br.com.desafiofour.model.entity.Entry;

public class EntryDtoInput {

	@Autowired
	private ModelMapper modelMapper;

	public Entry toDomainObject(EntryDto EntryInput) {

		return modelMapper.map(EntryInput, Entry.class);
	}

}
