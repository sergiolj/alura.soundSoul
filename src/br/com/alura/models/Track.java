package br.com.alura.models;

public class Track extends Audio{
    private Album album;
    private Artist artist;

    public Track(String title, Enum genre, int minutes, int seconds, Album album, Artist artist) {
        super(title, genre, minutes, seconds);
        this.album = album;
        this.artist = artist;
    }

}
