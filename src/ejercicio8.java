import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        int num1;
        int num2;

        Scanner ValorU = new Scanner(System.in);
        System.out.println("introduce un numero para ver cual es mayor");
        num1=ValorU.nextInt();
        System.out.println("introduce un numero para ver cual es mayor");
        num2=ValorU.nextInt();

            if (num1 > num2 ) {
                System.out.println("el mayor es "+ num1);
            }
            else if(num1<num2) {
                System.out.println("el mayor es " + num2);
            }
            else{
                System.out.println(num1 + " es igual a " + num2);
            }

    }
}
