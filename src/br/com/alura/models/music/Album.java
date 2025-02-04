package br.com.alura.models.music;

import java.util.ArrayList;

public class Album {
    private int releaseYear;
    private String title;
    private Artist artist;
    private int duration;
    private int numTracks;
    private ArrayList<Track> tracks;


    public Album(String title, Artist artist, int numTracks, int releaseYear) {
        this.title = title;
        this.artist = artist;
        this.numTracks = numTracks;
        this.releaseYear = releaseYear;
        this.tracks = new ArrayList<>();
    }

    public int setDuration(int duration) {
        return this.duration = duration;
    }

    public void addTrack(Track track) {
        this.tracks.add(track);
    }

    public Track getTrack() {
            return tracks.getLast();
        }
}
