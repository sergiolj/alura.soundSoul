package br.com.alura.main;

import br.com.alura.models.music.Album;
import br.com.alura.models.music.Band;
import br.com.alura.models.music.Musician;
import br.com.alura.models.music.Track;
import br.com.alura.util.Genre;
import br.com.alura.util.Playlist;

import java.time.LocalDate;

public class SoundSoul {
    public static void main(String[] args) {

        Musician leadVocal = new Musician("Ann Wilson","United States",
                LocalDate.of(1954,3,16));
        Musician leadGuitar = new Musician("Nancy Wilson","United States",
                LocalDate.of(1950,6,19));


        Band newBand = new Band("Heart", "United States",Genre.HARD_ROCK,1967) ;
        newBand.addArtist(leadVocal);
        newBand.addArtist(leadGuitar);

        System.out.println(newBand);

        Album newAlbum = new Album("Bad Animals", newBand,10, 1987);

        Track track1 = new Track(newAlbum,"Who Will You Run To",Genre.POP, 4,6, newBand, leadVocal, 1984);
        Track track2 = new Track(newAlbum,"Alone",Genre.POP, 3,39,newBand, leadVocal, 1984);
        newAlbum.addTrack(track1);
        newAlbum.addTrack(track2);


        Playlist myplaylist = new Playlist("POP Songs");
        myplaylist.add(track1);
        myplaylist.add(newAlbum);
        myplaylist.play();

    }
}
