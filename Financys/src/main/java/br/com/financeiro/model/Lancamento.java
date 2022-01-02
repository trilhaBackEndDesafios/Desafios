package br.com.financeiro.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
@Entity
public class Lancamento {
	
	@Id
	@GeneratedValue(strategy  = GenerationType.IDENTITY)
	private Long id;
	@Column
	private String name;
	@Column
	private String description;
	@Column
	private String type;
	@Column
	private String amount;
	@Column
	private String date;
	@Column
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