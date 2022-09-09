package hu.petrik.java02ora;

import java.util.Scanner;
import static java.lang.System.out;
import static java.lang.System.in;

public class Feladat3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        out.print("Adjon meg egy pozitív valós számot: ");
        double szam = sc.nextDouble();
        if (szam < 0){
            out.println("Nem jó szám!");
        }
        sc.nextLine();
        int elotte;
        int utana;
        int kozelebb;
        if (szam % 1 == 0) {  //egész szám
            elotte = ((int) szam - 1);
            utana = ((int) szam + 1);
            kozelebb = (int)szam;
        } else {
            elotte = (int) Math.floor(szam);
            utana = (int) Math.ceil(szam);
            kozelebb = (int) Math.round(szam);
        }

        out.printf("A megadott szám a %d és a %d egész számok közül a %d számhoz van közelebb.", elotte, utana, kozelebb);
    }
}

