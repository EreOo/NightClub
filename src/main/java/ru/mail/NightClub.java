package ru.mail;

import ru.mail.helpers.GuestRandomiser;
import ru.mail.helpers.Party;
import ru.mail.models.Dj;

/**
 * Created Vladimir Shekhavtsov.
 */
public class NightClub {

    public static void main(String[] args) {
        new Party().letsGo(new Dj(), new GuestRandomiser().getRandomPeople());
    }
}
