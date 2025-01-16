package tema3.arrays;

import java.util.Scanner;

public class cobertura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] hotel = new int[20]; //creacion de array de 20


        System.out.println("Introduce el numero de la habitacion del 1 al 20");
        int habitacion = sc.nextInt() - 1; //restamos 1 pq la posicion del array empieza en 0

        System.out.println("ingresa la potencia del router del 1 al 6");
        int potencia = sc.nextInt();

        //calcular la señal de cada habitacion
        for (int i = 0; i < 20; i++) { //recorrer el array
            int distancia = Math.abs(i - habitacion); //calcula la distancia al ruter siempre con valor positivo
            if (distancia < potencia) {
                hotel[i] = potencia - distancia; //asigna la señal que corresponde

            }
        }

        System.out.println("la cobertura es ");
        for (int i = 0; i < 20; i++) {
            System.out.print(hotel[i] + " ");
        }
    }
}
