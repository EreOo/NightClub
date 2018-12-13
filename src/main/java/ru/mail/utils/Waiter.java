package ru.mail.utils;

import static com.sun.xml.internal.ws.spi.db.BindingContextFactory.LOGGER;

/**
 * Created Vladimir Shekhavtsov.
 * Ждет заданное количество МИЛЛИСЕКУНД.
 */
public class Waiter {

    public static void customWait(int mills) {
        try {
            Thread.sleep(mills);
        } catch (InterruptedException e) {
            LOGGER.warning("!!!!!!!!!!! Oh, looks like broken waiter !!!!!!!!!!!!!!");
        }
    }
}
