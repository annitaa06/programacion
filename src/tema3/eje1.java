package tema3;

import java.util.Scanner;

public class eje1 {
    public static void main(String[] args) {
        double result;
        double  valorU=0;

        System.out.println("introduce un numero");

   result=numberSingn(valorU);
                if (result==0){
                    System.out.println("0");
                }else if (result==-1){
                    System.out.println("-1");
                }else {
                    System.out.println("1");
                }
    }
    public static double numberSingn(double valorU) {
        Scanner sc= new Scanner(System.in);
        valorU= sc.nextDouble();
        if (valorU <0 ){
            return -1;
        }else if (valorU==0){
            return 0;
        }else {
            return 1;
        }
    }
}

