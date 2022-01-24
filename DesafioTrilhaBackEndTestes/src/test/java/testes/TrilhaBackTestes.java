package testes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import br.com.desafiofour.exception.EntityIsEmptyExceptions;
import br.com.desafiofour.exception.EntityNullException;
import br.com.desafiofour.model.entity.Entry;
import br.com.desafiofour.model.entity.EntryEnum;
import br.com.desafiofour.repositoy.EntryRepository;
import br.com.desafiofour.service.EntryService;

@ExtendWith(SpringExtension.class)
public class TrilhaBackTestes {

	@InjectMocks
	EntryService entryService;

	@Mock
	EntryRepository entryRepository;

	@Test
	public void testaEntrygetLancamentosDependentes_OK() {

		String data_lancamento = "22/12/2020";
		String amount = "400.00";
		boolean paid = true;

		List<Entry> entrysMocks = Arrays.asList(
				new Entry(1L, "Luiz", "Jogo de futebol", EntryEnum.REVENUE, "400.00", "22/12/2020", true, 1L),
				new Entry(10L, "Bob", "campeonato de musculação", EntryEnum.EXPENSE, "400.00", "22/12/2020", true, 1L),
				new Entry(11L, "Bia", "campeonato de musculação", EntryEnum.EXPENSE, "400.00", "22/12/2020", true, 1L));

		Mockito.when(entryRepository.findByLancamentosPendentes(data_lancamento, amount, paid)).thenReturn(entrysMocks);
		List<Entry> entryList = entryService.getLancamentosDependentes(data_lancamento, amount, paid);

		Assertions.assertNotNull(entryList);

	}

	@Test
	public void testaLancamentosDependentesNull_NotFound() {

		String data_lancamento = null;
		String amount = null;
		boolean paid = false;

		Assertions.assertThrows(EntityNullException.class,
				() -> entryService.getLancamentosDependentes(data_lancamento, amount, paid));

	}

	@Test
	public void testaLancamentosDependentesEmpty_NoCotent() {

		String data_lancamento = "22/12/2002";
		String amount = "500.00";
		boolean paid = false;

		List<Entry> entrysMocks = new ArrayList<Entry>();

		Mockito.when(entryRepository.findByLancamentosPendentes(data_lancamento, amount, paid)).thenReturn(entrysMocks);
		
		Assertions.assertThrows(EntityIsEmptyExceptions.class,
				() -> entryService.getLancamentosDependentes(data_lancamento, amount, paid));

	}

}
