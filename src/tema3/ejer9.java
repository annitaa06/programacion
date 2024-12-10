package tema3;

import java.util.Scanner;

public class ejer9 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char caracterusu = 0;
        int numlineasusu = 0;

        System.out.println("INTRODUCE UN CARACTER");
        caracterusu = scanner.next().charAt(0);

        System.out.println("INTRODUCE UN NUMERO DE LINEAS");
        numlineasusu = scanner.nextInt();

        triangulo(caracterusu, numlineasusu);
    }

    public static void triangulo(char caracterusu, int numlineasusu) {
        for (int i = 1; i <= numlineasusu; ++i) {
            for (int e = 0; e < numlineasusu - i; ++e) {
                System.out.print(" ");
            }

            for (int j = 0; j < i; ++j) {
                System.out.print(caracterusu + " ");
            }

            System.out.println();
        }
    }
}
