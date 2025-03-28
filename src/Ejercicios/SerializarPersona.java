package tema7.Ejercicios;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializarPersona {
    public static void main(String[] args) {
        // 1 Crear un objeto Persona
        Persona persona = new Persona("Anna", 19);

        try {
            // Crear un archivo persona.dat
            FileOutputStream fileOut = new FileOutputStream("persona.dat");

            //Crear un flujo para escribir objetos
            ObjectOutputStream out = new ObjectOutputStream(fileOut);

            //4 Escribir el objeto en el archivo
            out.writeObject(persona);

            //5 Cerrar
            out.close();
            fileOut.close();

            System.out.println("Objeto Persona guardado en persona.dat");

        } catch (IOException e) {
            System.out.println("Error al serializar: " + e.getMessage());
        }
    }
}

