package ppo3.biblioteca;

import java.util.Scanner;

public class MainBiblio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            // mostrar menú
            System.out.println("\nElige una ficha:");
            System.out.println("1. Libro");
            System.out.println("2. Revista");
            System.out.println("3. DVD");
            System.out.println("4. Salir");
            System.out.print("Opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1: // libro
                    System.out.print("Introduce el número del libro: ");
                    int numLibro = scanner.nextInt();
                    scanner.nextLine(); // limpiar buffer
                    System.out.print("Introduce el título del libro: ");
                    String tituloLibro = scanner.nextLine();
                    System.out.print("Introduce el autor: ");
                    String autor = scanner.nextLine();
                    System.out.print("Introduce la editorial: ");
                    String editorial = scanner.nextLine();
                    Libro libro = new Libro(numLibro, tituloLibro, autor, editorial);
                    System.out.println(libro.toString());
                    break;

                case 2: // revista
                    System.out.print("Introduce el número de la revista: ");
                    int numRevista = scanner.nextInt();
                    scanner.nextLine(); // limpiar buffer
                    System.out.print("Introduce el título de la revista: ");
                    String tituloRevista = scanner.nextLine();
                    System.out.print("Introduce el número de publicación: ");
                    int numPublicacion = scanner.nextInt();
                    System.out.print("Introduce el año de la revista: ");
                    int añoRevista = scanner.nextInt();
                    Revista revista = new Revista(numRevista, tituloRevista, numPublicacion, añoRevista);
                    System.out.println(revista.toString());
                    break;

                case 3: // DVD
                    System.out.print("Introduce el número del DVD: ");
                    int numDVD = scanner.nextInt();
                    scanner.nextLine(); // limpiar buffer
                    System.out.print("Introduce el título del DVD: ");
                    String tituloDVD = scanner.nextLine();
                    System.out.print("Introduce el director: ");
                    String director = scanner.nextLine();
                    System.out.print("Introduce el año del DVD: ");
                    int añoDVD = scanner.nextInt();
                    scanner.nextLine(); // limpiar buffer
                    System.out.print("Introduce el tipo (animación, acción, etc.): ");
                    String tipo = scanner.nextLine();
                    DVD dvd = new DVD(numDVD, tituloDVD, director, añoDVD, tipo);
                    System.out.println(dvd.toString());
                    break;

                case 4: // salir
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción no válida, intenta de nuevo.");
            }

        } while (opcion != 4);

        scanner.close();
    }
}
