package tema4.Persona;

import java.util.Scanner;

public class MainPersona {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce los datos de la persona 1");
        System.out.println("DNI: ");
        String dni1 = sc.nextLine();
        System.out.println("nombre: ");
        String nombre1 = sc.nextLine();
        System.out.println("apellidos: ");
        String apellidos1 = sc.nextLine();
        System.out.println("edad: ");
        int edad1 = sc.nextInt();
        sc.nextLine(); // Limpiar el buffer después de nextInt()

        // Crear la 1ª persona
        Persona persona1 = new Persona(dni1, nombre1, apellidos1, edad1);

        System.out.println("Introduce los datos de la persona 2");
        System.out.println("DNI: ");
        String dni2 = sc.nextLine();
        System.out.println("nombre: ");
        String nombre2 = sc.nextLine();
        System.out.println("apellidos: ");
        String apellidos2 = sc.nextLine();
        System.out.println("edad: ");
        int edad2 = sc.nextInt();
        sc.nextLine(); // Limpiar el buffer después de nextInt()

        // Crear la 2ª persona
        Persona persona2 = new Persona(dni2, nombre2, apellidos2, edad2);

        // Mostrar resultados
        System.out.println("INFORMACION 1 PERSONA");
        persona1.imprimir();
        System.out.println("Es adulto: " + persona1.isAdult());
        System.out.println("Está jubilado: " + persona1.isRetired());
        System.out.println();

        System.out.println("INFORMACION 2 PERSONA");
        persona2.imprimir();
        System.out.println("Es adulto: " + persona2.isAdult());
        System.out.println("Está jubilado: " + persona2.isRetired());

        // Diferencia de edad
        System.out.println("La diferencia de edad es de " + persona1.ageDiference(persona2) + " años.");
    }
}
