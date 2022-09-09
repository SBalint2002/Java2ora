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
            } else if (szam > 1000) {
                out.print("Adjon meg egy kisebb számot: ");
            } else {
                return;
            }
            szam = sc.nextDouble();
        } while (szam < 1 || szam > 1000);
        sc.nextLine();

        out.println("A pénz szétosztható a következő módon: ");

        double maradek = szam;

        //ötszáz
        double otszaz = 0;
        if (szam / 500 > 0) {
            otszaz = 1;
            maradek -= 500;
            out.println("Öszázasok: " + (int) otszaz);
        }
        //kétszáz
        double ketszaz = 0;
        if (szam - (otszaz * 500) >= 200) {
            ketszaz = Math.floor(maradek / 200);
            maradek -= ketszaz*200;
            out.println("Kétszázasok: " + (int) ketszaz);
        }

        //száz
        double szaz = 0;
        if (maradek >= 100) {
            szaz = Math.floor(maradek / 100);
            maradek -= szaz*100;
            out.println("Százasok: " + (int) szaz);
        }

        //ötven
        double otven = 0;
        if (maradek >= 50) {
            otven = Math.floor(maradek / 50);
            maradek -= otven*50;
            out.println("Ötvenesek: " + (int) otven);
        }

        //husz
        double husz = 0;
        if (maradek >= 20) {
            husz = Math.floor(maradek / 20);
            maradek -= husz*20;
            out.println("Huszasok: " + (int) husz);
        }

        //tiz
        double tiz = 0;
        if (maradek >= 10) {
            tiz = Math.floor(maradek / 10);
            maradek -= tiz*10;
            out.println("Tizesek: " + (int) tiz);
        }

        //öt
        double ot = 0;
        if (maradek >=5) {
            ot = Math.floor(maradek / 5);
            maradek -= ot*5;
            out.println("Ötösök: " + (int) ot);
        }
    }
}
