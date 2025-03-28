package tema7.Ejercicios;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class LeerPersona {
    public static void main(String[] args) {
        Persona persona = null; // declaramos la variable antes del try

        try {
            // abrimos el archivo persona.dat
            FileInputStream fileIn = new FileInputStream("persona.dat");

            //  Creamos un flujo para leer objetos
            ObjectInputStream in = new ObjectInputStream(fileIn);

            // Asignamos el objeto leído a la variable persona
            persona = (Persona) in.readObject();


            in.close();
            fileIn.close();

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al leer el objeto: " + e.getMessage());
        }

        // si la persona se ha leído correctamente, mostramos sus datos
        if (persona != null) {
            System.out.println(" Objeto leído correctamente:");
            System.out.println("Nombre: " + persona.getNombre());
            System.out.println("Edad: " + persona.getEdad());
        } else {
            System.out.println("No se pudo leer el objeto.");
        }
    }
}
