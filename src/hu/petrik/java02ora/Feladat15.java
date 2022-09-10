package hu.petrik.java02ora;

import java.util.Random;
import java.util.Scanner;
import static java.lang.System.*;

public class Feladat15 {
    public static void main(String[] args) {
        Random r = new Random();
        int low = -100;
        int high = 100;
        double[] tomb = new double[25];
        for (int i = 0; i < 25; i++){
            tomb[i] = r.nextDouble(high-low)+low;
        }
        for (int i = 0; i<25; i++){
            if (i%2==0){
                out.printf("%s: %f\n",(i+1),tomb[i]);
            }
        }
    }
}
