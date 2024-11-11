package bucles;
import java.util.Scanner;
public class ejercicio24 {
    public static void main(String[] args) {


    int Aprovados = 0;
    int Suspendidos = 0;
    boolean entrar =true;

    Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce las notas, para calcular la cantidad de suspendidos y aprovados introduce un 20");


      while (entrar=true) {

        double valorU = scanner.nextDouble();

        if (valorU == 20){

            System.out.println("La cantidad de aprovados es: " + Aprovados + " y la cantidad de suspendidos es: " + Suspendidos);

            entrar=false; }

        else if (valorU < 0 || valorU > 10) {

            System.out.println("Introduce una nota válida");

        }

        else if (valorU >= 5){

            Aprovados++;

        }
        else {

            Suspendidos++;

        }
    }


}
}

