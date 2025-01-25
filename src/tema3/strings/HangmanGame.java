package tema3.strings;
//3. Realiza el juego del ahorcado en una clase llamada HangmanGame. Pedirá
//una palabra a un primer usuario, se borrará de consola. Y al segundo usuario
//se le preguntan letras hasta que decida resolver. Tendrá 6 intentos que irán
//dibujando al “ahorcado”.
//o

import java.util.Scanner;

/// |\
/// \
public class HangmanGame {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String palabra=pedirPalabra(sc);
        jugar(sc, palabra);
    }

    public static String pedirPalabra(Scanner sc){
        System.out.println("JUGADOR 1: INTRODUCE LA PALABRA QUE VA A ADIVINAR EL J2");
        String palabra= sc.nextLine().toLowerCase(); //pedir la palabra y pasar a minusculas
        return palabra;
    }
    public static void jugar(Scanner sc, String palabra){
        char[] progreso =new char[palabra.length()];
        for (int i =0; i< progreso.length; i++){
            progreso[i]= '_'; //por cada letra una _
        }
        int intentos =6;
        while (intentos>0 && !adivinada(progreso)){
            System.out.println("palabra: " + String.valueOf(progreso));
            System.out.println("intentos: " + intentos);

            System.out.println("JUGADOR 2: introduce una letra: ");
            char letra= sc.nextLine().toLowerCase().charAt(0);

            //si la letra no esta en la palabra se restan los intentos
            if (!actualizarProg(palabra,progreso,letra)){
                intentos--;

            }

        }
        if (adivinada(progreso)){
            System.out.println("HAS ADIVINADO LA PALABRA, EFECTIVAMENTE ERA: " + palabra);
        }else{
            System.out.println("ohh ya NO QUEDAN INTENTOS. la palabra era " + palabra);
        }

    }
    public static boolean adivinada(char[] progreso){
        boolean completa =true; //la palabra esta adivinada

        int i = 0;
        while (i < progreso.length){
            if (progreso[i]== '_'){
                completa=false;
            }
            i++;
        }
        return completa;
    }

    public static boolean actualizarProg(String palabra, char[]progreso, char letra){
        boolean acierto= false; //verifiamos que esta la letra en la palabra
        for (int i =0; i< palabra.length(); i++){
            if (palabra.charAt(i)==letra){ //si la letra cincide con la posicion
                progreso[i]= letra; //actualizamis el progreso y la letra en la posicion
                acierto=true;

            }
        }
        return acierto;
    }
}

