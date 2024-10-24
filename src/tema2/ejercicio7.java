import java.util.Scanner;

public class ejercicio7 {
        public static void main(String[] args) {
            // pedir datos al usuario
            Scanner sc = new Scanner(System.in);
            System.out.print("Introduce el primer número: ");
            double num1 = sc.nextDouble();

            System.out.print("Introduce el segundo número: ");
            double num2 = sc.nextDouble();

            if (num1>num2) {
                System.out.println("la resta es = " + (num1-num2));
            }else if (num2 > num1){
                System.out.println("la resta es = " + (num2-num1));
            }

        }
}

