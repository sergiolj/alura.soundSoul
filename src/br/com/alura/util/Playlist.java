package br.com.alura.util;

import br.com.alura.models.music.Album;
import br.com.alura.models.music.Music;

import java.util.ArrayList;

public class Playlist {
    private ArrayList<Music> playlist;
    private String name;

    public Playlist(String name) {
        this.name = name;
        this.playlist = new ArrayList<>();
    }

    public void add(Music music) {
        playlist.add(music);
    }
    public void add(Album album) {
        Music newMusic;
        newMusic = album.getTrack();
        playlist.add(newMusic);
    }

    public void play() {
        for(int i=0; i< this.playlist.size(); i++){
            System.out.println("Playing..." + this.playlist.get(i).toString());
        }
    }
}
