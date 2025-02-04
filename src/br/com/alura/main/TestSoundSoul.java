package br.com.alura.main;

import br.com.alura.models.*;
import br.com.alura.util.Genre;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TestSoundSoul {
    public static void main(String[] args) {

        Musician leadVocal = new Musician("Ann Wilson","United States",
                LocalDate.of(1954,3,16));
        Musician leadGuitar = new Musician("Nancy Wilson","United States",
                LocalDate.of(1950,6,19));


        Band newBand = new Band("Heart", 1967, "United States", Genre.ROCK);
        newBand.addArtist(leadVocal);
        newBand.addArtist(leadGuitar);

        System.out.println(newBand);

        Album newAlbum = new Album("Bad Animals", newBand,10, 1987);

        Track track1 = new Track("Who Will You Run To",Genre.POP, 4,6,newAlbum,newBand);

        //Track music = new Audio("Alone","Heart", "Bad Animals", "Pop Romantic", 218);
        //System.out.println(music.Classification());
        //music.Likes();
       // music.Play();
    }
}
