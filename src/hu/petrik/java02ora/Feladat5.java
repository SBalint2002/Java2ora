package hu.petrik.java02ora;

import java.util.Scanner;
import static java.lang.System.out;
import static java.lang.System.in;
public class Feladat5 {
    public static void main(String[] args) {
        Scanner src = new Scanner(in);
        out.print("Kérem adja meg a téglalap 'a' oldalát: ");
        double a = src.nextDouble();
        src.nextLine();
        out.print("Kérem adja meg a téglalap 'b' oldalát: ");
        double b = Double.parseDouble(src.nextLine().replace(",", "."));
        out.print("Kérem adja meg, hogy mit szeretne kiszámítani (K: kerület, T: terület: ");
        String muvelet = src.nextLine();
        if (muvelet.equals("K")) {
            double kerulet = 2 * (a + b);
            out.printf("A téglalap kerülete %.2f cm\n", kerulet);
        } else if (muvelet.equals("T")) {
            double terulet = a * b;
            out.printf("A területe kerülete %.2f cm\n", terulet);
        } else {
            out.println("Hibás műveletet adott meg!");
        }

        if (a == b){
            out.println("A megadott téglalap egy négyzet");
        }
    }
}
