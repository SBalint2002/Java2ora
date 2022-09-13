package hu.petrik.java02ora;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

import static java.lang.System.*;

public class Feladat15 {
    public static void main(String[] args) {
        Random r = new Random();
        int low = -100;
        int high = 100;
        double[] tomb = new double[25];
        for (int i = 0; i < 25; i++){
            tomb[i] = ThreadLocalRandom.current().nextDouble(low, high + 1);
        }
        for (int i = 0; i<25; i++){
            if (i%2==0){
                out.printf("%s: %f\n",(i+1),tomb[i]);
            }
        }
    }
}
