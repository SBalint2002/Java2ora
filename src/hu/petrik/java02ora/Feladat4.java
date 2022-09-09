package hu.petrik.java02ora;

import java.util.Scanner;
import static java.lang.System.out;
import static java.lang.System.in;

public class Feladat4 {
    public static void main(String[] args) {
        Scanner src = new Scanner(in);
        out.print("Kérem adja meg a háromszög 'a' oldalát: ");
        double a = src.nextDouble();
        out.print("Kérem adja meg a háromszög 'b' oldalát: ");
        double b = src.nextDouble();
        out.print("Kérem adja meg a háromszög 'c' oldalát: ");
        double c = src.nextDouble();
        if ((a + b > c) && (b + c > a) && (a + c > b)){
            double k = a + b + c;
            out.println("A háromszög kerülete " + k);
        } else {
            out.println("Hibás érték");
        }
    }
}

