package br.com.desafiofour.model.entity;

import com.fasterxml.jackson.annotation.JsonValue;

public enum EnumType {

	REVENUE("REVENUE"),
	EXPENSE("EXPENSE");

	private String typeEnum;

	@JsonValue
	public String getTypeEnum() {
		return this.typeEnum;
	}

	private EnumType(String typeEnum) {
		this.typeEnum = typeEnum;
	}

}
