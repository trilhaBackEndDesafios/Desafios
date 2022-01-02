package br.com.financeiro.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
@EqualsAndHashCode
@Entity
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column
	private String name;
	@Column
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
