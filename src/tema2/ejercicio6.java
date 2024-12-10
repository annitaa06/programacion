package tema2;

import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {

        // iniciar el escáner
        Scanner sc = new Scanner(System.in);

        // pedir datos al usuario
        System.out.println("Escribe un número para saber si es positivo, negativo o cero:");
        double num1 = sc.nextDouble();

        // Condicional para verificar si el número es negativo, positivo o cero
        if (num1 < 0) {
            System.out.println("El número es negativo");
        } else if (num1 == 0) {
            System.out.println("El número es igual a 0");
        } else {
            System.out.println("El número es positivo");
        }
    }
}

