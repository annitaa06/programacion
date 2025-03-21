package tema7.Ejercicios;

import java.io.*;

public class B5 {
    public static void main(String[] args) {
        File carpeta = new File("./Diccionario");

        if (!carpeta.exists()) {
            carpeta.mkdir(); // Creamos la carpeta
        }
        System.out.println("Carpeta creada o ya existía");

        // Usamos la ruta relativa para acceder al archivo diccionario.txt
       // File archivoDiccionario = new File("E:\\IdeaProjects\\programacion2\\src\\tema7\\Documentos\\diccionario.txt");
        File archivoDiccionario = new File("tema7/Documentos/diccionario.txt");
        try {
            System.out.println("Ruta absoluta que intenta usar: " + archivoDiccionario.getCanonicalPath());
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (!archivoDiccionario.exists()) {
            System.out.println("ERROR: El archivo diccionario.txt NO existe en la ruta indicada.");
            return;
        } else {
            System.out.println(" Archivo encontrado correctamente.");
        }

        if (!archivoDiccionario.exists()) {
            System.out.println("El archivo diccionario.txt no se encuentra en la ruta especificada.");
            return;
        }

        try (BufferedReader br = new BufferedReader(new FileReader(archivoDiccionario))) {
            String palabra = "";

            while ((palabra = br.readLine()) != null) {
                palabra = palabra.trim();

                if (palabra.length() > 0) {
                    char letra = Character.toUpperCase(palabra.charAt(0)); // Obtener la primera letra

                    if (letra >= 'A' && letra <= 'Z') { // Verificar que sea una letra válida
                        File archivo = new File("./Diccionario/" + letra + ".txt"); // Crear archivo correspondiente
                        BufferedWriter bw = new BufferedWriter(new FileWriter(archivo, true)); // Abrir archivo para escribir
                        bw.write(palabra); // Escribir palabra
                        bw.newLine(); // Agregar salto de línea
                        bw.close(); // Cerrar archivo
                    }
                }
            } // Cierre de while

        } catch (IOException e) { // Cierre de catch
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
