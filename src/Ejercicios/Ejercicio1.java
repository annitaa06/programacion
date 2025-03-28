package tema7.Ejercicios;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//Crea un programa que pida al usuario su nombre y edad y los guarde en un fichero llamado
//usuario.txt

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe tu nombre");
        String nombre = sc.nextLine();
        System.out.println("Escribe tu edad");
        int edad = sc.nextInt();

        File archivo = new File("usuarios.txt");

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo))) {
            bw.write("Nombre: " + nombre);
            bw.newLine(); // Salto de linea
            bw.write("Edad: " + edad);

            System.out.println("se han guardado los datos en : " + archivo.getAbsolutePath());
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }
}
