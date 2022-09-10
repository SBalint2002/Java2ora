package hu.petrik.java02ora;

import java.util.Scanner;

import static java.lang.System.*;

public class Feladat14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        out.print("Írjon be egy szöveget: ");
        String szoveg = sc.next();
        out.print("Mit szeretne csinálni a szöveggel?\n" +
                "a, Nagybetűssé alakítani\n" +
                "b, Kisbetűssé alakítani\n" +
                "c, Lekérdezni a hosszát\n" +
                "d, Összehasonlítani egy másik szöveggel\n" +
                "e, Egy részét kiiratni a szövegnek (a és b intervallum megadásával)\n" +
                "f, Kilépni\n" +
                "Válasz: ");
        String valasz = sc.next();
        while (valasz != "f") {
            if (valasz.equals("a")) {
                String nagy = szoveg.toUpperCase();
                out.printf("Nagybetűs szöveg: %s", nagy);
            } else if (valasz.equals("b")) {
                String kicsi = szoveg.toLowerCase();
                out.printf("Kisbetűs szöveg: %s", kicsi);
            } else if (valasz.equals("c")) {
                int hossz = szoveg.length();
                out.printf("Szöveg hossza: %d", hossz);
            } else if (valasz.equals("d")) {
                //hosszuk összehasonlítása

                out.print("Adja meg a másik szót: ");
                int elso = szoveg.length();
                String masodikszoveg = sc.next();
                int masodik = masodikszoveg.length();
                if (elso > masodik){
                    int kulombseg = elso - masodik;
                    out.printf("%s hosszabb mint a/az %s ennyivel: %d\n",szoveg,masodikszoveg,kulombseg);
                } else if (masodik > elso) {
                    int kulombseg = masodik - elso;
                    out.printf("%s hosszabb mint a/az %s ennyivel: %d\n",masodikszoveg,szoveg,kulombseg);
                }else {
                    out.printf("Ugyan olyan hosszúak. Hosszúságuk: %d\n",elso);
                }
            } else if (valasz.equals("e")) {
                out.print("Adja meg az intervallum első számát: ");
                int a = sc.nextInt();
                out.print("Adja meg az intervallum második számát: ");
                int b = sc.nextInt();
                String bontott = szoveg.substring(a, b);
                out.printf("A bontott szöveg: %s", bontott);
            } else if (valasz.equals("f")) {
                out.println("Kilépés...");
                break;
            } else {
                out.print("Csak a-f betűket írjon\nVálasz: ");
            }
            out.print("\nMi egyebet szeretne csinálni: ");
            valasz = sc.next();
        }
    }
}
