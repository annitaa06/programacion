package tema3;

import java.util.Scanner;

public class ejer2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("dime tu edad");
        int age = sc.nextInt();

        if (isAdult(age))
            System.out.println("Eres mayor de edad");
        else {
            System.out.println("NO eres mayor de edad");
        }

    }
public static boolean isAdult(int age){
    return age >=18;
}

}


