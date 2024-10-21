import java.util.Scanner;

public class ejercicio1 {
    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("introduce el lado del cuadrado para mostrar la superficie y el perimetro");
        double lado = scanner.nextDouble();
        double superficie = lado*lado;
        double perimetro = lado+lado+lado+lado;
        System.out.println("la superficie del cuadrado es "+ superficie);
        System.out.println("el perimetro del cuadrado es "+ perimetro);


    }
}
