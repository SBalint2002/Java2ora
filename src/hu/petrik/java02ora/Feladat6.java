package hu.petrik.java02ora;

import java.util.Scanner;

import static java.lang.System.out;
import static java.lang.System.in;

public class Feladat6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        out.print("Kérem adja meg hány pontja van: ");
        Integer a;
        do {
            a = sc.nextInt();
            if (a > 100) {
                out.println("Ne legyen 100-nál nagyobb!\nKérem adja meg hány pontja van: ");
            }
        } while (a > 100);
        String eredmeny;
        if (a < 43) {
            eredmeny = "elégtelen";
        } else if (a < 57) {
            eredmeny = "elégséges";
        } else if (a < 73) {
            eredmeny = "közepes";
        } else if (a < 88) {
            eredmeny = "jó";
        } else {
            eredmeny = "jeles";
        }
        out.println("A " + a + " annyit jelent mint: " + eredmeny);
    }
}
