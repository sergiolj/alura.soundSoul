package br.com.alura.models.music;

public abstract class Artist {
    final String name;
    final String nationality;

    public Artist(String name, String nationality) {
        this.name = name;
        this.nationality =  nationality;
    }
    public String getName() {
        return name;
    }
    public String getNationality() {
        return nationality;
    }
}
