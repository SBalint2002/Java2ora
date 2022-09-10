package hu.petrik.java02ora;

import java.util.Random;
import java.util.Scanner;
import static java.lang.System.*;
public class Feladat17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        Random r = new Random();
        int low = -100;
        int high = 100;
        double[] tomb = new double[10];
        double[] tomb2 = new double[10];
        double[] tomb3 = new double[10];
        for (int i = 0; i < 10; i++){
            tomb[i] = r.nextDouble(high-low)+low;
            tomb2[i] = r.nextDouble(high-low)+low;
            out.printf("%d. szám: %f + %f = %f\n",(i+1),tomb[i],tomb2[i],(tomb[i]+tomb2[i]));
            tomb3[i] = tomb[i]+tomb2[i];
        }
        out.println("\nÖsszegek hozzáadva a 3-ik tömbhöz!");
    }
}
