import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        int cara;

        Scanner ValorU = new Scanner(System.in);
        System.out.println("introduce un numero de la cara de un dado");
        cara= ValorU.nextInt();

        if (cara > 6 ||  cara < 1) {
            System.out.println("el numero no es correcto");
        } else {
            System.out.println("el numero es correcto");
            System.out.println("la cara opuesta es " + (7 - cara));
        }

    }
}
