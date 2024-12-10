package tema3;

import java.util.Scanner;

import static tema3.eje1.numberSingn;
import static tema3.ejer2.isAdult;
import static tema3.ejer3.*;
import static tema3.ejer4.*;
import static tema3.ejer5.tablaMulti;
import static tema3.ejer6.tablasmultiplicar;
import static tema3.ejer7.esPrimo;
import static tema3.ejer8.esFechaValida;
import static tema3.ejer9.triangulo;

public class ejer10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("a) Muestra el signo de un número introducido por el usuario.\n" +
                "b) Indica si el usuario es mayor de edad o no.\n" +
                "c) Calcula el área y perímetro de un círculo.\n" +
                "d) Conversor de euros a dólares y de dólares a euros.\n" +
                "e) Mostrar tabla de multiplicar de un número.\n" +
                "f) Mostrar tablas de multiplicar del 1 al 10.\n" +
                "g) Comprobador de números primos.\n" +
                "h) Comprobador de fechas.\n" +
                "i) Dibujar triángulos.");

        char valorUsu = sc.next().charAt(0);
        switch (valorUsu) {
            case 'a': {
                System.out.println("Introduce un número:");
                double valorU = sc.nextDouble();
                double result = numberSingn(valorU);

                if (result == 0) {
                    System.out.println("0");
                } else if (result == -1) {
                    System.out.println("-1");
                } else {
                    System.out.println("1");
                }
                break;
            }
            case 'b': {
                System.out.println("Dime tu edad:");
                int age = sc.nextInt();

                if (isAdult(age)) {
                    System.out.println("Eres mayor de edad");
                } else {
                    System.out.println("NO eres mayor de edad");
                }
                break;
            }
            case 'c': {
                System.out.println("Dime un radio para calcular el área y el perímetro:");
                double radius = sc.nextDouble();

                while (!validRadius(radius)) {
                    System.out.println("Por favor, introduce un radio válido:");
                    radius = sc.nextDouble();
                }

                double perimetro = calculateCirclePerimeter(radius);
                double area = calculateCircleArea(radius);

                System.out.println("El perímetro del círculo es: " + perimetro);
                System.out.println("El área del círculo es: " + area);
                break;
            }
            case 'd': {
                System.out.println("Seleccione una opción:\n1) Dólares a euros\n2) Euros a dólares");
                int opcion = sc.nextInt();
                if (opcion == 1) {
                    System.out.println("Introduce los dólares:");
                    double dolares = sc.nextDouble();
                    System.out.println("En euros son: " + dollar2euro(dolares));
                } else if (opcion == 2) {
                    System.out.println("Introduce los euros:");
                    double euros = sc.nextDouble();
                    System.out.println("En dólares son: " + euro2dollar(euros));
                } else {
                    System.out.println("Opción no válida");
                }
                break;
            }
            case 'e': {
                System.out.println("Introduce un número para mostrar su tabla:");
                int numtab = sc.nextInt();
                if (numtab >= 1 && numtab <= 10) {
                    tablaMulti(numtab);
                } else {
                    System.out.println("El número no está entre 1 y 10");
                }
                break;
            }
            case 'f': {
                System.out.println("Estas son las tablas de multiplicar:");
                tablasmultiplicar();
                break;
            }
            case 'g': {
                System.out.println("Introduce números enteros positivos (0 para salir):");
                int numero = sc.nextInt();

                while (numero != 0) {
                    if (numero < 0) {
                        System.out.println("Por favor, introduce un número positivo.");
                    } else if (esPrimo(numero)) {
                        System.out.println(numero + " es un número primo.");
                    } else {
                        System.out.println(numero + " no es un número primo.");
                    }
                    System.out.print("Número: ");
                    numero = sc.nextInt();
                }

                System.out.println("Fin del programa.");
                break;
            }
            case 'h': {
                if (esFechaValida()) {
                    System.out.println("La fecha es válida");
                } else {
                    System.out.println("La fecha NO es válida");
                }
                break;
            }
            case 'i': {
                System.out.println("Introduce un carácter:");
                char caracterUsu = sc.next().charAt(0);
                System.out.println("Introduce un número de líneas:");
                int numLineasUsu = sc.nextInt();
                triangulo(caracterUsu, numLineasUsu);
                break;
            }
            default: {
                System.out.println("Opción no válida.");
            }
        }
        sc.close();
    }
}
