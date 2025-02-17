package EXCEPCIONES;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejer5 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        boolean compwhile = false;


        while (!compwhile){
            try {
                System.out.println("INGRESA UN VALOR");
                int valorusu = scanner.nextInt();
                System.out.println("IMPRIMIR POSITIVO --> 1  IMPRIMIR NEGATIVO --> 2 SALIR --> 3");
                int opcionusu = scanner.nextInt();
                switch (opcionusu) {
                    case 1:
                        try {
                            imprimePositivo(valorusu);
                            break;
                        }
                        catch (Exception ex){
                            System.out.println("Error: " + ex.getMessage());
                            break;
                        }

                    case 2:
                        try {
                            imprimeNegativo(valorusu);
                            break;
                        }
                        catch (Exception ex){
                            System.out.println("Error: " + ex.getMessage());
                            break;
                        }
                    case 3:
                        System.out.println();
                        compwhile = true;
                        break;
                }
            }
            catch (InputMismatchException ex){
                System.out.println(ex);
                scanner.nextLine();
            }

        }


    }

    public static void imprimePositivo(int valorusu) throws Exception{
        if (valorusu >= 0){
            System.out.println(valorusu);
        }else{
            throw new Exception("NO se permite numeros negativos");
        }
    }

    public static void imprimeNegativo(int valorusu) throws Exception{
        if (valorusu >= 0){
            throw new Exception("NO se permiten numeros positivos");
        }
        else System.out.println(valorusu);
    }


}
