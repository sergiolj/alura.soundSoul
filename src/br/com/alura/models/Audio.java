package br.com.alura.models;

import java.time.Duration;

public class Audio implements Classifiable {
    private String name;
    private Enum genre;
    private int minutes;
    private int seconds;
    private Duration duration;
    private int timesPlayed = 123;
    private int likes = 100;
    private int classification;

    public Audio(String name, Enum genre, int minutes, int seconds) {
        this.name = name;
        this.genre = genre;
        this.minutes = minutes;
        this.seconds = seconds;
        this.duration = Duration.ofMinutes(minutes).plusSeconds(seconds);
    }

    public void Likes() {
        likes++;
    }

    public boolean Classifiable() {
        return timesPlayed > 100;
    }

    @Override
    public int Classification() {
        if (Classifiable()) {
            int ratio = (((likes * 100) / timesPlayed) / 20);
            System.out.println(ratio);
            switch (ratio) {
                case 1:
                    classification = 1;
                    break;
                case 2:
                    classification = 2;
                    break;
                case 3:
                    classification = 3;
                    break;
                case 4:
                    classification = 4;
                    break;
                case 5:
                    classification = 5;
                    break;
            }
        }
        return classification;
    }
    public void Play () {
        System.out.println("Playing " + name);
        timesPlayed++;
    }

    public String getFormattedDuration() {
        long minutes = duration.toMinutes();
        long seconds = duration.toSeconds() % 60;
        return String.format("%02d:%02d", minutes, seconds);
    }

    public int getTimesPlayed(){
        return timesPlayed;
    }

    @Override
    public String toString() {
        return String.format("Audio: %s | Duration: %s", name, getFormattedDuration());
    }



}

