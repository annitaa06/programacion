package bucles;

import java.util.Scanner;

public class ejercicio30 {
    public static void main(String[] args) {
        int num1;
        int num2;
        String operador;
        boolean continuar = true;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Introduce un numero ");
            num1 = sc.nextInt();
            System.out.println("Introduce un operador (+, -, *, /, %, Exit para salir)");
            operador = sc.next();

            // Verificamos si el operador es "Exit"
            if (operador.equals("Exit")) {
                continuar = false; // Sale del bucle
            } else {
                // Solo pedimos el segundo número si no es "Exit"
                System.out.println("Introduce otro numero ");
                num2 = sc.nextInt();

                // Realizar las operaciones
                if (operador.equals("+")) {
                    System.out.println(num1 + num2);
                } else if (operador.equals("-")) {
                    System.out.println(num1 - num2);
                } else if (operador.equals("*")) {
                    System.out.println(num1 * num2);
                } else if (operador.equals("/")) {
                    System.out.println("Resultado: " + (num1 / num2));
                } else if (operador.equals("%")) {
                    System.out.println(num1 % num2);
                }
            }

        } while (continuar);
    }
}