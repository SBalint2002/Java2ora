package hu.petrik.java02ora;

import java.util.Scanner;

import static java.lang.System.out;
import static java.lang.System.in;

public class Feladat7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        out.print("Kérem adja meg a hónap számát: ");
        int a;
        do {
            a = sc.nextInt();
            if (a > 12){
                out.println("A hónap háma nem haladhatja meg a 12-t.");
                out.print("Kérem adja meg a hónap számát: ");
            }
        }while (a > 12);

        if (a < 4) {
            out.println("Első évszak");
        } else if (a < 7) {
            out.println("Második évszak");
        } else if (a < 10) {
            out.println("Harmadik évszak");
        } else {
            out.println("Negyedik évszak");
        }
    }
}
