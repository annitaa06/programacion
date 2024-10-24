import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {

        //iniciar escanner
        Scanner sc = new Scanner(System.in);

        //pedir datos al usuario +
        System.out.println("escribe un numero");
        int num1 =sc.nextInt();

        System.out.println("escribe un numero");
        int num2 =sc.nextInt();

        System.out.println("escribe un numero");
        int num3 =sc.nextInt();

        //si num1 es mayor o igual a num2 y num1 es mayor o igual a num3 entonces el mayor es 1
        if (num1 >= num2 && num1 >= num3) {
            System.out.println("El mayor de los tres números es: " + num1);
            //si num2 es mayor o igual a num1 y num2 es mayor o igual a num3 entonces el mayor es 2
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println("El mayor de los tres números es: " + num2);
            // si no el mayor es 3
        } else {
            System.out.println("El mayor de los tres números es: " + num3);
        }
    }
}
