import java.util.Scanner;

public class ejercicio11 {
    public static void main(String[] args) {
        double num1;



        Scanner ValorU = new Scanner(System.in);
        System.out.println("introduce un numero para saber si es bisiesto");
        num1 = ValorU.nextDouble();

        if (num1 % 4 == 0) {
            System.out.println("es un año bisiesto");
        }
        else {
            System.out.println("no es un año bisiesto");
        }

    }
}
