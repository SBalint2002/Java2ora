package hu.petrik.java02ora;

import java.util.Scanner;
import static java.lang.System.out;

public class Feladat2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        out.print("Kérem adja meg a terület szélességét méterben: ");
        double szelesseg = sc.nextDouble();
        sc.nextLine();
        out.print("Kérem adja meg a terület magasságát méterben: ");
        double magassag = sc.nextDouble();
        sc.nextLine();

        double terulet = (szelesseg * magassag)* 1.1;
        double szam = Math.ceil(terulet/0.04);
        out.printf("Ennyi csempe kell: %.0f", szam);


    }
}

