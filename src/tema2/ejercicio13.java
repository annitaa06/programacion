import java.util.Scanner;

public class ejercicio13 {
    public static void main(String[] args) {
        // Iniciar nuevo escáner
        Scanner scanner = new Scanner(System.in);

        // pedir datos al usuario
        System.out.print("Escribe las horas: ");
        int horas = scanner.nextInt();
        System.out.print("Escribe los minutos: ");
        int minutos = scanner.nextInt();
        System.out.print("Escribe los segundos: ");
        int segundos = scanner.nextInt();

        // Sumar un segundo
        segundos++;

        //realizar operaciones
        if (segundos == 60) {
            segundos = 0;
            minutos++;
        }


        if (minutos == 60) {
            minutos = 0;
            horas++;
        }


        if (horas == 24) {
            horas = 0;
        }

        //nostrar resultado
        // Formato: %02d:%02d:%02d%n
        // %02d: Número con 2 dígitos (rellena con ceros).
        // %n : Salto de línea.
        System.out.printf("La hora con un segundo más es: %02d:%02d:%02d%n", horas, minutos, segundos);

        // Cerrar el scanner
        scanner.close();
    }
}