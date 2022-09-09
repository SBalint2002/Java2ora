package hu.petrik.java02ora;

import java.util.Scanner;
import static java.lang.System.out;
import static java.lang.System.in;
public class Feladat10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        out.println("Adjon meg egész számokat amíg nem haladja meg a 100-at");
        int osszeg = 0;
        int paros = 0;
        int paratlan = 0;
        int szamlalo= 0;
        while (osszeg <= 100){
            szamlalo++;
            out.print(szamlalo + ". szám: ");
            int szam = sc.nextInt();
            osszeg += szam;
            out.println("Összeg eddig: " + osszeg);
            if (szam % 2 == 0){
                paros++;
            }else {
                paratlan++;
            }
        }
        out.println("Az összeg meghaladta a 100-at.\nAz összeg: " + osszeg);
        out.printf("A megadott számok közül %d db páros és %d páratlan szám volt", paros, paratlan);
    }
}
