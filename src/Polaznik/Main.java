package Polaznik;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Polaznik matija = new Polaznik(26, "Matija", "Matijević");
        Polaznik anna = new Polaznik(25, "Anna", "Anković");
        Polaznik toni = new Polaznik(30, "Toni", "Tonković");

        List<Polaznik> polaznici = new ArrayList<>();
        polaznici.add(matija);
        polaznici.add(anna);
        polaznici.add(toni);

        System.out.println("Polaznici nesortirani:");
        for (Polaznik polaznik : polaznici) {
            System.out.println(polaznik);
        }
        Collections.sort(polaznici);
        System.out.println("\nPolaznici sortirani:");
        for (Polaznik polaznik : polaznici) {
            System.out.println(polaznik);
        }
    }
}
