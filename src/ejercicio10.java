import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {
        double num1;
        double num2;
        double suma, resta, producto, division, resto;

        Scanner ValorU = new Scanner(System.in);
        System.out.println("introduce un numero para hacer operaciones");
        num1=ValorU.nextDouble();
        System.out.println("introduce un numero para hacer operaciones");
        num2=ValorU.nextDouble();

        suma = num1 + num2;
        resta = num1 - num2;
        producto = num1 * num2;
        division = num1/num2;
        resto = num1 % num2;

        System.out.println("su suma es " + suma);
        System.out.println("su resta es " + resta);
        System.out.println("su producto es " + producto);
        System.out.println("su division es " + division);
        System.out.println("su resto es " + resto);




    }
}
