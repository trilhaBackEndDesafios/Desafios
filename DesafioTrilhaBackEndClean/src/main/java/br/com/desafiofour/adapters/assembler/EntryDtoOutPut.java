package br.com.desafiofour.adapters.assembler;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.desafiofour.adapters.dto.EntryDto;
import br.com.desafiofour.adapters.outbound.entities.EntryEntity;

@Component
public class EntryDtoOutPut {

	@Autowired
	private ModelMapper modelMapper;

	public EntryDto toModel(EntryEntity entryEntity) {

		return modelMapper.map(entryEntity, EntryDto.class);
	}

	public List<EntryDto> toCollectionEntry(List<EntryEntity> entryEntity) {
		return entryEntity.stream()
				.map(entryModel -> toModel(entryModel)).
				collect(Collectors.toList());
	}
	
		 
}
