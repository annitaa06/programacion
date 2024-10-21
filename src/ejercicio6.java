import java.util.Date;
import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {

        Scanner ValorU = new Scanner(System.in);
        System.out.println("introduce un numero para calcular el area");
        double radio = ValorU.nextDouble();
        double area= 3.14 * radio * radio;
        System.out.println("el area es " + area);
    }
}
