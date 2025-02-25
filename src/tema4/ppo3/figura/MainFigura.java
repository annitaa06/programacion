package ppo3.figura;

import java.util.Scanner;

public class MainFigura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            // mostrar menú
            System.out.println("\nElige una figura:");
            System.out.println("1. Cuadrado");
            System.out.println("2. Rectángulo");
            System.out.println("3. Triángulo");
            System.out.println("4. Círculo");
            System.out.println("5. Salir");
            System.out.print("Opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1: // cuadrado
                    System.out.print("Introduce el lado del cuadrado: ");
                    double lado = scanner.nextDouble();
                    Cuadrado cuadrado = new Cuadrado(lado);
                    System.out.println(cuadrado.toString() + " - Área: " + cuadrado.area() + ", Perímetro: " + cuadrado.perimetro());
                    break;

                case 2: // rectángulo
                    System.out.print("Introduce la base del rectángulo: ");
                    double baseRect = scanner.nextDouble();
                    System.out.print("Introduce la altura del rectángulo: ");
                    double alturaRect = scanner.nextDouble();
                    Rectangulo rectangulo = new Rectangulo(baseRect, alturaRect);
                    System.out.println(rectangulo.toString() + " - Área: " + rectangulo.area() + ", Perímetro: " + rectangulo.perimetro());
                    break;

                case 3: // triángulo
                    System.out.print("Introduce la base del triángulo: ");
                    double baseTri = scanner.nextDouble();
                    System.out.print("Introduce la altura del triángulo: ");
                    double alturaTri = scanner.nextDouble();
                    System.out.print("Introduce el primer lado del triángulo: ");
                    double lado1 = scanner.nextDouble();
                    System.out.print("Introduce el segundo lado del triángulo: ");
                    double lado2 = scanner.nextDouble();
                    System.out.print("Introduce el tercer lado del triángulo: ");
                    double lado3 = scanner.nextDouble();
                    Triangulo triangulo = new Triangulo(baseTri, alturaTri, lado1, lado2, lado3);
                    System.out.println(triangulo.toString() + " - Área: " + triangulo.area() + ", Perímetro: " + triangulo.perimetro());
                    break;

                case 4: // círculo
                    System.out.print("Introduce el radio del círculo: ");
                    double radio = scanner.nextDouble();
                    Circulo circulo = new Circulo(radio);
                    System.out.println(circulo.toString() + " - Área: " + circulo.area() + ", Perímetro: " + circulo.perimetro());
                    break;

                case 5: // salir
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción no válida, intenta de nuevo.");
            }

        } while (opcion != 5);

        scanner.close();
    }
}

