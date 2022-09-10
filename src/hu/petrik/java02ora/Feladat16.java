package hu.petrik.java02ora;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import static java.lang.System.*;

public class Feladat16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        int[] tomb = new int[5];
        out.println("Adjon meg öt db természetes számot!");
        for (int i = 0; i < tomb.length; i++) {
            out.print((i + 1) + ": ");
            tomb[i] = sc.nextInt();
        }
        out.print("Tömb elemei megadott sorrendben: ");
        for (int i = 0; i < tomb.length; i++) {
            out.print(tomb[i] + " ");
        }
        out.print("\nTömb elemei fordított sorrendben: ");
        for (int i = tomb.length - 1; i >= 0; i--) {
            out.print(tomb[i] + "  ");
        }
        out.println("\n\nMinden második elem: ");
        for (int i = 0; i < tomb.length; i++){
            if (i % 2 != 0){
                out.println((i+1) + ": " + tomb[i]);
            }
        }
        out.print("\nHanyadik elemet írjam ki: ");
        int index = sc.nextInt();
        out.println(index + ". elem: " + (tomb[index-1]));
    }
}
