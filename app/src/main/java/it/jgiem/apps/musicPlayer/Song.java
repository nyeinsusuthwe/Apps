package it.jgiem.apps.musicPlayer;

import androidx.annotation.DrawableRes;

import java.io.Serializable;

public record Song(String name, @DrawableRes int image, int song) implements Serializable {
}
