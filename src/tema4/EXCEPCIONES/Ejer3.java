package EXCEPCIONES;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Vector;

public class Ejer3 {
    public static void main(String[] args) {
        System.out.println("INTRODUCE DOBLES");
        Scanner sc = new Scanner(System.in);
       double[] Array = new double[5];

        for (int i = 0; i < Array.length; i++) {
            try {
                double num = sc.nextDouble();
               Array[i] = num;
                System.out.println(Array[i]);
            }
            catch (InputMismatchException ex){
                System.out.println(ex);
                sc.next();
            }
        }



    }
}
