package ru.mail.helpers;

import ru.mail.enums.Music;
import ru.mail.models.Dj;
import ru.mail.models.Guest;

import java.util.List;

import static ru.mail.utils.Waiter.customWait;

/**
 * Created Vladimir Shekhavtsov.
 * Пора устроить вечеринку!
 * Вечеринка не может быть вечной, ограничение в количестве сетов диджея.
 * Между сетами есть паузы (таймауты).
 */
public class Party {
    private static final int DJ_SET_COUNT = 7;
    private static final int TIMEOUT = 5000;

    /**
     * Метод эмулирует вечеринку.
     *
     * @param dj     пригласите диджея.
     * @param guests позовите гостей.
     */
    public void letsGo(Dj dj, List<Guest> guests) {
        for (int i = 0; i < DJ_SET_COUNT; i++) {
            Music music = dj.playMusic();
            guests.forEach(guest -> guest.listenMusic(music));
            System.out.println("---------------------------------------");
            customWait(TIMEOUT);
        }
    }
}
