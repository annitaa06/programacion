package tema3.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MyArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] primerarray = {1, 2, 3, 4, 5, 6};
        imprimirarray(primerarray);

        int[] segundoarray = {6, 5, 4, 3, 2, 1};
        imprimirarray(segundoarray);

        int opcion = 0;
        while (opcion != 13) {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Valor máximo");
            System.out.println("2. Valor mínimo");
            System.out.println("3. Media");
            System.out.println("4. Comprobar si un número existe");
            System.out.println("5. Sumar arrays");
            System.out.println("6. Restar arrays");
            System.out.println("7. Producto de arrays");
            System.out.println("8. Invertir array");
            System.out.println("9. Procedimiento para invertir el array");
            System.out.println("10. Comprobar si el array es capicua ");
            System.out.println("11. Salir");
            System.out.print("Elige una opción: ");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    int valormaximo = maxarray(primerarray);
                    System.out.println("El valor máximo es: " + valormaximo);
                    break;
                case 2:
                    int valorminimo = minarray(primerarray);
                    System.out.println("El valor mínimo es: " + valorminimo);
                    break;
                case 3:
                    int media = media(primerarray);
                    System.out.println("La media es: " + media);
                    break;
                case 4:
                    System.out.println("Dime un número para ver si existe:");
                    boolean existe = existente(primerarray);
                    if (existe) {
                        System.out.println("El número sí existe en el array.");
                    } else {
                        System.out.println("El número no existe en el array.");
                    }
                    break;
                case 5:
                    int[] suma = sumarArrays(primerarray, segundoarray);
                    System.out.println("La suma de los arrays es:");
                    imprimirarray(suma);
                    break;
                case 6:
                    int[] resta = restarArrays(primerarray, segundoarray);
                    System.out.println("La resta de los arrays es:");
                    imprimirarray(resta);
                    break;
                case 7:
                    int producto = productoEscalar(primerarray, segundoarray);
                    System.out.println("El producto es " + producto);
                    break;
                case 8:
                    int[] arrayInvertido = invertirArray(primerarray);
                    System.out.println("El array invertido es:");
                    imprimirarray(arrayInvertido);
                    break;
                case 9:
                    invertirArrayP(primerarray); // Llama al procedimiento para invertir el array
                    System.out.println("El array invertido hecho con procedimiento es: ");
                    imprimirarray(primerarray); // Imprime el array modificado
                    break;
                case 10:
                    boolean capicua= esCapicua(primerarray);
                    if (capicua){
                        System.out.println("el array es capicua");
                    }else{
                        System.out.println("el array no es capicua");
                    }
                    break;

                case 11:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elige una opción entre 1 y 13.");
            }
        }

        sc.close();
    }

    public static void imprimirarray(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    public static int maxarray(int[] array) {
        int maximo = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maximo) {
                maximo = array[i];
            }
        }
        return maximo;
    }

    public static int minarray(int[] array) {
        int minimo = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minimo) {
                minimo = array[i];
            }
        }
        return minimo;
    }

    public static int media(int[] array) {
        int suma = 0;
        for (int i = 0; i < array.length; i++) {
            suma += array[i];
        }
        return suma / array.length;
    }

    public static boolean existente(int[] array) {
        Scanner sc = new Scanner(System.in);
        int valorU = sc.nextInt();

        for (int i = 0; i < array.length; i++) {
            if (valorU == array[i]) {
                return true;
            }
        }
        return false;
    }

    public static int[] sumarArrays(int[] array1, int[] array2) {
        int[] resultado = new int[array1.length];

        for (int i = 0; i < array1.length; i++) {
            resultado[i] = array1[i] + array2[i];
        }
        return resultado;
    }

    public static int[] restarArrays(int[] array1, int[] array2) {
        int[] resultado = new int[array1.length];

        for (int i = 0; i < array1.length; i++) {
            resultado[i] = array1[i] - array2[i];
        }
        return resultado;
    }

    public static int productoEscalar(int[] array1, int[] array2) {
        int producto = 0;
        for (int i = 0; i < array1.length; i++) {
            producto += array1[i] * array2[i];
        }
        return producto;
    }

    public static int[] invertirArray(int[] array) {
        int[] invertido = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            invertido[i] = array[array.length - 1 - i];
        }
        return invertido;
    }
    public static void invertirArrayP(int[] array) {
        for (int i = 0; i < array.length / 2; i++) { //Recorre el array hasta la mitad
            int temp = array[i]; // Guardamos el valor del elemento actual en una variable temporal
            array[i] = array[array.length - 1 - i];  // Sustituimos array[i] por su opuesto
            array[array.length - 1 - i] = temp; // El opuesto toma el valor original de array[i]

        }
    }
    public static boolean esCapicua(int[] array){
        for (int i=0; i < array.length /2; i++){ //recorremos la mitad del array para que podamos comparar
            if (array[i] != array.length -1 -i){ //si los numeros opuestos son diferentes no es capicua asi que devolveremos falso
                return false; //porque si los numeros son diferentes no es capicua
            }
        }
    return true;
    }

}
