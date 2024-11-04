package bucles;

import java.util.Scanner;

public class ejercicio20 {
    public static void main(String[] args) {

        //iniciar nuevo scanner
        Scanner sc = new Scanner(System.in);
        //pedir datos
        System.out.println("introduce un numero entero");
        int A = sc.nextInt();

        System.out.println("introduce un numero entero");
        int B = sc.nextInt();

        if (B > A) {
            for (int i = A + 1; i < B; i++) {
                if (i % 2 != 0) { // si el número es impar
                    System.out.println( i);
                }
            }
        } else {
            System.out.println("El número B debe ser mayor que el número A.");
        }

        sc.close();
    }
}




