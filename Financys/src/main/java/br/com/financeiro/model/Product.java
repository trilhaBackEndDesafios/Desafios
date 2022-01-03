package br.com.financeiro.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode
public class Product {

	private Long id;
	private String name;
	private String description;
	private Double price;

	public Double addPrice(Double price) {
		return this.price = (price + 10);

	}

}
