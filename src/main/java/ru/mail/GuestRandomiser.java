package ru.mail;

import ru.mail.enums.FemaleName;
import ru.mail.enums.Gender;
import ru.mail.enums.MaleName;
import ru.mail.enums.Music;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created Vladimir Shekhavtsov.
 */
public class GuestRandomiser {
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
        return new Random().nextInt(10);
    }
}
