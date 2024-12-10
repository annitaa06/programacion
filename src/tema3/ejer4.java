package tema3;

import java.util.Scanner;

public class ejer4 {
    public static void main(String[] args) {
        boolean salirwhile = false;
        double resultfin = 0;
        Scanner scanner = new Scanner(System.in);
        showmenu();


        while (!salirwhile){
            int valorusu = scanner.nextInt();

            if (valorusu == 1){
                System.out.println("pasar € A $");
                System.out.println("Introduce los euros");

                double monedausu = scanner.nextDouble();
                resultfin = euro2dollar(monedausu);

                System.out.println("SON: " + resultfin + " dolares");

                salirwhile = true;



            }
            else if (valorusu == 2){
                System.out.println("PASAR DE $ A €");
                System.out.println("INTRODUCE LOS DOLLARS");

                double monedausu = scanner.nextDouble();
                resultfin = dollar2euro(monedausu);

                System.out.println("SON " + resultfin + " euros");

                salirwhile = true;

            }

            else if (valorusu == 3){
                System.out.println("estas saliendo");
                salirwhile = true;
            }

            else {
                System.out.println("INTRODUCE UN VALOR VÁLIDO");
            }


        }


    }

    public static double euro2dollar (double monedausu){
        return monedausu * 1.05;
    }

    public static double dollar2euro (double monedausu){
        return monedausu* 0.96;
    }

    public static void showmenu (){
        System.out.println("INTRODUCE 1 SI QUIERES PASAR DE EUROS A DOLARES");
        System.out.println("INTRODUCE 2 SI QUIERES PASAR DE DOLARES A EUROS");
        System.out.println("INTRODUCE 3 SI QUIERES SALIR");
    }



}
