package br.com.alura.models.pod;

import java.time.LocalDate;

public class Participants {
    private String name;
    private LocalDate dateOfBirth;
    private String profession;

    public Participants(String name, LocalDate dateOfBirth, String profession) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.profession = profession;
    }
    public String getName() {
        return name;
    }
    public String getProfession() {
        return profession;
    }
    public int getAge() {
        return LocalDate.now().getYear() - dateOfBirth.getYear();
    }

    @Override
    public String toString() {
        return name + " | " + profession + " | " + getAge();
    }
}
