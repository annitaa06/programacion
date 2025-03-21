package tema7.Ejercicios;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class B3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el nombre del archivo de entrada: ");
        String archivoEntrada = sc.nextLine();

        System.out.print("Introduce el nombre del archivo de salida: ");
        String archivoSalida = sc.nextLine();

        try {
            Scanner lector = new Scanner(new File(archivoEntrada));
            List<String> lineas = new ArrayList<>();

            while (lector.hasNextLine()) {
                lineas.add(lector.nextLine());
            }
            lector.close();
            //ordena alfabeticamente
            Collections.sort(lineas);

            // Abre el archivo de salida
            PrintWriter escritor = new PrintWriter(new File(archivoSalida));

            //Escribe cada línea en el archivo
            for (String linea : lineas) {
                escritor.println(linea);
            }
            System.out.println("Archivo ordenado y guardado en " + archivoSalida);

            escritor.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: No se encontró el archivo " + archivoEntrada);
        }


    }
}
