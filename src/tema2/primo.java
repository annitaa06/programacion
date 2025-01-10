package tema2;


    import java.util.Scanner;

    public class primo {

        // Método para verificar si un número es primo
        public static boolean esPrimo(int numero) {
            if (numero <= 1) {
                return false; // Los números menores o iguales a 1 no son primos
            }
            for (int i = 2; i < numero; i++) {
                if (numero % i == 0) {
                    return false; // Si tiene divisores, no es primo
                }
            }
            return true; // Si no tiene divisores, es primo
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Pedir al usuario que ingrese un número
            System.out.print("Introduce un número para verificar si es primo: ");
            int numero = scanner.nextInt();

            // Verificar si el número es primo y mostrar el resultado
            if (esPrimo(numero)) {
                System.out.println(numero + " es un número primo.");
            } else {
                System.out.println(numero + " no es un número primo.");
            }

            scanner.close();
        }
    }
