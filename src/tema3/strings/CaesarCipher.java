package tema3.strings;

import java.util.Scanner;

public class CaesarCipher {

    public static void main(String[] args) {
        int valorU = menu();
        switch (valorU) {
            case 1:
                cifrar();
                break;
            case 2:
                descifrar();
                break;
            default:
                System.out.println("Opción no válida. Adiós.");
        }
    }

    public static int menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("BIENVENIDO AL CIFRADO DE CÉSAR");
        System.out.println("Elige qué quieres hacer:");
        System.out.println("1. Cifrar");
        System.out.println("2. Descifrar");
        return sc.nextInt();
    }

    public static void cifrar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el mensaje que deseas cifrar:");
        String mensaje = sc.nextLine().toUpperCase(); // Convertimos a mayúsculas
        String mensajeCifrado = "";
            //recorre letra pro letra
        for (int i = 0; i < mensaje.length(); i++) {
            char caracter = mensaje.charAt(i);
            if (caracter >= 'A' && caracter <= 'Z') {
                // si el carácter es una letra mayúscula entre 'A' y 'Z'
                if (caracter == 'Z') {
                    // si el carácter es 'Z', lo convertimos en 'A' (ciclo del alfabeto)
                    mensajeCifrado += 'A';
                } else {
                    // si no es 'Z', desplazamos el carácter una posición hacia adelante
                    mensajeCifrado += (char) (caracter + 1);
                }
            } else if (caracter >= '0' && caracter <= '9') {
                // si el carácter es un número entre '0' y '9'
                if (caracter == '9') {
                    // si el carácter es '9', lo convertimos en '0' (ciclo de los números)
                    mensajeCifrado += '0';
                } else {
                    // si no es '9', desplazamos el carácter una posición hacia adelante
                    mensajeCifrado += (char) (caracter + 1);
                }
            } else {
                // si el carácter no es una letra ni un número, se queda igual
                mensajeCifrado += caracter;
            }

        }

        System.out.println("Mensaje cifrado: " + mensajeCifrado);
    }

    public static void descifrar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el mensaje que deseas descifrar:");
        String mensaje = sc.nextLine().toUpperCase(); // Convertimos a mayúsculas
        String mensajeDescifrado = "";

        for (int i = 0; i < mensaje.length(); i++) {
            char caracter = mensaje.charAt(i);
            if (caracter >= 'A' && caracter <= 'Z') {
                // si el carácter es una letra mayúscula entre 'A' y 'Z'
                if (caracter == 'A') {
                    // si el carácter es 'A', lo convertimos en 'Z' (ciclo del alfabeto inverso)
                    mensajeDescifrado += 'Z';
                } else {
                    // si no es 'A', desplazamos el carácter una posición hacia atrás
                    mensajeDescifrado += (char) (caracter - 1);
                }
            } else if (caracter >= '0' && caracter <= '9') {
                // si el carácter es un número entre '0' y '9'
                if (caracter == '0') {
                    // si el carácter es '0', lo convertimos en '9' (ciclo de los números inverso)
                    mensajeDescifrado += '9';
                } else {
                    // si no es '0', desplazamos el carácter una posición hacia atrás
                    mensajeDescifrado += (char) (caracter - 1);
                }
            } else {
                // si el carácter no es una letra ni un número, se queda igual
                mensajeDescifrado += caracter;
            }

        }

        System.out.println("Mensaje descifrado: " + mensajeDescifrado);
    }
}
