package ru.mail.models;

import ru.mail.enums.Music;

/**
 * Created Vladimir Shekhavtsov.
 */
public class Dj {

    public Music playMusic() {
        Music music = Music.getRandom();
        System.out.println("♬♫♪ Диджей играет " + music.getValue() + " ♫♬!");
        return music;
    }
}
