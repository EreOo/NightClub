package ru.mail;

import ru.mail.enums.Gender;
import ru.mail.enums.Music;

/**
 * Created Vladimir Shekhavtsov.
 */
public class Guest {
    private String name;
    private Gender gender;
    private Music loveMusic;

    public Guest(String name, Gender gender, Music loveMusic) {
        this.name = name;
        this.gender = gender;
        this.loveMusic = loveMusic;
    }

    public void dance() {

    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public Music getLoveMusic() {
        return loveMusic;
    }

    public void drink() {


    }
}
