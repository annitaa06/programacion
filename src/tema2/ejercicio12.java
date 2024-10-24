import java.util.Scanner;

public class ejercicio12 {
    public static void main(String[] args) {
        // Iniciar nuevo escáner
        Scanner sc = new Scanner(System.in);

        // Pedir datos al usuario
        System.out.println("Escribe 3 números:");

        // Leer los datos
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        // Hacer comparaciones para ordenar los números
        if (num1 >= num2 && num1 >= num3) {
            if (num2 >= num3) {
                System.out.println("El orden es: " + num1 + ", " + num2 + ", " + num3);
            } else {
                System.out.println("El orden es: " + num1 + ", " + num3 + ", " + num2);
            }
        } else if (num2 >= num1 && num2 >= num3) {
            if (num1 >= num3) {
                System.out.println("El orden es: " + num2 + ", " + num1 + ", " + num3);
            } else {
                System.out.println("El orden es: " + num2 + ", " + num3 + ", " + num1);
            }
        } else if (num3 >= num1 && num3 >= num2) {
            if (num1 >= num2) {
                System.out.println("El orden es: " + num3 + ", " + num1 + ", " + num2);
            } else {
                System.out.println("El orden es: " + num3 + ", " + num2 + ", " + num1);
            }
        }

        // Cerrar el escáner (opcional)
        sc.close();
    }
}

