package tema7.Ejercicios;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class GuardarPersonas {
    public static void main(String[] args) {
        try {
            // Creamos una lista de personas
            ArrayList<Persona> listaPersonas = new ArrayList<>();
            listaPersonas.add(new Persona("Anna", 22));
            listaPersonas.add(new Persona("Carlos", 30));
            listaPersonas.add(new Persona("Lucía", 25));

            // Abrimos el archivo para guardar la lista
            FileOutputStream fileOut = new FileOutputStream("personas.dat");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);

            //  Escribimos la lista en el archivo
            out.writeObject(listaPersonas);

            out.close();
            fileOut.close();

            System.out.println("Lista de personas guardada correctamente en personas.dat");

        } catch (IOException e) {
            System.out.println("Error al guardar la lista: " + e.getMessage());
        }
    }
}
