package br.com.alura.models.music;

import br.com.alura.models.Audio;

public class Music extends Audio {
    private Artist artist;
    private Artist writer;
    private int releaseYear;

    public Music(String name, Enum genre, int minutes, int seconds, Artist artist, int releaseYear) {
        super(name, genre, minutes, seconds);
        this.artist = artist;
        this.writer = writer;
        this.releaseYear = releaseYear;
    }
}
