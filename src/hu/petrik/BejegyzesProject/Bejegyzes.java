package hu.petrik.BejegyzesProject;

import java.time.LocalDateTime;

public class Bejegyzes {
    public Bejegyzes(String szerzo, String tartalom) {
        this.szerzo = szerzo;
        this.tartalom = tartalom;
        this.likeok = 0;
        this.letrejott = LocalDateTime.now();
        this.szerkesztve = LocalDateTime.now();
        this.modositva = false;
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
        this.modositva = true;
        this.tartalom = tartalom;
    }

    public boolean isModositva() {
        return modositva;
    }

    public void Like() {
        this.likeok++;
    }

    private String tartalom;
    private int likeok;
    private LocalDateTime letrejott;
    private LocalDateTime szerkesztve;
    private boolean modositva;

    @Override
    public String toString() {
        if (modositva == true) {
            return szerzo + " - " + likeok + " - " + letrejott + '\n' +
                    "Szerkeszve:" + szerkesztve + '\n' +
                    tartalom + "\n";
        } else {
            return szerzo + " - " + likeok + " - " + letrejott + '\n' +
                    tartalom + "\n";

        }


    }
}
