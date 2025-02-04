package br.com.alura.models;

import br.com.alura.util.Genre;

import java.util.ArrayList;

public class Band implements Artist{
    private int numberOfMembers = 0;
    private final ArrayList<Musician> musicians = new ArrayList<Musician>();
    private final String name;
    private final int established;
    private final String nationality;
    private Genre mainGenre;

    public Band(String name, int established, String nationality, Genre mainGenre) {
        this.name = name;
        this.established = established;
        this.nationality = nationality;
        this.mainGenre = mainGenre;
    }

    public void addArtist(Musician musician) {
        musicians.add(musician);
        numberOfMembers = musicians.size();
    }

    public void removeArtist(Musician musician) {
        musicians.remove(musician);
        numberOfMembers = musicians.size();
    }

    public int getNumberOfMembers() {
        return numberOfMembers;
    }

    @Override
    public String toString() {
        return String.format("""
                Band: %s
                Established: %d
                Actual Formation: %s
                """, name, established, musicians);
    }
}
