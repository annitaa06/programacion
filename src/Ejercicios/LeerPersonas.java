package tema7.Ejercicios;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class LeerPersonas {
    public static void main(String[] args) {
        ArrayList<Persona> listaPersonas = null;

        try {
            //arir el archivo personas.dat
            FileInputStream fileIn = new FileInputStream("personas.dat");
            ObjectInputStream in = new ObjectInputStream(fileIn);

            // Lemos el arrayList del archivo y lo convertimos a ArrayList<Persona>
            listaPersonas = (ArrayList<Persona>) in.readObject();


            in.close();
            fileIn.close();

        } catch (IOException | ClassNotFoundException e) {
            System.out.println(" Error al leer la lista: " + e.getMessage());
        }

        // Mostramos los datos de las personas si se ha lído correctamente
        if (listaPersonas != null) {
            System.out.println("Lista de personas leída correctamente:");
            for (Persona p : listaPersonas) {
                System.out.println("Nombre: " + p.getNombre() + ", Edad: " + p.getEdad());
            }
        } else {
            System.out.println(" No se pudo leer la lista.");
        }
    }
}

