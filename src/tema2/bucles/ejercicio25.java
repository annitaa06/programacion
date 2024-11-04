package bucles;
import java.util.Scanner;
public class ejercicio25 {
    public static void main(String[] args) {


    int Factorial = 1;
    int Numusu = 0;

        System.out.println("Introduce un numero para calcular el factorial");
    Scanner scanner = new Scanner(System.in);

    Numusu = scanner.nextInt();

        if (Numusu < 0){

        System.out.println("Introduce un número válido");

    }
         else {

        while (Numusu > 0){

            Factorial = Factorial * Numusu;

            Numusu = Numusu - 1;
        }

    }

        System.out.println("El factorial es: " + Factorial);


}
    }
