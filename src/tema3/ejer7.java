package tema3;

import java.util.Scanner;

public class ejer7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        System.out.println("Introduce numeros enteros positivos (0 para salir):");
        System.out.print("Numero: ");
        numero = scanner.nextInt();

        while (numero != 0) {
            if (numero < 0) {
                System.out.println("Por favor, introduce un número positivo.");
            } else if (esPrimo(numero)) {
                System.out.println(numero + " es un número primo.");
            } else {
                System.out.println(numero + " no es un número primo.");
            }

            System.out.print("Número: ");
            numero = scanner.nextInt();
        }

        System.out.println("Fin del programa.");
        scanner.close();
    }

    public static boolean esPrimo(int numero) {
        if (numero < 2) {
            return false;
        }
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}

