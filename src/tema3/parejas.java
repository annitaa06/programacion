package tema3.arrays;

import java.util.*;

public class parejas {
    public static void main(String[] args) {


        String[] animales={
                "Perro","Perro", "Gato", "Gato",
                "Zorro", "Zorro", "Pinguino", "Pinguino",
                "León", "León", "Zebra","Zebra",
                "Pez", "Pez", "Pajaro", "Pajaro",
                "Lobo", "Lobo", "Jirafa", "Jirafa",

        };
        //Mezlar el array
        Collections.shuffle(Arrays.asList(animales));

        //creamos el array que sera visible
        boolean[] visibles=new boolean[20];
        Scanner sc =new Scanner(System.in);

        while (!terminado(visibles)){
            //mostramos el tablero
            mostrarTablero(animales,visibles);

            //preguntar al usuario posiciones
            System.out.println("Elije la primera posicion (un numero del 0 al 19): ");
            int p1 = sc.nextInt();
            System.out.println("Elije la segunda posicion (un numero del 0 al 19): ");
            int p2=sc.nextInt();

            //si la posicion 1 es menor a cero y la p2 es mayor a 19 o marca la misma posicion dice que no es valido
            if (p1 < 0 || p2 > 19 || p1 == p2) {
                System.out.println("Entrada no válida. Asegúrate de elegir dos posiciones diferentes y válidas.");

            }
                //se muestra la eleccion del usuario
                visibles[p1]=true;
                visibles[p2] = true;
                mostrarTablero(animales,visibles);

                //si son iguales la pareja se queda
                if (animales[p1].equals(animales[p2])){
                 System.out.println("HAS ENCONTRADO LA PAREJA!!");
            }

                else {
                System.out.println("la pareja no es igual :( , vuelvelo a intentar! tu puedes!");

                //ocultar otra vez las posiciones
                    visibles[p1]=false;
                    visibles[p2]=false;

                }

        }

        System.out.println("ENHORABUENAA! has encontrado TODAS las parejas!");


    }
    //funcion para comprobar si estan todas las parejas
    public static boolean terminado(boolean[] visibles){
        for (int i =0; i < visibles.length; i++){
            if (!visibles[i]){
                return false;
            }
        }
        return true;
    }

    //funcion para mostrar el tablero recorre todo el array y si es visible muestra el animal si no muestra
    public static void mostrarTablero(String [] animales, boolean[] visibles){
        for (int i=0; i< animales.length; i++){
            if (visibles[i]) System.out.print(animales[i]+" ");
            else System.out.print("[?]");
        }
        System.out.println();
    }


}
