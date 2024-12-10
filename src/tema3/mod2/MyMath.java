package tema3.mod2;

import java.util.Scanner;

import static tema3.ejer7.esPrimo;

public class MyMath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Perimetro de un cuadrado");
        System.out.println("2. area de un cuadrado");
        System.out.println("3. perimetro de un rectangulo");
        System.out.println("4. area de un rectangulo");
        System.out.println("5. perimetro de un circulo");
        System.out.println("6. area de un circulo");
        System.out.println("7. Calcular numero primo");
        System.out.println("8. Decir si un numero no es primo");
        System.out.println("9. contar cifras de un numero entero");
        System.out.println("10. numero de dígitos pares de un número entero");
        System.out.println("11. numero de dígitos impares de un número entero");
        System.out.println("12. Factorial de un numero");
        System.out.println("13. Factorial de manera recursiva");
        System.out.println("14. Soluciones de ecuacion");
        System.out.println("15. Sumar cifras de numeros");
        int valorU = sc.nextInt();

        switch (valorU){
            case 1:{
                System.out.println("para calcular el perimetro del cuadrado, dime el lado del cuadrado");
                double lado= sc.nextDouble();
                //lamar funcion
                System.out.println("perimetro: " + squarePerimeter(lado));
            //case 1
            }
            break;
            case 2:{
                System.out.println("para calcular el area del cuadrado, dime el lado del cuadrado");
                double ladoCuadrado= sc.nextDouble();
                //lamar funcion

                System.out.println("perimetro: " + squareArea(ladoCuadrado));
            }
            break;
            case 3:{
                System.out.println("para calcular el perimetro de un rectangulo, dime la base");
                double baseRect = sc.nextDouble();
                System.out.println("dime la altura del rectangulo");
                double alturaRect = sc.nextDouble();

                System.out.println("perimetro " + rectanglePerimeter( baseRect, alturaRect ));
            }
            break;
            case 4:{
                System.out.println("para calcular el area de un rectangulo, dime el largo ");
                double largoRect = sc.nextDouble();
                System.out.println("dime la anchura del rectangulo");
                double anchRect = sc.nextDouble();

                System.out.println("area del rectangulo " + rectangleArea(largoRect, anchRect));
            }
            break;
            case 5:{
                System.out.println("para calcular el perimetro de un circulo, dime el radio ");
                double radCirculo = sc.nextDouble();

                System.out.println("perimetro del circulo " + circlePerimeter( radCirculo));
            }
            break;
            case 6:{
                System.out.println("para calcular el area del circulo dime el radio ");
                double radioCir =sc.nextDouble();
                System.out.println("area del circulo: " + circleArea(radioCir));
            }
            break;
            case 7:{
                System.out.println("para saber si un numero es primo, inserta el numero");
               int numero =sc.nextInt();
                if (numero < 0) {
                    System.out.println("Por favor, introduce un número positivo.");
                } else if (esPrimo(numero)) {
                    System.out.println(numero + " es un número primo.");
                } else {
                    System.out.println(numero + " no es un número primo.");
                }
            }
            break;

            case 8: {
                System.out.println("Para verificar si un número NO es primo, introduce el número:");
                int numero = sc.nextInt();
                if (numero < 0) {
                    System.out.println("Por favor, introduce un número positivo.");
                } else if (noEsPrimo(numero)) {
                        System.out.println(numero + " NO es un número primo.");
                } else {
                    System.out.println(numero + " es un número primo.");
                }

                }
                break;
            case 9: {
                System.out.println("dime un numero entero para contar sus cifras");
                int numUsuCifras = sc.nextInt();
                System.out.println("el numero tiene " +contarCifrasEnteras(numUsuCifras)+ " cifras");
            }
            break;
            case 10:{
                System.out.println("para calcular el número de digitos introduce un numero par entero");
                int numParUsu =sc.nextInt();

                System.out.println("el numero tiene " +contarCifrasEnterasPares(numParUsu)+ " cifras");
            }
            break;
            case 11:{
                System.out.println("para calcular el número de digitos introduce un numero impar entero");
                int numUsuCifrasImpar =sc.nextInt();

                System.out.println("el numero tiene " +contarCifrasEnterasImpares(numUsuCifrasImpar)+ " cifras");
            }
            break;
            case 12:{
                System.out.println("para calcular el factorial del numero, introduce el numero entero");
                int num = sc.nextInt();

                System.out.println("el factorial es: " + Factorial(num));

            }
            break;
            case 13:{
                System.out.println("para calcular el factorial de manera recursiva, introduce un numero entero");
                int num =sc.nextInt();
                System.out.println("el factorial es " + factorialRecursivo(num));
            }
            break;
            case 14:{
                System.out.println("introduce un numero a");
                double a =sc.nextDouble();
                System.out.println("introduce un numero b");
                double b =sc.nextDouble();
                System.out.println("introduce un numero c");
                double c =sc.nextDouble();
                System.out.println("tiene " +NumSoluciones(a,b,c)+ " soluciones");
            }
            case 15:{
                System.out.println("introduce un numero para contar sus cifras");
                int numUsu =sc.nextInt();
                System.out.println("el numero tiene"+ SumDigitos(numUsu) +" cifras" );
            }

            default:
                System.out.println("ese caracter/numero no es valido");
        //switch
        }
    //main
    }
