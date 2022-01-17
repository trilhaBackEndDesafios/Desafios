package br.com.desafiofour.assembler;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.desafiofour.dto.EntryDto;
import br.com.desafiofour.model.entity.Entry;

@Component
public class EntryDtoOutPut {

	@Autowired
	private ModelMapper modelMapper;

	public EntryDto toModel(Entry entry) {

		return modelMapper.map(entry, EntryDto.class);
	}

	public List<EntryDto> toCollectionEntry(List<Entry> entry) {
		return entry.stream()
				.map(entryModel -> toModel(entryModel)).
				collect(Collectors.toList());
	}
	
		 
}
