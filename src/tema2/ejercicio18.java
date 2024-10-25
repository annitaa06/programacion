import java.util.Scanner;

public class ejercicio18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número para la raiz cuadrada");
        double valorU = scanner.nextDouble();

        if (valorU < 0) {
            System.out.println("no se puede calcular la raíz cuadrada de un número negativo.");
        } else {
            double raiz = Math.sqrt(valorU);
            System.out.println("La raíz cuadrada de " + valorU + " es: " + raiz);
        }

        scanner.close();
    }
}

