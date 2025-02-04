package br.com.alura.models;

import java.time.LocalDate;

public class Musician implements Artist {
    private final LocalDate birthDate;
    private final String name;
    private final String nationality;

    public Musician(String name, String nationality, LocalDate birthDate) {
        this.name = name;
        this.nationality = nationality;
        this.birthDate = birthDate;
    }

    public String getNationality() {
        return nationality;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    @Override
    public String toString() {
        return name;
    }
}
