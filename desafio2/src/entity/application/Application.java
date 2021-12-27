package entity.application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
		Category wage  = new Category(4L, "Salário", "Recebimento de Salário");
		Category freela = new Category(5L, "Freela", "Horas Trabalhadas");

		System.out.println(leisure.toString());
		System.out.println(cheers.toString());
		System.out.println(food.toString());
		System.out.println(wage.toString());
		System.out.println(freela.toString());

		/* Criando objeto com construtor padrão */
		Category category  = new Category();

		category.setId(4L);
		category.setName("Salario");
		category.setDescription("Recebimento de Salário");

		System.out.println();
		System.out.println(category.toString());

		/* Criando objeto com construtor com parametros */
		Lancamento lancamentoSalario = new Lancamento(1L, "Salário Empreza x", "Adiantamento quinzenal", "revenue", "4405,49",
				"15/09/2021", true, 4L);
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

		System.out.println("Todos os Produtos:");

		/* Criando lista de produtos */

		List<Product> listProduct = Arrays.asList(new Product(1L, "Arroz", "Agulinha", product.addPrice(26.00)),
				new Product(2L, "Feijão", "Carioca", product.addPrice(7.00)),
				new Product(3L, "Leite", "Integral", product.addPrice(3.60)),
				new Product(4L, "Café", "Moido", product.addPrice(16.00)),
				new Product(5L, "Açucar", "Cristal", product.addPrice(9.00)));

		
		for (Product prod : listProduct) {

			System.out.println(prod.toString());
		}

		/* Criando segunda lista de produtos mais caros */

		List<Product> listOfExpenciveProducts = new ArrayList<Product>() {
			{
				add(new Product(1L, "Carne", "Picanha", product.addPrice(80.00)));

				add(new Product(2L, "Cerveja", "Heineken", product.addPrice(40.00)));

				add(new Product(3L, "Peixe", "Tilapia", product.addPrice(46.00)));
			}
		};

		for (Product prod : listOfExpenciveProducts) {
			System.out.println(prod.toString());
		}

		

	}

}
