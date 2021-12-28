package model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
public class Product {

	private Long id;
	private String name;
	private String description;
	private Double price;

	public Product() {

	}

	public Product(Long id, String name, String description, Double price) {

		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product id = " + id + ", name = " + name + ", description = " + description + ", price = " + price;
	}

	public Double addPrice(Double price) {
		return this.price = (price + 10);

	}

}
