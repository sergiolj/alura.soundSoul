package br.com.alura.models.music;

import br.com.alura.util.Genre;

import java.util.ArrayList;

public class Band extends Artist{
    private int numberOfMembers = 0;
    private final ArrayList<Musician> musicians;
    private final int established;
    private Genre mainGenre;

    public Band(String name, String nationality, Genre mainGenre, int established) {
        super(name, nationality);
        this.mainGenre = mainGenre;
        this.established = established;
        this.musicians = new ArrayList<>();
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
