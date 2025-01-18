package tema3.matrices;

import java.util.Random;
import java.util.Scanner;

public class moscaConMatriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean terminado =false;


        int[][] matriz = {
                {1, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0}

        };
        inicio();
        random(matriz);


        while (!terminado) {
            int filaU = sc.nextInt();
            int columnaU = sc.nextInt();

            if (matriz[filaU][columnaU]==1){
                System.out.println("HAS ATRAPADO LA MOSCA");
             //arriba
            } else if (matriz[filaU-1][columnaU]==1) {
                System.out.println("casi la atrapas, la mosca se ha asustado y se ha ido");
                random(matriz);
            } else if (matriz[filaU+1][columnaU]==1) {
                System.out.println("casi la atrapas, la mosca se ha asustado y se ha ido");
                random(matriz);
            } else if (matriz[filaU][columnaU-1]==1) {
                System.out.println("casi la atrapas, la mosca se ha asustado y se ha ido");
                random(matriz);
            } else if (matriz[filaU][columnaU+1]==1) {
                System.out.println("casi la atrapas, la mosca se ha asustado y se ha ido");
                random(matriz);
            }


        }

    }

    public static void inicio() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido al juego de la mosca!!");
        System.out.println("Dime una fila y una columna para ver si adivinas donde esta la mosca, si estas cerca la mosca se movera");
        System.out.println("Introduce la fila: ");
        System.out.println("Introduce la columna: ");

    }

    public static int[][] random(int[][] matriz) {
        Random random = new Random();
        int columnar = random.nextInt(3);
        int filar = random.nextInt(3);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = 0;
            }
        }
        matriz[filar][columnar] = 1;
        return matriz;
    }


}
