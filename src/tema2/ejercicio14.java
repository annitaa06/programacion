import java.util.Scanner;

public class ejercicio14 {
    public static void main(String[] args) {
        //iniciar nuevo scaner
        Scanner scanner = new Scanner(System.in);

        // pedir datos y leerlos
        System.out.print("Introduce las  personas ");
        int Personas = scanner.nextInt();


        System.out.print("Introduce los días: ");
        int Dias = scanner.nextInt();

        // definir lo que vale la variable
        double tarifa = 15.0;

        // hacer operaciones
        double precioTotal = tarifa * Dias * Personas;

        // descontar
        if (Personas > 5 && Dias >= 7) {
            precioTotal *= 0.75; // Aplicar un 25% de descuento
        }

        // Mostrar resultado
        System.out.printf("El precio total de la estancia es: "+ precioTotal +"€");

        // Cerrar el scanner
        scanner.close();
    }
}
