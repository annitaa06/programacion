package bucles;

import java.util.Scanner;

public class ejercicio22 {
    public static void main(String[] args) {

        int contador = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escribe un numero entero para decir cuantas cifras tiene");
        int valorU;
        valorU = scanner.nextInt();
        valorU = Math.abs(valorU); //pasar negativos a positivos

        if (valorU == 0) {

            System.out.println("Tiene un digito");
        }

        else {
            while (valorU > 0) {

                valorU = valorU / 10;

                contador = contador + 1;
                
            }
            System.out.println("El numero de dígitos es " + contador);

        }
        
    }
    
}
