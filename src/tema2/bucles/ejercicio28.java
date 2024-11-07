import java.util.Random;
import java.util.Scanner;

public class ejercicio28 {
    public static void main(String[] args) {
        int valorU;
      int contador=0;

        System.out.print("Introduce un numero para saber si has ganado la loteria, tienes 5 intentos");


        while (contador<5 ){
            Scanner sc = new Scanner(System.in);
            valorU = sc.nextInt();
        Random random = new Random();
        int randomInt = random.nextInt(99999);

        if (randomInt==valorU) {
            System.out.println("has ganado");
            contador++;
        }else{
            System.out.println("el numero no es correcto vuelve a intentarlo");
            contador++;
            }
        }
        System.out.println("seguro que a la proxima lo consigues");
        }
    }

