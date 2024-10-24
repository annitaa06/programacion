import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        // pedir datos al usuario
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el primer número: ");
        double num1 = sc.nextDouble();

        System.out.print("Introduce el segundo número: ");
        double num2 = sc.nextDouble();

        System.out.print("Introduce el tercer número: ");
        double num3 = sc.nextDouble();

        // Calcular la media con decimales
        double mediaConDecimales = (num1 + num2 + num3) / 3;

        // Calcular la media sin decimales , el numero se trunca con (int)
        int mediaSinDecimales = (int) mediaConDecimales;

        // Mostrar los resultados
        System.out.println("La media con decimales es: " + mediaConDecimales);
        System.out.println("La media sin decimales es: " + mediaSinDecimales);
    }
}


