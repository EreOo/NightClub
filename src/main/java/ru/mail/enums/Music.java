package ru.mail.enums;

import static ru.mail.utils.EnumUtil.randomEnum;

public enum Music {
    RNB("хип хоп и RnB"),
    POP("поп"),
    ELECTRO("электрохаус");

    private String value;

    Music(String value) {
        this.value = value;
    }

    public static Music getRandom() {
        return randomEnum(Music.class);
    }

    public String getValue() {
        return value;
    }

}
