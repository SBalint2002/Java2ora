package hu.petrik.java02ora;

import java.util.Scanner;
import static java.lang.System.out;

public class Feladat1 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        out.print("Kérem adja meg a medence átmérőjét: ");
        double diameter = scr.nextDouble();
        out.print("Kérem adja meg a medence átmérőjét: ");
        double depth = scr.nextDouble();
        double radius = diameter / 2;
        double area = radius * radius * Math.PI;
        double volume = area * depth;
        System.out.printf("A medence térfogata %.3f köbméter", volume);
    }
}
