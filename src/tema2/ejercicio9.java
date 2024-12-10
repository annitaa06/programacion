package tema2;

import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {
        //iniciar escaner
        Scanner sc =new Scanner(System.in);
        //pedir datos al usuario
        System.out.println("escribe los dolares para pasarlos a euros");
        //leer variable
        double dolares = sc.nextDouble();

        //mostrar resultado
        System.out.println("eso son = " + (dolares*0.93) +" euros");

    }
}
