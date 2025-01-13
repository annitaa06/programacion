package Juegolucha;

import java.util.Random;
import java.util.Scanner;

public class juegoluchamod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        // Bienvenida
        bienvenida();

        // Atributos del jugador 1
        int[] atributosJugador1 = obtenerAtributos(sc, "Jugador 1");

        // Atributos del jugador 2
        int[] atributosJugador2 = obtenerAtributos(sc, "Jugador 2");

        // Introducción al juego
        intro();

        // Asignar valores de los atributos
        int velpers1 = atributosJugador1[0], ataqpers1 = atributosJugador1[1], vidpers1 = atributosJugador1[2], defpers1 = atributosJugador1[3];
        int velpers2 = atributosJugador2[0], ataqpers2 = atributosJugador2[1], vidpers2 = atributosJugador2[2], defpers2 = atributosJugador2[3];

        // Determinar el turno inicial
        boolean turnoJugador1 = velpers1 >= velpers2;

        // Batalla
        while (vidpers1 > 0 && vidpers2 > 0) {
            if (turnoJugador1) {
                System.out.println("Jugador 1: para atacar, pulsa 1. Para omitir el ataque y pasar turno, pulsa otro número.");
                int input = sc.nextInt();
                if (input == 1) {
                    int danoPersonaje1 = calcularDanio(ataqpers1, defpers2, random);
                    vidpers2 -= danoPersonaje1;
                    vidpers2 = Math.max(vidpers2, 0);
                    System.out.println("Jugador 1 ataca e inflige " + danoPersonaje1 + " de daño a Jugador 2.");
                    mostrarVida("Jugador 2", vidpers2);
                }
            } else {
                System.out.println("Jugador 2: para atacar, pulsa 1. Para omitir el ataque y pasar turno, pulsa otro número.");
                int input = sc.nextInt();
                if (input == 1) {
                    int danoPersonaje2 = calcularDanio(ataqpers2, defpers1, random);
                    vidpers1 -= danoPersonaje2;
                    vidpers1 = Math.max(vidpers1, 0);
                    System.out.println("Jugador 2 ataca e inflige " + danoPersonaje2 + " de daño a Jugador 1.");
                    mostrarVida("Jugador 1", vidpers1);
                }
            }

            turnoJugador1 = !turnoJugador1;
        }

        // Resultado final
        if (vidpers1 <= 0) {
            ganaJ2();

        } else if (vidpers2 <= 0) {
           //gana j1
            ganaJ1();

        }
    }

    public static void bienvenida() {
        System.out.println("\n" +
                "  ____  _                           _     _       \n" +
                " |  _ \\(_)                         (_)   | |      \n" +
                " | |_) |_  ___ _ ____   _____ _ __  _  __| | ___  \n" +
                " |  _ <| |/ _ \\ '_ \\ \\ / / _ \\ '_ \\| |/ _` |/ _ \\ \n" +
                " | |_) | |  __/ | | \\ V /  __/ | | | | (_| | (_) |\n" +
                " |____/|_|\\___|_| |_|\\_/ \\___|_| |_|_|\\__,_|\\___/ \n"
        );    }

    public static void intro() {
        System.out.println("\n" +
                "  ______                 _                 _         _            _           _ _ \n" +
                " |  ____|               (_)               | |       | |          | |         | | |\n" +
                " | |__   _ __ ___  _ __  _  ___ ______ _  | | __ _  | |_   _  ___| |__   __ _| | |\n" +
                " |  __| | '_ ` _ \\| '_ \\| |/ _ \\_  / _` | | |/ _` | | | | | |/ __| '_ \\ / _` | | |\n" +
                " | |____| | | | | | |_) | |  __// / (_| | | | (_| | | | |_| | (__| | | | (_| |_|_|\n" +
                " |______|_| |_| |_| .__/|_|\\___/___\\__,_| |_|\\__,_| |_|\\__,_|\\___|_| |_|\\__,_(_|_)\n" +
                "                  | |                                                             \n" +
                "                  |_|                                                             \n");
    }

    public static int calcularDanio(int ataque, int defensa, Random random) {
        return (int) Math.max(1, (ataque - defensa) * (0.5 + random.nextDouble()));
    }

    public static void mostrarVida(String jugador, int vida) {
        System.out.println("Vida restante de " + jugador + ": " + vida);
        for (int i = 0; i < vida; i += 2) {
            System.out.print("♥ ");
        }
        System.out.println();
    }

    public static int[] obtenerAtributos(Scanner sc, String jugador) {
        int[] atributos = new int[4];
        String[] nombresAtributos = {"Velocidad", "Ataque", "Vida", "Defensa"};
        int suma;

        System.out.println(jugador + ": Ingresa tus atributos (cada uno entre 1 y 200, no deben superar un total de 500):");
        do {
            suma = 0;
            for (int i = 0; i < nombresAtributos.length; i++) {
                System.out.print(nombresAtributos[i] + ": ");
                atributos[i] = sc.nextInt();
                while (atributos[i] < 1 || atributos[i] > 200) {
                    System.out.println("El valor de " + nombresAtributos[i] + " debe estar entre 1 y 200.");
                    System.out.print(nombresAtributos[i] + ": ");
                    atributos[i] = sc.nextInt();
                }
                suma += atributos[i];
            }

            if (suma > 500) {
                System.out.println("La suma de los atributos de " + jugador + " supera los 500. Vuelve a ingresarlos.");
            }
        } while (suma > 500);

        return atributos;
    }

    public static void ganaJ1(){
        System.out.println("┓┏             ┓    •       ┓      ┓  \n" +
                "┣┫┏┓  ┏┓┏┓┏┓┏┓┏┫┏┓  ┓┓┏┏┓┏┓┏┫┏┓┏┓  ┃  \n" +
                "┛┗┗┻  ┗┫┗┻┛┗┗┻┗┻┗┛  ┃┗┻┗┫┗┻┗┻┗┛┛   ┻  \n" +
                "       ┛            ┛   ┛             \n" +
                "\n");
    }
    public static void ganaJ2(){
        System.out.println("┓┏             ┓    •       ┓      ┏┓\n" +
                "┣┫┏┓  ┏┓┏┓┏┓┏┓┏┫┏┓  ┓┓┏┏┓┏┓┏┫┏┓┏┓  ┏┛\n" +
                "┛┗┗┻  ┗┫┗┻┛┗┗┻┗┻┗┛  ┃┗┻┗┫┗┻┗┻┗┛┛   ┗━\n" +
                "       ┛            ┛   ┛            \n" +
                "\n");
    }
}
