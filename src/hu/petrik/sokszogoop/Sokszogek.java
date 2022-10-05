package hu.petrik.sokszogoop;

import java.util.ArrayList;
import java.util.Random;

public class Sokszogek {
    private static ArrayList<Sokszog> lista = new ArrayList<>();

    public Sokszogek() {
        Random r = new Random();
        int szam = r.nextInt(4) + 1;
        if (szam == 1) {
            lista.add(new Negyzet());
        } else if (szam == 2) {
            lista.add(new Paralelogramma());
        } else if (szam == 3) {
            lista.add(new Teglalap());
        } else {
            lista.add(new Haromszog());
        }
    }

    public static double osszTerulet() {
        double terulet = 0;
        for (Sokszog sokszog : lista) {
            terulet += sokszog.getTerulet();
        }
        return terulet;
    }

    public static double osszKerulet() {
        double kerulet = 0;
        for (Sokszog sokszog : lista) {
            kerulet += sokszog.getTerulet();
        }
        return kerulet;
    }

    public static double maxTerulet() {
        double terulet = 0;
        for (Sokszog sokszog : lista) {
            if (sokszog.getTerulet() > terulet) {
                terulet = sokszog.getTerulet();
            }
        }
        return terulet;
    }

    public static String kiir() {
        return lista.get(lista.size() - 1).toString();
    }

    public static String listaAdatok() {
        return String.format("Lista: Összkerület = %-10.3f, Összterület = %-10.3f, Max Terület: %-10.3f", osszKerulet(), osszTerulet(), maxTerulet());
    }

    @Override
    public String toString() {
        return String.format("Lista: Összkerület = %-10.3f, Összterület = %-10.3f, Max Terület: %-10.3f", osszKerulet(), osszTerulet(), maxTerulet());
    }
}
