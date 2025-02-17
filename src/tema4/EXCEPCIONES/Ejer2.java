package EXCEPCIONES;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejer2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("INTRODUCE DOS NUMEROS PARA DIVIDIRLOS ENTRE ELLOS");

        try {
            System.out.println("INTRODUCE NUM 1");
            int num1 = scanner.nextInt();
            System.out.println("INTRODUCE NUM 2");
            int num2 = scanner.nextInt();
            System.out.println(num1/num2);
        }
        catch (ArithmeticException ex1.getMessage){
            System.out.println(ex1);
        }
        catch (InputMismatchException ex2.getMessage){
            System.out.println(ex2);
        }


    }
}
