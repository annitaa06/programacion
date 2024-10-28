import java.util.Scanner;

public class ejercicio17 {
    public static void main(String[] args) {
        double superficie, perimetro;

        //iniciar nuevo scanner
        Scanner sc = new Scanner(System.in);

        //pedir datos
        System.out.println("Introduce un 0 para calcular la superficie y el perimetro de un cuadrado");
        System.out.println("Introduce un 1 para calcular la superficie y el perimetro de un rectangulo");
        System.out.println("Introduce un 2 para calcular la superficie y el perimetro de un triangulo");

        //leer datos
        int valorU = sc.nextInt();

        //hacer operaciones
         // Condición corregida
            switch (valorU) {
                case 0 -> {
                    System.out.println("Introduce el lado del cuadrado para calcular");
                    double lado = sc.nextDouble();
                    perimetro = lado * 4;
                    superficie = Math.pow(lado, 2);
                    System.out.println("El perimetro es " + perimetro + " y la superficie es " + superficie);
                }
                case 1 -> {
                    System.out.println("Introduce el ancho del rectangulo para calcular");
                    double ancho = sc.nextDouble();
                    System.out.println("Introduce el largo del rectangulo para calcular");
                    double largo = sc.nextDouble();
                    superficie = largo * ancho;
                    perimetro = (largo * 2) + (ancho * 2);
                    System.out.println("El perimetro es " + perimetro + " y la superficie es " + superficie);
                }
                case 2 -> {
                    System.out.println("Introduce la base del triangulo para calcular");
                    double base = sc.nextDouble();
                    System.out.println("Introduce la altura del triangulo para calcular");
                    double altura = sc.nextDouble();
                    superficie = (base * altura) / 2; // Cálculo correcto para superficie de triángulo
                    System.out.println("La superficie del triangulo es " + superficie);
                }
                default -> System.out.println("No has escrito un valor valido");
            }

        }
    }



