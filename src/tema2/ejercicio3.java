import java.util.Scanner;

public class ejercicio3 {
    public static void main (String [] args){

        // iniciar el escanner

        Scanner sc = new Scanner(System.in);

        // pedir datos al usuario
        System.out.println("escribe la base del triangulo");
        double base = sc.nextDouble();

        System.out.println("escribe la altura del triangulo");
        double altura = sc.nextDouble();

        // definir variables

        double superficie = (base* altura )/2;

        //mostrar resultados
        System.out.println("la superficie del triangulo es = " + superficie);


    }
}
