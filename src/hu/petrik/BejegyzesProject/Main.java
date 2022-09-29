package hu.petrik.BejegyzesProject;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bejegyzes bejegyzes1 = new Bejegyzes("Jancsi", "fát vágni jó");
        System.out.println(bejegyzes1);
        bejegyzes1.setTartalom("dadsadsadad");
        System.out.println(bejegyzes1);
    }
}
