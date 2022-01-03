package entity.application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import entity.model.Category;
import entity.model.Lancamento;
import entity.model.Product;

public class Application {

	public static void main(String[] args) {

		Product product = new Product();

		/* Criando objeto com construtor com parametros */

		Category leisure = new Category(1L, "Lazer", "Futebol");
		Category cheers = new Category(2L, "Saúde", "Consulta");
		Category food = new Category(3L, "Alimentação", "Almoço");
		Category wage = new Category(4L, "Salário", "Recebimento de Salário");
		Category freela = new Category(5L, "Freela", "Horas Trabalhadas");

		System.out.println(leisure.toString());
		System.out.println(cheers.toString());
		System.out.println(food.toString());
		System.out.println(wage.toString());
		System.out.println(freela.toString());

		/* Criando objeto com construtor padrão */
		Category category = new Category();

		category.setId(4L);
		category.setName("Salario");
		category.setDescription("Recebimento de Salário");

		System.out.println();
		System.out.println(category.toString());

		/* Criando objeto com construtor com parametros */
		Lancamento lancamentoSalario = new Lancamento(1L, "Salário Empreza x", "Adiantamento quinzenal", "revenue",
				"4405,49", "15/09/2021", true, 4L);
		System.out.println();
		System.out.println(lancamentoSalario.toString());

		/* Criando objeto com construtor padrão */
		Lancamento lancamento = new Lancamento();

		lancamento.setId(3L);
		lancamento.setName("Salario Empreza x");
		lancamento.setDescription("Adiantamento quinzenal");
		lancamento.setType("revenue");
		lancamento.setAmount("4405,49");
		lancamento.setDate("15/09/2021");
		lancamento.setPaid(true);
		lancamento.setCategoryId(4L);

		System.out.println();
		System.out.println(lancamento.toString());
		System.out.println();

		/* Criando lista de produtos */

		List<Product> listProducts = Arrays.asList(new Product(1L, "Arroz", "Agulinha", product.addPrice(26.00)),
				new Product(2L, "Feijão", "Carioca", product.addPrice(7.00)),
				new Product(3L, "Leite", "Integral", product.addPrice(3.60)),
				new Product(4L, "Café", "Moido", product.addPrice(16.00)),
				new Product(5L, "Açucar", "Cristal", product.addPrice(9.00)));

		/* Criando segunda lista de produtos mais caros */

		List<Product> listOfExpenciveProducts = Arrays.asList(new Product(1L, "Carne", "Picanha", 80.00),
				new Product(2L, "Cerveja", "Heineken", 40.00), new Product(3L, "Peixe", "Tilapia", 46.00));

		System.out.println("Produtos mais caros:");
		listOfExpenciveProducts.stream().forEach(p -> System.out.println(p));
		https://www.youtube.com/watch?v=AiIuJqJ0r8A
		System.out.println();
		System.out.println("Todos os Produtos:");

		List<Product> newList = Stream.concat(listProducts.stream(), listOfExpenciveProducts.stream())
				.collect(Collectors.toList());
		newList.stream().forEach(p -> System.out.println(p));

	}

}
