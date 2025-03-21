package tema7.Ejercicios;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class B6 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("QUE NÚMERO QUIERES INTRODUCIR");
        String numusu = sc.next();

        String rutapi = "C:\\Users\\Usuario\\IdeaProjects\\Documentos\\pi-million.txt";
        String piString = Files.readString(Path.of(rutapi));

        if (piString.contains(numusu)){
            System.out.println("LOS NUMEROS SE ENCUENTRAN EN EL ARCHIVO");
        }
        else System.out.println("LOS NÚMEROS NO SE ENCUENTRAN EN EL ARCHIVO");

    }
}
