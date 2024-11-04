package bucles;

import java.util.Scanner;

public class ejercicio27 {
    public static void main(String[] args) {
        System.out.println("los 20 primeros numeros son:");
        int cont = 0;
        int num = 0;
        while (cont < 20) {
            int divi = 0;
            //i empieza siendo 1, mientras i sea menor o igual a la variavle num se suma 1 a i
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) { //si numero mod de i y da 0 entonces el cont de divisores se suma 1
                    divi++;
                }
            }
            if (divi == 2) { //si divisores es 2
                System.out.print(num + " ");
                cont++;
            }

            num++;
        }
    }
}

