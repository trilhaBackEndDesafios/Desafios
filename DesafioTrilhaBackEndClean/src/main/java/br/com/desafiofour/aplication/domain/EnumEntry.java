package br.com.desafiofour.aplication.domain;

import com.fasterxml.jackson.annotation.JsonValue;

public enum EnumEntry {
	
	REVENUE("REVENUE"),
	EXPENSE("EXPENSE");

	private String typeEnum;

	@JsonValue
	public String getTypeEnum() {
		return this.typeEnum;
	}

	private EnumEntry(String typeEnum) {
		this.typeEnum = typeEnum;
	}
}
