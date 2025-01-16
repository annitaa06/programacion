package tema3.matrices;

import java.util.Arrays;
import java.util.Scanner;

public class MyMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] mRepetir={
                {1, 2, 1},
                {1, 2, 2},
                {3, 4, 3}
        };
        int [][] mVacia =new int[3][3];

        System.out.println("1. Imprimir la matriz");
        System.out.println("2. Obtener valor maximo");
        System.out.println("3. Obtener valor minimo");
        System.out.println("4. Obtener media ");
        System.out.println("5. Verificar si un numero existe o no");
        System.out.println("6. Verificar si algun numero se repite");
        System.out.println("7. Sumar arrays");
        System.out.println("8. Restar arrays");
        System.out.println("9. Verificar matriz unidad");
        int valorU = sc.nextInt();

        switch (valorU) {
            case 1:
                System.out.println("la matriz es ");
                imprimirArray(matriz);
                break;
            case 2:
                System.out.println("el maximo es " + maximo(matriz));

                break;
            case  3:
                System.out.println("el minimo es: "+ minimo(matriz));
              break;
            case 4:
                System.out.println("la media es " + media(matriz));
                break;
            case 5:
                System.out.println("dime un numero para verificar si esta");
                int numero= sc.nextInt();
                if (verificarExistencia(matriz,numero)){
                    System.out.println("el numero existe");
                }else {
                    System.out.println("el numero NO existe");
                }
                break;
            case 6:
                System.out.println("dime un numero para ver si se repite");
                int num= sc.nextInt();
                System.out.println("el numero se repite " + repetirNumero(mRepetir, num) + " veces");
                break;
            case 7:
                System.out.println("la suma es " + Arrays.deepToString(sumar(mRepetir, matriz, mVacia)));
                break;
            case 8:
                System.out.println("la resta es " + restar(mRepetir, matriz,mVacia));
                break;
            case 9:
                if (esMatrizUnidad(matriz)){
                    System.out.println("es matriz unidad");
                }else {
                    System.out.println("NO es matriz unidad");
                }
                break;
            default:
                System.out.println("opcion no valida");
        }
    }

    public static void imprimirArray(int[][] matriz) {
        //recorrer fila por fila
        for (int i = 0; i < matriz.length; i++) {
            //cada elemento
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int maximo(int[][] matriz) {
        int max = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (max < matriz[i][j]) {
                    max = matriz[i][j];
                }
            }
        }
        return max;
    }

    public static int minimo(int[][] matriz) {
        int min = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (min > matriz[i][j]) {
                    min = matriz[i][j];
                }
            }
        }
        return min;
    }
    public static int media (int[][] matriz){
        int suma =0;
        int cont=0;
        for ( int i =0; i< matriz.length; i++){
            for (int j= 0; j< matriz[i].length;j++){
                suma = suma + matriz[i][j];
                cont++;
            }
        }
        return suma/cont;
    }
    public static boolean verificarExistencia(int [][] matriz, int numero){
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                if (matriz[i][j] == numero) {
                    return true;
                }
            }
        }
        return false;
    }
    public static int repetirNumero (int [][] mRepetir, int num){
        int contador=0;
    for (int i =0; i< mRepetir.length;i++){
        for (int j=0;j<mRepetir[i].length; j++){
            if (mRepetir[i][j]==num){
                contador++;
            }
        }
    }
    return contador;
    }
    public static int[][] sumar (int [][] mRepetir, int[][] matriz, int[][] mVacia ){

        for (int i =0; i< mRepetir.length;i++){
            for (int j=0;j<mRepetir[i].length; j++){
                mVacia[i][j]= (matriz[i][j]+ mRepetir[i][j]);
            }
        }
        return mVacia;
    }
    public static int[][] restar (int [][] mRepetir, int[][] matriz, int[][] mVacia ){

        for (int i =0; i< mRepetir.length;i++){
            for (int j=0;j<mRepetir[i].length; j++){
                mVacia[i][j]= (matriz[i][j]+ mRepetir[i][j]);
            }
        }
        return mVacia;
    }
    public static boolean esMatrizUnidad(int[][] matriz) {
        if (matriz.length != matriz[0].length) { //  es cuadrada
            return false;
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == j && matriz[i][j] != 1) { // diagonal principal
                    return false;
                }
                if (i != j && matriz[i][j] != 0) { //  el resto sean ceros
                    return false;
                }
            }
        }
        return true;
    }

}

