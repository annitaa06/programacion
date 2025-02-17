package EXCEPCIONES;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejer1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("INTRODUCE UN NÚMERO");

        try {
            int numusu = scanner.nextInt();
            System.out.println();
        }
        catch (InputMismatchException ex){
            System.out.println(ex.getMessage);
        }


    }
}
