package entity;

import java.util.ArrayList;
import java.util.List;

public class Application {

	public static void main(String[] args) {

		Product product = new Product();

		List<Product> listProduct = new ArrayList<Product>();
		List<Product> listProductCaro = new ArrayList<Product>();

		Category category1 = new Category(1L, "Lazer", "Futebol");
		Category category2 = new Category(2L, "Saúde", "Consulta");
		Category category3 = new Category(3L, "Alimentação", "Almoço");
		Category category4 = new Category(4L, "Salário", "Recebimento de Salário");
		Category category5 = new Category(5L, "Freela", "Horas Trabalhadas");

		System.out.println(category1.toString());
		System.out.println(category2.toString());
		System.out.println(category3.toString());
		System.out.println(category4.toString());
		System.out.println(category5.toString());

		Category category6 = new Category();

		category6.setId(4L);
		category6.setName("Salario");
		category6.setDescription("Recebimento de Salário");

		System.out.println();
		System.out.println(category6.toString());

		Entry lancamento1 = new Entry(1L, "Salário Empreza x", "Adiantamento quinzenal", "revenue", "4405,49",
				"15/09/2021", true, 4L);
		System.out.println();
		System.out.println(lancamento1.toString());

		Entry lancamento2 = new Entry();

		lancamento2.setId(3L);
		lancamento2.setName("Salario Empreza x");
		lancamento2.setDescription("Adiantamento quinzenal");
		lancamento2.setType("revenue");
		lancamento2.setAmount("4405,49");
		lancamento2.setDate("15/09/2021");
		lancamento2.setPaid(true);
		lancamento2.setCategoryId(4L);

		System.out.println();
		System.out.println(lancamento2.toString());

		
		listProduct.add(new Product(1L, "Arroz", "Agulinha", 26.00));
		listProduct.add(new Product(2L, "Feijão", "Carioca", 7.00));
		listProduct.add(new Product(3L, "Leite", "Integral", 3.59));
		listProduct.add(new Product(4L, "Café", "Moido", 15.00));
		listProduct.add(new Product(5L, "Açucar", "Cristal", 9.50));

		
		for (Product prod : listProduct) {

			System.out.println(prod.toString());
		}

		listProductCaro.add(new Product(1L, "Carne", "Picanha", 80.00));
		listProductCaro.add(new Product(2L, "Cerveja", "Heineken", 40.00));
		listProductCaro.add(new Product(3L, "Peixe", "Tilapia", 46.00));

		System.out.println("Produtos mais  caros:");
		
		for (Product prod : listProductCaro) {
			System.out.println(prod.toString());
		}
		System.out.println("Todos os Produtos:");
	}

}
