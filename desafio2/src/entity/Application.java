package entity;

import java.util.ArrayList;
import java.util.List;

public class Application {

	public static void main(String[] args) {

		Product product = new Product();

		List<Product> listProduct = new ArrayList<Product>();
		List<Product> listProductCaro = new ArrayList<Product>();

		Category category1 = new Category(1L, "Salário", "Recebimento de Salário");
		System.out.println(category1.toString());

		Category category2 = new Category();
		category2.setId(1L);
		category2.setName("Lazer");
		category2.setDescription("futebol");
		System.out.println(category2.toString());

		Entry lancamento1 = new Entry(3L, "Salário Empreza x", "Adiantamento quinzenal", "revenue", "4405,49",
				"15/09/2021", true, 2);

		System.out.println(lancamento1.toString());

		Entry lancamento2 = new Entry();

		lancamento2.setId(3L);
		lancamento2.setName("Salario Empreza x");
		lancamento2.setDescription("Adiantamento quinzenal");
		lancamento2.setType("revenue");
		lancamento2.setAmount("4405,49");
		lancamento2.setDate("15/09/2021");
		lancamento2.setPaid(true);
		lancamento2.setCategoryId(4);

		System.out.println(lancamento2.toString());

		product.setId(1L);
		product.setName("arooz");
		product.setDescription("vasconcelos");
		product.setPrice(23.90);

		for (int i = 0; i < 5; i++) {

			listProduct.add(product);
		}

		for (Product prod : listProduct) {

			System.out.println(prod.toString());
		}

		product.setId(1L);
		product.setName("arooz");
		product.setDescription("vasconcelos");
		product.setPrice(23.90);
		
		for (int i = 0; i < 3; i++) {

			listProductCaro.add(product);
		}
		
		System.out.println("Produtos caros:");
		for (Product prod : listProductCaro) {
			System.out.println(prod.toString());
		}
	}

}
