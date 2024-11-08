import java.util.Random;
import java.util.Scanner;

public class ejercicio29 {
    public static void main(String[] args) {
        int valorU = 0;
        int contador = 0;

        System.out.println("Introduce un numero entre 0 y 100 para saber si has ganado. Se te indicará si el número es mayor o menor.");

        // Generar el número aleatorio entre 0 y 100
        Random random = new Random();
        int randomInt = random.nextInt(101);


        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Introduce un número: ");
            valorU = sc.nextInt();

            if (valorU == randomInt) {
                System.out.println("Has ganado");
            } else if (valorU < randomInt) {
                System.out.println("El número es mayor que " + valorU);
            } else {
                System.out.println("El número es menor que " + valorU);
            }

            contador++;
        } while (valorU != randomInt); // El bucle se repite hasta que el usuario acierte

    }
}
