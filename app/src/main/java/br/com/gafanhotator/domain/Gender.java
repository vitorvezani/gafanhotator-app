package br.com.gafanhotator.domain;

/**
 * Created by vitor on 14/01/2016.
 */
public enum Gender {

    NA("Outro"), FEMALE("Feminino"), MALE("Masculino");

    private Gender(String value) {
        this.value = value;
    }

    String value;

}
