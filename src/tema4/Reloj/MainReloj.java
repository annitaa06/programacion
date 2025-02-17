   package tema4.Reloj;

import java.util.Scanner;

public class MainReloj {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //reloj usando const vacio
        Reloj reloj1 =new Reloj();

        //conf hora usando set
        System.out.println("introduce la hora para reloj1 (0-23)");
        reloj1.setHora(sc.nextInt());

        System.out.println("introduce los minutos para reloj1 (0-59)");
        reloj1.setMinuto(sc.nextInt());

        System.out.println("introduce los segundos para reloj1 (0-23)");
        reloj1.setSegundo(sc.nextInt());


        //mostrar hora
        System.out.println("hora configurada para reloj 1: ");
        reloj1.mostrarHora();

        //reloj usando parametros
        Reloj reloj2 = new Reloj(10, 30, 45);
        System.out.println("hora inicial reloj 2:");
        reloj2.mostrarHora();
    }
}
