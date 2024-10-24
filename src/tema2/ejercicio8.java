import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        //iniciar escaner
        Scanner sc =new Scanner(System.in);
        //pedir datos al usuario
        System.out.println("escribe los euros para pasarlos a dolares");
        //leer variable
        double euros = sc.nextDouble();

        //mostrar resultado
        System.out.println("eso son = " + (euros*1.08) +" dolares");

    }
}
