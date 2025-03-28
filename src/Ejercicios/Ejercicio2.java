package tema7.Ejercicios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio2 {
    public static void main(String[] args) {
     String ruta ="/media/annrosfab/TOSHIBA EXT/IdeaProjects/programacion2/src/tema7/usuarios.txt";

            try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
                //leer ñlinea x linea
                String linea;
                while ((linea = br.readLine()) != null) {
                    System.out.println(linea);
                }
            } catch (IOException e) {
                System.out.println("error al leer el archivo " + e.getMessage());
            }

        }
    }
