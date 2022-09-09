package hu.petrik.java02ora;

import static java.lang.System.out;
public class Feladat9 {
    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            if ((i % 5 == 0) && (i % 3 == 0)) {
                out.print(i + " ");
            }
        }
    }
}
