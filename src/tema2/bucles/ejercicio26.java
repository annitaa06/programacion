package bucles;

import java.util.Scanner;

public class ejercicio26 {
    public static void main(String[] args) {

        int cont;
        int i;

        Scanner sc = new Scanner(System.in);
        System.out.println("ingresa un numero para saber si es primo");
        int valorU = sc.nextInt();

        cont = 0;
        for (i = 1; i <= valorU; i++) {
        if ((valorU % i) == 0 )
        {
            cont++;
        }

        }
        if (cont <= 2){
            System.out.println("numero primo");
        }
        else {
            System.out.println("numero NO primo");
        }
    }
}