public static double squarePerimeter(double lado){
        //calcular el perimetro con return y despues llamarlo en el switch del main
        return lado*4;

        }
    public static double squareArea(double ladoCuadrado){
        return ladoCuadrado*ladoCuadrado;

    }

    public static double rectanglePerimeter(double baseRect, double alturaRect ){
      return baseRect + baseRect + alturaRect + alturaRect;

    }
    public static double rectangleArea(double largoRect, double anchRect){
        return largoRect*anchRect;
    }

    public static double circlePerimeter(double radCirculo){
        return 2*3.14*radCirculo;
    }
    public static double circleArea( double radioCir){
        return 3.14*radioCir*radioCir;
    }

    public static boolean noEsPrimo(int numero){
        return !tema3.ejer7.esPrimo(numero);
        //return !noEsPrimo( numero);
    }

    public static int contarCifrasEnteras(int numUsuCifras){
        int contCifrasEnt =0;
        if (numUsuCifras ==0){
            return 0;
        }
        while (numUsuCifras > 0){
           numUsuCifras= numUsuCifras /10;
            contCifrasEnt ++;
        }

        return contCifrasEnt;
    }
    public static int contarCifrasEnterasPares(int numUsuCifrasPar){
        int contCifrasEnt =0;

        while (numUsuCifrasPar>0) {
            int digito = numUsuCifrasPar % 10;

            if (numUsuCifrasPar % 2 == 0) {
                contCifrasEnt++;
            }
            numUsuCifrasPar = numUsuCifrasPar / 10;
        }

        return contCifrasEnt;
    }
    public static int contarCifrasEnterasImpares(int numUsuCifrasImpar){
        int contCifrasImpar =0;


        while (numUsuCifrasImpar>0) {
            int digito = numUsuCifrasImpar % 10;

            if (digito % 2 != 0) {
                contCifrasImpar++;

            }
            numUsuCifrasImpar = numUsuCifrasImpar / 10;
        }

        return contCifrasImpar;
    }
    public static int Factorial(int num) {
     int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }
    public static int factorialRecursivo(int num) {
        if (num == 0 || num == 1) { // Caso base
            return 1;
        } else { // Llamada recursiva
            return num * Factorial(num - 1);
        }
    }


    public static int NumSoluciones(double a, double b, double c){
        int contSolu=0;
        double result= b*2-4*a*c;
        if (result >0){
            contSolu= 2;
        } else if (result==0) {
            contSolu= 1;

        }
        return contSolu;
    }
    public static int SumDigitos(int numUsu){
        int fin=0;
        while (numUsu>0){
            fin=fin +numUsu % 10;
            numUsu =numUsu/10;
        }
        return fin;

    }


}


