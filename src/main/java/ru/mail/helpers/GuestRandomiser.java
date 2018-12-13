package ru.mail.helpers;

import ru.mail.enums.FemaleName;
import ru.mail.enums.Gender;
import ru.mail.enums.MaleName;
import ru.mail.enums.Music;
import ru.mail.models.Guest;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created Vladimir Shekhavtsov.
 * Класс создает список рандомных гостей.
 * Количество от 1 до MAX_GUESTS включительно (сейчас 10 человек).
 */
public class GuestRandomiser {
    private static final int MAX_GUESTS = 10;
    private List guests = new ArrayList<Guest>();

    public List<Guest> getRandomPeople() {
        for (int i = 0; i <= getRandomCount(); i++) {
            Gender gender = Gender.getRandom();
            String name;

            if (gender.equals(Gender.MALE)) {
                name = MaleName.getRandom().getValue();
            } else {
                name = FemaleName.getRandom().getValue();
            }
            guests.add(new Guest(name, gender, Music.getRandom()));
        }
        return guests;
    }

    private int getRandomCount() {
        return new Random().nextInt(MAX_GUESTS);
    }
}
