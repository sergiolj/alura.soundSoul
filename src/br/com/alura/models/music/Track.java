package br.com.alura.models.music;

public class Track extends Music {
    private Album album;

    public Track(Album album, String name, Enum genre, int minutes, int seconds, Artist artist,
                 Artist writer, int releaseYear)  {
        super(name, genre, minutes, seconds, writer, releaseYear);
        this.album = album;
    }
}
