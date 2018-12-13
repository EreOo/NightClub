package ru.mail.utils;

import java.util.Random;

/**
 * Created Vladimir Shekhavtsov.
 */
public class EnumUtil {

    public static <T extends Enum<?>> T randomEnum(Class<T> clazz) {
        int x = new Random().nextInt(clazz.getEnumConstants().length);
        return clazz.getEnumConstants()[x];
    }
}
