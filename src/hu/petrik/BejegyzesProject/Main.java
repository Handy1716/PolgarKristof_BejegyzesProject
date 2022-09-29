package hu.petrik.BejegyzesProject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Bejegyzes> bejegyzesek = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        Bejegyzes bejegyzes1 = new Bejegyzes("Jancsi", "fát vágni jó");
        Bejegyzes bejegyzes2 = new Bejegyzes("Peti", "könnyű az iskola táska, ha vannak lányok is a suliban");
        bejegyzesek.add(bejegyzes1);
        bejegyzesek.add(bejegyzes2);
        bejegyzes1.setTartalom("dadsadsadad");
        Bejegyzesek bejegyzesLista = new Bejegyzesek("bejegyzesek.csv");
        System.out.println(bejegyzesek);
    }
}
