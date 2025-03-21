package tema7.Ejercicios;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class B4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        //preguntamos
        System.out.print("cuantos nombres quieres generar? ");
        int cantidad = sc.nextInt();
        sc.nextLine(); // Consumir el salto de línea

        System.out.print("Introduce el nombre del archivo ");
        String archivoSalida = sc.nextLine();

        try {
            //almacenamos los apellidos y los nombres
            List<String> nombres = leerArchivo("Documentos/usa_nombres.txt");
            List<String> apellidos = leerArchivo("Documentos/usa_apellidos.txt");
            //permite escribir en el, archivo
            PrintWriter escritor = new PrintWriter(new File(archivoSalida));

            //HASTA QUE QUEDEN NOMBRES escojemos  nombre y  apellido y lo guardamos en el archivo
            for (int i = 0; i < cantidad; i++) {
                String nombre = nombres.get(random.nextInt(nombres.size()));
                String apellido = apellidos.get(random.nextInt(apellidos.size()));
                escritor.println(nombre + " " + apellido);
            }
            escritor.close();
            System.out.println("Se han generado " + cantidad + " nombres en " + archivoSalida);
        } catch (FileNotFoundException e) {
            System.out.println("Error: No se encontró uno de los archivos.");
        }

    }
    //METODO PARA LEER LOS ARCHIVOS
    private static List<String> leerArchivo(String ruta) throws FileNotFoundException {
        List<String> lista = new ArrayList<>();
        Scanner lector = new Scanner(new File(ruta));

        while (lector.hasNextLine()) {
            lista.add(lector.nextLine());
        }
        lector.close();
        return lista;
    }
}
