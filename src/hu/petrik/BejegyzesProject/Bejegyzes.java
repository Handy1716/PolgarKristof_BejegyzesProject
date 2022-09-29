package hu.petrik.BejegyzesProject;

import java.time.LocalDateTime;

public class Bejegyzes {
    public Bejegyzes(String szerzo, String tartalom) {
        this.szerzo = szerzo;
        this.tartalom = tartalom;
        this.likeok = 0;
        this.letrejott = LocalDateTime.now();
        this.szerkesztve = LocalDateTime.now();
    }

    public String getSzerzo() {
        return szerzo;
    }

    public String getTartalom() {
        return tartalom;
    }

    public int getLikeok() {
        return likeok;
    }

    public LocalDateTime getLetrejott() {
        return letrejott;
    }

    public LocalDateTime getSzerkesztve() {
        return szerkesztve;
    }

    private String szerzo;

    public void setTartalom(String tartalom) {
        this.szerkesztve = LocalDateTime.now();
        this.tartalom = tartalom;
    }

    public void Like(){
        this.likeok++;
    }

    private String tartalom;
    private int likeok;
    private LocalDateTime letrejott;
    private LocalDateTime szerkesztve;

    @Override
    public String toString() {
        return  szerzo + " - " + likeok + " - " +letrejott + '\n' +
                "Szerkeszve:" +szerkesztve + '\n' +
                tartalom;
    }
}
