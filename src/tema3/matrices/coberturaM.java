package tema3.matrices;

import java.util.Scanner;

    public class coberturaM {

        public static void main(String[] args) {
            // dimensiones del hotel
            int plantas = 12;
            int habitaciones = 5;
            int[] hotel = new int[plantas * habitaciones];

            // pedir datos al usuario
            int[] datos = pedirDatos();
            int x = datos[0] - 1; // indice de planta (0-11)
            int y = datos[1] - 1; // indice de habitación (0-4)
            int potencia = datos[2];


            calcularCobertura(hotel, plantas, habitaciones, x, y, potencia);


            mostrarHotel(hotel, plantas, habitaciones);
        }

        public static int[] pedirDatos() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Planta del router (1-12): ");
            int x = scanner.nextInt();
            System.out.print("Habitación del router (1-5): ");
            int y = scanner.nextInt();
            System.out.print("Potencia del router (1-3): ");
            int potencia = scanner.nextInt();
            return new int[]{x, y, potencia};
        }

        public static void calcularCobertura(int[] hotel, int plantas, int habitaciones, int x, int y, int potencia) {
            for (int i = 0; i < plantas; i++) {
                for (int j = 0; j < habitaciones; j++) {
                    // calcular la distancia entre el router y la habitación
                    int distancia = 0;

                    // distancia en planta
                    if (x > i) {
                        distancia += x - i;
                    } else {
                        distancia += i - x;
                    }

                    // distancia en habitación
                    if (y > j) {
                        distancia += y - j;
                    } else {
                        distancia += j - y;
                    }

                    // asignar cobertura según la distancia
                    if (distancia <= potencia) {
                        hotel[i * habitaciones + j] = potencia - distancia;
                    } else {
                        hotel[i * habitaciones + j] = 0;
                    }
                }
            }
        }

        public static void mostrarHotel(int[] hotel, int plantas, int habitaciones) {
            for (int i = 0; i < plantas; i++) {
                for (int j = 0; j < habitaciones; j++) {
                    System.out.print(hotel[i * habitaciones + j] + " ");
                }
                System.out.println();
            }
        }
    }


