package controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Category;
import model.Lancamento;

@RestController
@RequestMapping("/categorias")
public class ControllerCategory {

	private List<Category> listaCategory = new ArrayList<Category>();
	private List<Lancamento> listaLancamento = new ArrayList<Lancamento>();

	public void addCategory() {
		
		listaCategory.add(new Category(1L, "Lazer", "Futebol"));
		listaCategory.add(new Category(2L, "Saúde", "Consulta"));
		listaCategory.add(new Category(3L, "Alimentação", "Almoço"));
		listaCategory.add(new Category(4L, "Salário", "Recebimento de Salário"));
		listaCategory.add(new Category(5L, "Freela", "Horas Trabalhadas"));

	}
	
	public void addLancamento() {
		listaLancamento.add(new Lancamento(1L, "Salário Empreza x", "Adiantamento quinzenal", "revenue",
				"4405,49", "15/09/2021", true, 4L));
	}

	@GetMapping
	public List<Category> listar() {
		return listaCategory;
	}

	
}
