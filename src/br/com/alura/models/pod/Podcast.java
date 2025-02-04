package br.com.alura.models.pod;

import br.com.alura.models.Classifiable;

public class Podcast implements Classifiable {
    private Host mainHost;
    private String description;
    private final String name;

    public Podcast(String name, Host mainHost, String description) {
        this.name = name;
        this.mainHost = mainHost;
        this.description = description;
    }
    public void setMainHost(Host mainHost) {
        this.mainHost = mainHost;
    }
    public Host getMainHost() {
        return mainHost;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Podcast["+name+"] [" + description + " ]";
    }

    @Override
    public int Classification() {
        return 0;
    }
}
