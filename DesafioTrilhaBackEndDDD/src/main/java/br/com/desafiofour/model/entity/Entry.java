package br.com.desafiofour.model.entity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Entry {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank()
	@Size(min = 3, max = 45)
	private String name;

	@NotBlank()
	@Size(min = 15, max = 150)
	private String description;
	
	@NotNull
	@Enumerated(value = EnumType.STRING)
	private EnumType type;

	@PositiveOrZero
	private String amount;

	@NotBlank()
	@Size(min = 3, max = 15)
	private String date;

	@NotNull
	private boolean paid;

	private Long categoryId;

}
