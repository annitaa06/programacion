package bucles;
import java.util.Scanner;
public class ejercicio23 {
    public static void main(String[] args) {
        int Sumanum = 0;
        int divisioncont = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce numeros enteros positivos para calcular la media,en el momento que se introduzca un negativo, se calculara la media de los positivos");


        while (true){
            int valorU = scanner.nextInt();
            if (valorU < 0){

                break;

            }
            else {

                Sumanum = Sumanum + valorU;
                divisioncont = divisioncont + 1;


            }

        }

        System.out.println("La media es " + (Sumanum / divisioncont));
        
    }

}