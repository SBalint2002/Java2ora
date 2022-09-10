package hu.petrik.java02ora;

import java.util.Scanner;

import static java.lang.System.out;
import static java.lang.System.in;

public class Feladat12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        out.print("Adjon meg egy összeget 1 és 1000 Ft között: ");
        double szam = Math.floor(sc.nextDouble());
        do {
            if (szam < 1) {
                out.print("Adjon meg egy nagyobb számot: ");
                szam = sc.nextDouble();
            } else if (szam > 1000) {
                out.print("Adjon meg egy kisebb számot: ");
                szam = sc.nextDouble();
            }
        } while (szam < 1 || szam > 1000);

        out.println("A pénz szétosztható a következő módon: ");

        double maradek = szam;

        //kétszáz
        double ketszaz;
        if (maradek >= 200) {
            ketszaz = Math.floor(maradek / 200);
            maradek -= (ketszaz * 200);
            out.printf("\nKétszázasok: %.0f",ketszaz);
        }

        //száz
        double szaz;
        if (maradek >= 100) {
            szaz = Math.floor(maradek / 100);
            maradek -= (szaz * 100);
            out.printf("\nSzázasok: %.0f",szaz);
        }

        //ötven
        double otven;
        if (maradek >= 50) {
            otven = Math.floor(maradek / 50);
            maradek -= (otven * 50);
            out.printf("\nÖtvenesek: %.0f",otven);
        }

        //husz
        double husz;
        if (maradek >= 20) {
            husz = Math.floor(maradek / 20);
            maradek -= (husz * 20);
            out.printf("\nHuszasok: %.0f",husz);
        }

        //tiz
        double tiz;
        if (maradek >= 10) {
            tiz = Math.floor(maradek / 10);
            maradek -= (tiz * 10);
            out.printf("\nTizesek: %.0f",tiz);
        }

        //öt
        double ot;
        if (maradek >= 5) {
            ot = Math.floor(maradek / 5);
            maradek -= (ot * 5);
            out.printf("\nÖtösök: %.0f",ot);
        }

        out.printf("\nA maradék: %.0f",maradek);
    }
}
