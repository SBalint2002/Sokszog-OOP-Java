package hu.petrik.sokszogoop;

import java.util.ArrayList;

public class Sokszogek {
    private static ArrayList<Sokszog> lista;

    public Sokszogek() {
        int r = (int) (Math.random() * (2 * 4) + 1) - 1;
        if (r == 1) {
            lista.add(new Negyzet());
        } else if (r == 2) {
            lista.add(new Paralelogramma());
        } else if (r == 3) {
            lista.add(new Teglalap());
        } else {
            lista.add(new Haromszog());
        }
    }

    public double osszTerulet() {
        double terulet = 0;
        for (Sokszog sokszog : lista) {
            terulet += sokszog.getTerulet();
        }
        return terulet;
    }

    public double osszKerulet() {
        double kerulet = 0;
        for (Sokszog sokszog : lista) {
            kerulet += sokszog.getTerulet();
        }
        return kerulet;
    }

    public double maxTerulet() {
        double terulet = 0;
        for (Sokszog sokszog : lista) {
            if (sokszog.getTerulet() > terulet) {
                terulet = sokszog.getTerulet();
            }
        }
        return terulet;
    }

    public static String kiir() {
        return lista.toString();
    }

    @Override
    public String toString() {
        return String.format("Lista: Összkerület = %-10.3f, Összterület = %-10.3f, Max Terület: %-10.3f", osszKerulet(), osszTerulet(), maxTerulet());
    }
}
