package tema7.Ejercicios;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B2 {
    public static void main(String[] args) {
        String nombreArchivo = "documentos/alumnos_notas.txt";
        List<Alumno> alumnos = new ArrayList<>(); // Lista para guardar alumnos

        try {
            Scanner lector = new Scanner(new File(nombreArchivo));

            while (lector.hasNextLine()) {
                String[] datos = lector.nextLine().split(" ");
                String nombre = datos[0] + " " + datos[1];
                double suma = 0;
                int cantidad = 0;

                for (int i = 2; i < datos.length; i++) {
                    suma += Integer.parseInt(datos[i]); // Convertimos notas de texto a número
                    cantidad++;
                }

                double media = suma / cantidad; // Calculamos la nota media
                alumnos.add(new Alumno(nombre, media)); // Guardamos en la lista
            }

            lector.close();

            // Ordenamos los alumnos de mayor a menor nota media
            alumnos.sort((a, b) -> Double.compare(b.media, a.media));

            // Mostramos los resultados
            for (Alumno a : alumnos) {
                System.out.println(a.nombre + " - " + a.media);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error: No se encontró el archivo " + nombreArchivo);
        }
    }
}


class Alumno {
    String nombre;
    double media;

    public Alumno(String nombre, double media) {
        this.nombre = nombre;
        this.media = media;
    }
}