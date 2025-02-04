package br.com.alura.models.pod;

import java.time.LocalDate;

public class Guest extends Participants {
    public Guest(String name, LocalDate dateOfBirth, String profession) {
        super(name, dateOfBirth, profession);
    }
}
