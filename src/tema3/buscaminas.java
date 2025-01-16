package tema3.arrays;

import java.util.Random;
import java.util.Scanner;

public class buscaminas {

    public static void main(String[] args) {
        // Crear el tablero de juego
        int[] tablero = new int[20]; // Array con pistas (0, 1, 2)
        boolean[] minas = new boolean[20];
        boolean[] revelado = new boolean[20]; // Array para saber si una casilla está revelada
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // poner 6 minas aleatoriamente en el tablero
        for (int i = 0; i < 6; i++) {
            int posicion;
            do {
                posicion = random.nextInt(20); // generar una posición aleatoria
            } while (minas[posicion]); //
            minas[posicion] = true; // marcar la posición como mina
        }

        // pistas
        for (int i = 0; i < 20; i++) {
            if (minas[i]) {
                tablero[i] = -1; // -1 indica una mina
            } else {
                int contador = 0;
                if (i > 0 && minas[i - 1]) contador++; //  izquierda
                if (i < 19 && minas[i + 1]) contador++; //  derecha
                tablero[i] = contador; // guardar la cantidad de minas
            }
        }

        // Iniciar el juego
        System.out.println("¡Bienvenido al Buscaminas!");
        System.out.println("Selecciona una posición del 0 al 19. Si encuentras una mina, pierdes.");

        //
        boolean jugadorPierde = false;
        int casillasRestantes = 20 - 6; //  sin minas por descubrir

        //mientras el jugador no pierda y queden casillas sin descubrir preguntar posición
        while (!jugadorPierde && casillasRestantes > 0) {
            System.out.print("Ingresa una posición (0-19): ");
            int posicion = scanner.nextInt();


            if (posicion < 0 || posicion >= 20) {
                System.out.println("Posición no válida. Intenta nuevamente.");
                //si el usuario pone una posicion ya descubierta
            } else if (revelado[posicion]) {
                System.out.println("Ya has descubierto esta posición. Intenta otra.");
            } else {
                // Revelar la casilla
                revelado[posicion] = true;

                // comprobación mina
                if (minas[posicion]) {
                    jugadorPierde = true; // El jugador pierde
                    System.out.println("¡Boom! ");
                } else {
                    // Mostrar la pista
                    System.out.println("Pista: " + tablero[posicion]);
                    casillasRestantes--;
                }

                // Mostrar el tablero actual
                imprimirTablero(tablero, revelado);
            }
        }

        // Mensaje final si el jugador gana
        if (!jugadorPierde) {
            System.out.println("Has revelado todas las casillas!");
        }

    }

    // Función para imprimir el tablero
    private static void imprimirTablero(int[] tablero, boolean[] revelado) {
        System.out.print("Tablero: ");
        for (int i = 0; i < tablero.length; i++) {
            if (revelado[i]) {
                // mostrar casilla revelada
                if (tablero[i] == -1) {
                    System.out.print("* "); // mina
                } else {
                    System.out.print(tablero[i] + " "); // pista
                }
            } else {
                //no revelada
                System.out.print("- ");
            }
        }
        System.out.println();
    }
}

