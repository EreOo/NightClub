package ru.mail.enums;

import static ru.mail.enums.EnumUtil.randomEnum;

/**
 * Created Vladimir Shekhavtsov.
 */
public enum FemaleName {
    MASHA("Маша"),
    ANYA("Аня"),
    LUDA("Люда"),
    POLINA("Полина"),
    DASHA("Даша"),
    LENA("Лена"),
    ALLA("Алла"),
    VERA("Вера");

    private String value;

    FemaleName(String value) {
        this.value = value;
    }

    public static FemaleName getRandom() {
        return randomEnum(FemaleName.class);
    }

    public String getValue() {
        return value;
    }
}
