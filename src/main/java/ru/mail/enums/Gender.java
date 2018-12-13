package ru.mail.enums;

import static ru.mail.utils.EnumUtil.randomEnum;

public enum Gender {
    MALE, FEMALE;

    public static Gender getRandom() {
        return randomEnum(Gender.class);
    }
}
