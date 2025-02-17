package EXCEPCIONES;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Ejer4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean compwhile = false;
    //poner try
        int tamano = random.nextInt(100);
        int[] Array = new int[tamano];

        for (int i = 0; i < Array.length; i++) {
            int valores = random.nextInt(10);
            Array[i] = valores;
        }

        while (!compwhile) {
            System.out.println("INTRODUCE UNA POSICION DEL ARRAY QUE QUIERAS MOSTRAR");
            System.out.println("INSERTA UN NUMERO NEGATIVO PARA SALIR");
            try {
                int elecusu = scanner.nextInt();
                if (elecusu < 0){
                    compwhile = true;
                }
                System.out.println(Array[elecusu]);
            }

            catch (ArrayIndexOutOfBoundsException ex){
                System.out.println(ex);
            }
            catch (InputMismatchException ex){
                System.out.println(ex);
            }
        }

    }
}
