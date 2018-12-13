package ru.mail.models;

import ru.mail.enums.Gender;
import ru.mail.enums.Music;

/**
 * Created Vladimir Shekhavtsov.
 * Гость клуба. У него есть имя, пол и любимая музыка.
 * Когда он слышит любимую мелодию - танцует, когда музыка не нравится - пьет водку.
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

    public String listenMusic(Music music) {
        if (music.equals(loveMusic)) {
            return dance();
        } else {
            return drink();
        }
    }

    // возвращает String для тестирования.
    private String dance() {
        System.out.println(name + " танцует под " + loveMusic.getValue() + "＼(≧▽≦)／");
        return "танцует";
    }

    // возвращает String для тестирования.
    private String drink() {
        System.out.println(name + " пьет водку на баре ┐( ˘_˘ )┌");
        return "пьет";
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
