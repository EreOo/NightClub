package ru.mail;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.mail.enums.Gender;
import ru.mail.enums.Music;

import java.util.Arrays;

/**
 * Created Vladimir Shekhavtsov.
 */
public class GuestRandomiserTest {

    @Test()
    public void checkSize() {
        Assert.assertTrue(new GuestRandomiser().getRandomPeople().size() > 0);
    }

    @Test
    public void checkGender() {
        Assert.assertTrue(Arrays.asList(Gender.values())
                .contains(new GuestRandomiser().getRandomPeople().get(0).getGender()));
    }

    @Test
    public void checkMusic() {
        Assert.assertTrue(Arrays.asList(Music.values())
                .contains(new GuestRandomiser().getRandomPeople().get(0).getLoveMusic()));
    }

    @Test
    public void checkName() {
        Assert.assertTrue(new GuestRandomiser().getRandomPeople().get(0).getName().matches("^[а-яА-Я]+$"));
    }
}
