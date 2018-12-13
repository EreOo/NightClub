package ru.mail.helpers;

import ru.mail.enums.Music;
import ru.mail.models.Dj;
import ru.mail.models.Guest;

import java.util.List;

import static ru.mail.utils.Waiter.customWait;

/**
 * Created Vladimir Shekhavtsov.
 */
public class Party {

    public void letsGo(Dj dj, List<Guest> guests) {
        for (int i = 0; i < 5; i++) {
            Music music = dj.playMusic();
            guests.forEach(guest -> guest.listenMusic(music));
            System.out.println("---------------------------------------");
            customWait(5000);
        }
    }
}
