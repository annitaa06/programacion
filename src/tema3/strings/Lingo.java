package tema3.strings;

import java.util.Scanner;

public class Lingo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String palabraSecreta = "patas"; // palabra secreta
        int intentos = 5; // número de intentos máximos
        boolean adivinada = false; // variable para saber si se adivinó la palabra

        System.out.println("Adivina la palabra de 5 letras.");

        for (int i = 0; i < intentos; i++) {
            System.out.println("Introduce tu intento:");
            String intento = scanner.nextLine().toLowerCase();

            // generar y mostrar la pista
            String pista = generarPista(palabraSecreta, intento);
            System.out.println("Pista: " + pista);

            // comprobar si el jugador adivinó
            if (intento.equals(palabraSecreta)) {
                adivinada = true; // marcamos que la palabra fue adivinada
                i = intentos; // forzamos salir del bucle al cumplir intentos
            }
        }

        // mensajes al final del juego
        if (adivinada) {
            System.out.println("¡Felicidades! Adivinaste la palabra.");
        } else {
            System.out.println("Lo siento, no adivinaste la palabra. Era: " + palabraSecreta);
        }
    }

    // generar la pista
    public static String generarPista(String palabraSecreta, String intento) {
        String pista = "";

        for (int i = 0; i < palabraSecreta.length(); i++) {
            if (intento.charAt(i) == palabraSecreta.charAt(i)) {
                pista += intento.charAt(i); // letra en posición correcta
            } else if (palabraSecreta.contains(String.valueOf(intento.charAt(i)))) {
                pista += "*"; // letra en la palabra pero en posición incorrecta
            } else {
                pista += "-"; // letra no está en la palabra
            }
        }

        return pista;
    }
}
