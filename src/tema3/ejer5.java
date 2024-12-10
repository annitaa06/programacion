package tema3;

import java.util.Scanner;

public class ejer5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println( "introduce un numero para mostrar su tabla");
        int numtab = sc.nextInt();
    if (numtab >= 1&&  numtab <=10){
        tablaMulti(numtab);
    }
    else {
        System.out.println("el numero no esta entre 1y 10");
    }
    }

    public static void tablaMulti(int num){
        System.out.println("tabla de multipicar del " + num);
        for (int i= 1; i <= 10; i++){
            System.out.println(num*i);
        }
    }
}
