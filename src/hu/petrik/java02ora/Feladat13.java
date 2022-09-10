package hu.petrik.java02ora;

import java.util.Scanner;

import static java.lang.System.out;
import static java.lang.System.in;

public class Feladat13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        int gondoltszam = (int)(Math.random() * 100) + 1;
        out.print("Adjon meg egy pozitív egész számot 1 és 100 között: ");
        int tipp = sc.nextInt();
        int kulombseg;
        do {
            if (gondoltszam > tipp){
                kulombseg = gondoltszam-tipp;
                out.printf("A gondolt szám %s-al nagyobb!\n",kulombseg);
            } else if (gondoltszam < tipp) {
                kulombseg = tipp - gondoltszam;
                out.printf("A gondolt szám %s-el kisebb!\n",kulombseg);
            }
            out.print("Adjon meg egy pozitív egész számot 1 és 100 között: ");
            tipp = sc.nextInt();
        }while(gondoltszam != tipp);
        out.println("Gratulálok, eltalálta!");
    }
}
