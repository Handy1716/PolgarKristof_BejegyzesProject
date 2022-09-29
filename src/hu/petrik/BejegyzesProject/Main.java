package hu.petrik.BejegyzesProject;

import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Bejegyzes> bejegyzesek = new ArrayList<>();


        Scanner sc = new Scanner(System.in);
        Bejegyzes bejegyzes1 = new Bejegyzes("Jancsi", "fát vágni jó");
        Bejegyzes bejegyzes2 = new Bejegyzes("Peti", "könnyű az iskola táska, ha vannak lányok is a suliban");
        bejegyzesek.add(bejegyzes1);
        bejegyzesek.add(bejegyzes2);
        System.out.println(bejegyzesek);

        double n1 = 0.5;
        while(n1 != (int)n1)
        {
            System.out.println("Kérlek add meg hány bejegyzést akarsz készíteni!");
            n1 = sc.nextDouble();
            if (n1 != (int)n1){
                System.out.println("Rossz bemeneti paraméter: Egész számmal add meg!");
            }
        }
        int felhasznaloBejegyzesSzam = (int)n1;
        System.out.println(felhasznaloBejegyzesSzam);

        for (int i = 0; i < felhasznaloBejegyzesSzam; i++) {
            System.out.println("Kérlek add meg kihez köthető a bejegyzés:");
            String bejegyzesEmber = sc.next();
            System.out.println("Kérlek add meg a bejegyzést:");
            String bejegyzesFelhasznalotol = sc.next();
            Bejegyzes ujBejegyzes = new Bejegyzes(bejegyzesEmber, bejegyzesFelhasznalotol);
        }
        //hozzaadas a masik listahoz
        Bejegyzesek bejegyzesLista = new Bejegyzesek("bejegyzesek.csv");
        for (int i = 0; i < bejegyzesLista.ListaReturn().size(); i++) {
            bejegyzesek.add(bejegyzesLista.ListaReturn().get(i));
        }
        //like kiosztos feladat
        for (int i = 0; i < (bejegyzesek.size()*20); i++) {
            bejegyzesek.get(getRandomNumberInRange(0,bejegyzesek.size()-1)).Like();
        }
        //ellenorzes
        for (int i = 0; i < bejegyzesek.size(); i++) {
            System.out.println(bejegyzesek.get(i).getLikeok());
        }
        //masodik elem szovege megvaltoztatasa a listaban
        System.out.println("adj meg egy új tartalmat a második bejegyzéshez");
        String userTartalom = sc.next();
        bejegyzesek.get(1).setTartalom(userTartalom);
        System.out.println(bejegyzesek);
        // 3.Feladat
        //a
        int nepszerusegInt= 0;

        for (int i = 0; i < bejegyzesek.size(); i++) {
            if (nepszerusegInt<bejegyzesek.get(i).getLikeok()) {
                nepszerusegInt= bejegyzesek.get(i).getLikeok();
            }
        }
        System.out.println(nepszerusegInt);
        //b
        boolean tf = false;
        for (int i = 0; i < bejegyzesek.size(); i++) {
            if (bejegyzesek.get(i).getLikeok()>=35) {
                tf = true;
            }
        }
        if (tf) {
            System.out.println("Van olyan bejegyzés ami több mint 35 likeot kapott");
        } else {
            System.out.println("Nincs olyan bejegyzés ami több mint 35 likeot kapott");
        }
        //c
        int szamolo = 0;
        for (int i = 0; i < bejegyzesek.size(); i++) {
            if (bejegyzesek.get(i).getLikeok() <15) {
                szamolo++;
            }
        }
        System.out.printf("Összesen %d olyan bejegyzés van ami kevesebb mint 15 likeot kapott", szamolo);
        //d
       // Collections.sort(bejegyzesek, new Comparator<Bejegyzes>() {
        //
         //   public int compare(Bejegyzes o1, Bejegyzes o2) {
         //       return o2.getLikeok().get(0).compareTo(o1.getLikeok().get(0));
         // }


    }





    private static int getRandomNumberInRange(int min, int max) {

        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }

        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
}
