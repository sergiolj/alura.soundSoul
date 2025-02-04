package br.com.alura.models.pod;
import br.com.alura.models.Audio;
import br.com.alura.models.Classifiable;

import java.util.ArrayList;

public class Interview extends Audio {
    private Podcast podcast;
    private int episode;
    private ArrayList<Guest> guests;
    private ArrayList<Host> hosts;
    private String subject;


    public Interview(String name, Enum genre, int minutes, int seconds, Podcast podcast, int episode) {
        super(name, genre, minutes, seconds);
        this.podcast = podcast;
        this.episode = episode;
        this.guests = new ArrayList<>();
        this.hosts = new ArrayList<>();
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void addGuest(Guest guest) {
        this.guests.add(guest);
    }

    public void addHost(Host host) {
        this.hosts.add(host);
    }

    @Override
    public String toString() {
        return String.format("""
                Podcast: %s
                Episode: %d
                Subject: %s
                Guests: %s
                Hosts: %s
                """, podcast, episode, subject, hosts, guests);
    }
    @Override
    public int Classification(){
        if(getTimesPlayed() > 100){
            return 5;
        }
        return 0;
    }
}
