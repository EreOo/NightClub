package ru.mail.models;

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

    private String dance() {
        System.out.println(name + " танцует под " + loveMusic.getValue() + "＼(≧▽≦)／");
        return "танцует";
    }

    private String drink() {
        System.out.println(name + " пьет водку на баре ┐( ˘_˘ )┌");
        return "пьет";
    }

    public String listenMusic(Music music) {
        if (music.equals(loveMusic)) {
            return dance();
        } else {
            return drink();
        }
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
}
