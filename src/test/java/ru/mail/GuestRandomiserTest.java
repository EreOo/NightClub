package ru.mail;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.mail.enums.Gender;
import ru.mail.enums.Music;
import ru.mail.helpers.GuestRandomiser;
import ru.mail.models.Guest;

import java.util.Arrays;
import java.util.List;

/**
 * Created Vladimir Shekhavtsov.
 */
public class GuestRandomiserTest {

    @Test()
    public void checkSize() {
        Assert.assertTrue(getRandomPeople().size() > 0);
    }

    @Test
    public void checkGender() {
        Assert.assertTrue(Arrays.asList(Gender.values())
                .contains(getRandomPeople().get(0).getGender()));
    }

    @Test
    public void checkMusic() {
        Assert.assertTrue(Arrays.asList(Music.values())
                .contains(getRandomPeople().get(0).getLoveMusic()));
    }

    @Test
    public void checkName() {
        Assert.assertTrue(getRandomPeople().get(0).getName().matches("^[а-яА-Я]+$"));
    }

    private List<Guest> getRandomPeople() {
        return new GuestRandomiser().getRandomPeople();
    }
}
