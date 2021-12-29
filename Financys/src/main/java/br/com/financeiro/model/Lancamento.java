package br.com.financeiro.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
public class Lancamento {

	private Long id;
	private String name;
	private String description;
	private String type;
	private String amount;
	private String date;
	private boolean paid;
	private Long categoryId;

	public Lancamento() {

	}

	public Lancamento(Long id, String name, String description, String type, String amount, String date, boolean paid,
			Long categoryId) {

		this.id = id;
		this.name = name;
		this.description = description;
		this.type = type;
		this.amount = amount;
		this.date = date;
		this.paid = paid;
		this.categoryId = categoryId;
	}

	@Override
	public String toString() {
		return "Lancamento  id=" + id + ", name=" + name + ", description=" + description + ", type=" + type
				+ ", amount=" + amount + ", date=" + date + ", paid=" + paid + ", categoryIg=" + categoryId;
	}

}