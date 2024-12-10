package tema3;

import java.util.Scanner;

public class ejer3 {
    public static void main(String[] args) {
        System.out.println("dime un radio para calcular el area y el perimetro");
        Scanner sc =new Scanner(System.in);
        double radius = sc.nextDouble();
        boolean radio = false;

        radio=validRadius(radius);

        while (!radio){
            radius= sc.nextDouble();
            radio=validRadius(radius);

        }
        double perimetro=calculateCirclePerimeter(radius);
        double area=calculateCircleArea(radius);

        System.out.println("el perimetro del circulo es "+ perimetro);
        System.out.println("el area del circulo es "+ area);


    }
    public static boolean validRadius(double radius) {
        if (radius > 0) {
            return true;
        }
        else {
            System.out.println("no es un radio valido");
            return false;

        }

    }
    public static double calculateCirclePerimeter(double radius){
        return 2*Math.PI*radius;
    }
    public static double calculateCircleArea(double radius){
        return Math.PI*(radius*radius);
    }

}
