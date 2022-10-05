package hu.petrik.sokszogoop;

import java.sql.SQLOutput;
import java.util.ArrayList;

import static hu.petrik.sokszogoop.Sokszogek.kiir;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Haromszog h = new Haromszog();
            System.out.println(h);
        }
        for (int i = 0; i < 5; i++) {
            double a = Math.random() * 10 + 5;
            double b = Math.random() * 10 + 5;
            System.out.println(new Teglalap(a, b));
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(new Paralelogramma());
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(new Negyzet());
        }
        System.out.println("Lista elemek:");
        try{
            for (int i = 0; i < 5; i++) {
                System.out.println(new Sokszogek());
            }
        }catch(NullPointerException e)
        {
            System.out.println("NullPointerException Caught");
        }
        System.out.println("Lista adatok:");
        //String sokszogek = kiir();
        //System.out.println(sokszogek);

    }
}
