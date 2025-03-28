package tema7.Ejercicios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio3 {
    public static void main(String[] args) {
        int totalPalabras = 0;

        try {
            // Abrir el archivo de texto
            BufferedReader br = new BufferedReader(new FileReader("Documentos/alumnos_notas.txt"));
            String linea;

            // Leer el archivo línea por línea
            while ((linea = br.readLine()) != null) {
                // Dividir la línea por espacios
                String[] palabras = linea.split("\\s+");

                // Sumar el número de palabras al total
                totalPalabras += palabras.length;
            }

            // Cerrar el archivo
            br.close();

            // Mostrar el número total de palabras
            System.out.println("Número total de palabras: " + totalPalabras);

        } catch (IOException e) {
            // Manejo de errores si el archivo no existe o no se puede leer
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
