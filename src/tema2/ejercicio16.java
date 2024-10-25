import java.util.Scanner;

public class ejercicio16 {
    public static void main(String[] args) {
        //nuevo scaner
        Scanner sc =new Scanner(System.in);
        //pedir datos
        System.out.println("escribe una D si quieres convertir de euros a dolares o escribe una E si quieres conventir de dolares a euros");
        //leer datos con sc
        char letraU = sc.next().charAt(0);

        System.out.println("escribe la cantidad que quieres convertir ");
        //leer datos con sc
        double valorU = sc.nextDouble();

        //Hacer operaciones

        if (letraU =='D' ){
            double resultado1 = (valorU * 1.08);
            System.out.println("en euros es " + resultado1);
        }
        else if( letraU =='E' ){
            double resultado2 = (valorU * 0.93);
            System.out.println("en dolares es " + resultado2);
        }
        else {
            System.out.println("el caracter no es valido");
        }

    }
}
