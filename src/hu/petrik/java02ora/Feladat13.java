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
        do {
            if (gondoltszam > tipp){
                out.printf("A gondolt szám nagyobb!\n");
            } else if (gondoltszam < tipp) {
                out.printf("A gondolt szám kisebb!\n");
            }
            out.print("Adjon meg egy pozitív egész számot 1 és 100 között: ");
            tipp = sc.nextInt();
        }while(gondoltszam != tipp);
        out.println("Gratulálok, eltalálta!");
    }
}
