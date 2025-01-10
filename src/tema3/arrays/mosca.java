package tema3.arrays;

import java.util.Scanner;

public class mosca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int posicionMosca=generarPosicion(); //generar poicion mosca
        int eleccionJugador = 0;

        System.out.println("¡Bienvenido! Intenta encontrar a la mosca.");

        while (eleccionJugador != posicionMosca) { //sigue preguntanfo hasta que wl numero del usuario sea correcto
            eleccionJugador= pedirPosicion(sc);


            if (correcto (eleccionJugador, posicionMosca)) {
                System.out.println("Has encontrado la mosca!!");
            }
            else if (adyacente(eleccionJugador, posicionMosca)){
                System.out.println("Has estado cerca y has asustado a la mosca asi que se ha movido de posicion");
                posicionMosca = generarPosicion(); // Nueva posición

            }else {
                System.out.println("Has fallado, la mosca se mantiene en su lugar, no la has asustado.");

            }
        }


    }
    public static int generarPosicion(){
        return (int) (Math.random()*15+1);
    }
    public static int pedirPosicion (Scanner sc){
        System.out.print("Elige una posición (1 a 15): ");
        return sc.nextInt();

    }
    public static boolean correcto (int posJugador, int posMosca){
        return posJugador==posMosca;
    }
    public static boolean adyacente (int posJugador, int posMosca){
        return Math.abs(posJugador - posMosca)==1;
    }
}