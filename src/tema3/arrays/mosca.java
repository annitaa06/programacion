package tema3.arrays;

import java.util.Scanner;

public class mosca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] tablero = new int[15];
        int posicionMosca = generarPosicion(tablero);
        int eleccionJugador;

        System.out.println("¡Bienvenido! Intenta encontrar a la mosca.");

        do {
            imprimirTablero(tablero);
            eleccionJugador = pedirPosicion(sc);

            if (esCorrecto(eleccionJugador, posicionMosca)) {
                System.out.println("¡Has encontrado la mosca!");
            } else if (esAdyacente(eleccionJugador, posicionMosca)) {
                System.out.println("Estuviste cerca, la mosca se ha movido.");
                posicionMosca = generarPosicion(tablero);
            } else {
                System.out.println("Fallaste.");
            }
        } while (!esCorrecto(eleccionJugador, posicionMosca));
    }

    public static int generarPosicion(int[] tablero) {
        for (int i = 0; i < tablero.length; i++) {
            tablero[i] = 0;
        }
        int posicion = (int) (Math.random() * tablero.length);
        tablero[posicion] = 1;
        return posicion;
    }

    public static int pedirPosicion(Scanner sc) {
        System.out.print("Elige una posición (1 a 15): ");
        return sc.nextInt() - 1;
    }

    public static boolean esCorrecto(int eleccionJugador, int posicionMosca) {
        return eleccionJugador == posicionMosca;
    }

    public static boolean esAdyacente(int eleccionJugador, int posicionMosca) {
        return Math.abs(eleccionJugador - posicionMosca) == 1;
    }

    public static void imprimirTablero(int[] tablero) {
        for (int i = 0; i < tablero.length; i++) {
            System.out.print("[ ] "); // Oculta la posición de la mosca
        }
        System.out.println();
    }
}
