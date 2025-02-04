package br.com.alura.models.music;

import java.time.LocalDate;

public class Musician extends Artist {
    private final LocalDate birthDate;

    public Musician(String name, String nationality, LocalDate birthDate) {
        super(name, nationality);
        this.birthDate = birthDate;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    @Override
    public String toString() {
        return name;
    }
}
