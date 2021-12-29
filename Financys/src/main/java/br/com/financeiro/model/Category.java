package br.com.financeiro.model;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
@Builder
@Getter
@Setter
@EqualsAndHashCode
public class Category {

	private Long id;
	private String name;
	private String description;

	public Category() {

	}

	public Category(Long id, String name, String description) {

		this.id = id;
		this.name = name;
		this.description = description;
	}

	@Override
	public String toString() {
		return "Category id=" + id + ", name=" + name + ", description=" + description;
	}

}
