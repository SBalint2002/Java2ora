package hu.petrik.java02ora;

import java.util.Scanner;
import static java.lang.System.out;
import static java.lang.System.in;

public class Feladat8 {
    public static void main(String[] args) {
        out.print("Kérem adja meg a tippjét (0 - fej || 1 - írás: ");
        Scanner sc = new Scanner(in);
        int tipp = sc.nextInt();
        int feldobas = (int)Math.random() * 2;
        out.printf("A dobás eredménye %s", (feldobas == 0) ? "fej" : "irás");
        if(tipp == feldobas){
            out.println("Gratulálok nyert!");
        }else{
            out.println("Sajnos most nem nyert, próbálkozzon újra!");
        }
    }
}
