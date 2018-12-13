package ru.mail.enums;

import static ru.mail.enums.EnumUtil.randomEnum;

public enum Gender {
    MALE, FEMALE;

    public static Gender getRandom() {
        return randomEnum(Gender.class);
    }
}
