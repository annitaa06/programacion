import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        // Crear un Scanner para leer
        Scanner sc = new Scanner(System.in);

        // escribir por la terminal
        System.out.print("Introduce la base del rectángulo: ");
        double base = sc.nextDouble();

        System.out.print("Introduce la altura del rectángulo: ");
        double altura = sc.nextDouble();

        // Calcular la superficie y el perímetro
        double superficie = base * altura;
        double perimetro = 2 * (base + altura);

        // Mostrar los resultados
        System.out.println("La superficie del rectangulo es: " + superficie);
        System.out.println("El perimetro del rectangulo es: " + perimetro);
    }
}

