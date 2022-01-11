package br.com.desafiofour.model.entity;

import lombok.Getter;

@Getter
public enum DespesaRecxeita {

    REVENUE("revenue"),
    EXPENSE("expense");

    private String typeEnum;

    private DespesaRecxeita(String typeENum) {
        this.typeEnum = typeENum;
    }

    public String getTypeEnum() {
        return typeEnum;
    }
}
