package hu.petrik.java02ora;

import java.util.Scanner;

import static java.lang.System.out;
import static java.lang.System.in;

public class Feladat11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        out.print("Adjon meg egy N pozitív egész számot: ");
        boolean helyes = false;
        double n;
        do {
            n = sc.nextDouble();
            if (n % 1 != 0) {
                out.println("A szám nem egész!");
                out.print("Adjon meg egy N pozitív egész számot: ");
            } else if (n < 0) {
                out.println("A szám nem pozitív");
                out.print("Adjon meg egy N pozitív egész számot: ");
            } else {
                helyes = true;
            }
        } while (helyes = false);
        int osszeg = 0;
        for (var i = 0; i < n; i++) {
            if (i <= n && i%2==1){
                osszeg+= i;
            }
        }
        out.println("Az N-nél nem nagyobb pozitív páratlan számok összege: " + osszeg);
    }
}
