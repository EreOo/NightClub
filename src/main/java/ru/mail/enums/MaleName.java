package ru.mail.enums;

import static ru.mail.utils.EnumUtil.randomEnum;

public enum MaleName {
    GOSHA("Гоша"),
    ANDREY("Андрей"),
    DIMA("Дима"),
    VOVA("Вова"),
    PETYA("Петя"),
    KOLYA("Коля"),
    GENA("Гена"),
    IGOR("Игорь"),
    VASYA("Вася");

    private String value;

    MaleName(String value) {
        this.value = value;
    }

    public static MaleName getRandom() {
        return randomEnum(MaleName.class);
    }

    public String getValue() {
        return value;
    }

}
