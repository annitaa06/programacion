package tema7.Ejercicios;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class B1 {
    public static void main(String[] args) {
        //ruta del archivo dentro de la carpeta
        String nombreArchivo = "src/tema7/Documentos/numeros.txt";
        int maximo =Integer.MIN_VALUE; //INICIALIZAMOS LOS MAXIMOS CON EL VALOR MAS PEQUEÑO
        int minimo = Integer.MAX_VALUE;
        //por si falla o el archivo no esta creado
        try{
            //Abrir el archivo
             File archivo = new File(nombreArchivo);
            //crea un lector para leer el archivo
            Scanner lector= new Scanner(archivo);

            //mientras haya numerso leemos y la guardamos dentro de la variable
            while (lector.hasNextInt()){
                int numero= lector.nextInt();

                if (numero> maximo){
                    maximo=numero;
                }
                if (numero < minimo){
                    minimo=numero;
                }

            }
            lector.close();
            System.out.println("numero maximo " + maximo);
            System.out.println("numero minimo " + minimo);
        } catch (FileNotFoundException e) {
            System.out.println("ERROR: no se ha encontrado el archivo "+ nombreArchivo);
        }
    }
}
