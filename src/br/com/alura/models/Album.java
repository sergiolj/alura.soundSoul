package br.com.alura.models;

public class Album {
    private int year;
    private String title;
    private Artist artist;
    private int duration;
    private int tracks;


    public Album(String title, Artist artist, int tracks, int year) {
        this.title = title;
        this.artist = artist;
        this.tracks = tracks;
        this.year = year;
    }

    public int setDuration(int duration) {
        return this.duration = duration;
    }

}
