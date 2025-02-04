package br.com.alura.models.pod;

import br.com.alura.util.Genre;

import java.time.LocalDate;

public class TestPod {
    public static void main(String[] args) {
        Podcast newPodcast = new Podcast("O Assunto", null, "Notícias em destaque no momento.");
        Host host = new Host("Natuza Nery", LocalDate.of(1977,4,28),"Journalist");
        newPodcast.setMainHost(host);

        Guest guest = new Guest("Jose Alexandre Scheinkman", LocalDate.of(1948,1,11), "Economist");
        System.out.println(host);
        System.out.println(newPodcast);
        System.out.println(guest);
        Interview newEpisode = new Interview("A guerra comercial de Trump", Genre.INTERVIEW, 27,39, newPodcast, 1428);

        newEpisode.setSubject("A partir desta terça-feira (4), começaria a valer o ‘tarifaço’ imposto por Donald Trump " +
                "a dois de seus principais parceiros comerciais: Canadá e México. Mas, por enquanto, a imposição das " +
                "tarifas de 25% aos produtos canadenses e mexicanos ficou apenas no discurso.");
        newEpisode.addHost(host);
        newEpisode.addGuest(guest);

        System.out.println(newEpisode);
    }

}
