package tema2;

import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {
        //iniciar nuevo escanner
        Scanner sc =new Scanner(System.in);
        //pedir datos al usuario
        System.out.println("escribe un numero ");
        //leer datos
        double num1= sc.nextDouble();
        //pedir datos al usuario
        System.out.println("escribe un numero ");
        //leer datos
        double num2= sc.nextDouble();
        //pedir datos al usuario
        System.out.println("escribe un numero ");
        //leer datos
        double num3= sc.nextDouble();
        //mostrar resultado

        if (num1 < num2 && num2 < num3){
            System.out.println("estan ordenados de menor a mayor");
        }
        else {
            System.out.println("no estan ordenados de menor a mayor");
        }
    }

}
