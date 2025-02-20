package colecciones.gimnasio;

import java.util.Scanner;

public class MainGym {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Gimnasio gimnasio = new Gimnasio();
        boolean salir = false;

        while (!salir){
            System.out.println("BIENVENIDO AL GIMNASIO, que quieres hacer?");
            System.out.println("1. AGREGAR usuario ");
            System.out.println("2. ELIMINAR usuario");
            System.out.println("3. MOSTRAR usuario");
            System.out.println("4. MODIFICAR usuario");
            System.out.println("5. salir");

            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.print(" DNI: ");
                    String dni = scanner.nextLine();
                    System.out.print(" Nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print(" Edad: ");
                    int edad = scanner.nextInt();
                    gimnasio.agregarUsuario(dni, nombre, edad);
                    break;
                case 2:
                    System.out.print("DNI: ");
                    dni = scanner.nextLine();
                    gimnasio.eliminarUsuario(dni);
                    break;
                case 3:
                    System.out.print("DNI: ");
                    dni = scanner.nextLine();
                    gimnasio.mostrarUsuario(dni);
                    break;
                case 4:
                    System.out.print("DNI: ");
                    dni = scanner.nextLine();
                    System.out.print("Nuevo nombre: ");
                    String nuevoNombre = scanner.nextLine();
                    System.out.print("Nueva edad: ");
                    int nuevaEdad = scanner.nextInt();
                    gimnasio.modificarUsuario(dni, nuevoNombre, nuevaEdad);
                    break;
                case 5:
                    salir = true;
                    break;
                default:
                    System.out.println(" Opción no válida. Intenta de nuevo.");
            }
        }
    }
}
