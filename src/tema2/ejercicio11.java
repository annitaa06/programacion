import java.util.Scanner;

public class ejercicio11 {
    public static void main(String[] args) {
        //iniciar nuevo scanner
        Scanner sc =new Scanner(System.in);
        //pedir datos
        System.out.println("escribe tres numeros para decir si son consecutivos");

        //leer datos
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        //hacer las operaciones

        if (num1 < num2 && num2 < num3){
            System.out.println("son consecutivos");
        }
        else {
            System.out.println("no son consecutivos");
        }
        //mostrar resultado
    }
}
