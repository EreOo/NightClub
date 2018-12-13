package ru.mail;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.mail.enums.Gender;
import ru.mail.enums.Music;
import ru.mail.models.Dj;
import ru.mail.models.Guest;

import java.util.Arrays;

/**
 * Created Vladimir Shekhavtsov.
 * Тесты для проверки работоспособности диджея и гостей.
 */
public class PartyTest {

    @Test
    public void checkDJ() {
        Assert.assertTrue(Arrays.asList(Music.values()).contains(new Dj().playMusic()));
    }

    @Test
    public void checkGuestDance() {
        Guest guest = new Guest("TEST", Gender.MALE, Music.POP);
        Assert.assertTrue(guest.listenMusic(Music.POP).equals("танцует"));
    }

    @Test
    public void checkGuestDrink() {
        Guest guest = new Guest("TEST", Gender.MALE, Music.POP);
        Assert.assertTrue(guest.listenMusic(Music.ELECTRO).equals("пьет"));
    }
}
