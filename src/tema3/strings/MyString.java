package tema3.strings;

import java.util.Scanner;

public class MyString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("a) invertir cadena y convertir a mayúsculas");
        System.out.println("b) Contar vocales");
        System.out.println("c) palabra mas larga");
        System.out.println("d) Buscar palabra ");
        System.out.println("e) Contar palabras");
        System.out.println("f) numero de telefono");
        String valorU = sc.nextLine();

        switch (valorU){
            //a) Una función que reciba una cadena y devuelva esta cadena
            //invertida y en mayúsculas.
            case "a":
                System.out.println("introduce una cadena:");
                String cadena = sc.nextLine(); //lee la cadena del usuario
                String resultado= invertirYmayus(cadena);
                System.out.println(" resultado: " + resultado);
                break;

                //b) Una función que reciba una cadena y devuelva el número de
            //vocales
            case "b":
                System.out.println("introduce una cadena:");
              String cadena2 = sc.nextLine(); //lee la cadena del usuario
                int numVocales= contarVocales(cadena2);
                System.out.println("la cadena tiene " + numVocales + " vocales");
                break;

          //  c) Una función que reciba una cadena y devuelva la palabra de mayor longitud.
            case "c":
                System.out.println("Introduce una cadena de texto");
                String cadena3 = sc.nextLine().trim();
                String palabraLarga= palabraLarga(cadena3);

                System.out.println("la palabra mas larga es " + palabraLarga);
                break;
           // d) Una función que reciba dos cadenas y devuelva el número de veces que la segunda cadena está incluida en la primera
            case "d":
                System.out.println("Introduce la primera cadena:");
                String cadena4 = sc.nextLine().trim();
                System.out.println("Introduce la segunda cadena:");
                String palabraABuscar = sc.nextLine().trim();
                int ocurrencias = buscarPalabra(cadena4, palabraABuscar);
                System.out.println("La palabra '" + palabraABuscar + "' aparece " + ocurrencias + " veces.");
                break;
          //  e) Una función que reciba una cadena y devuelva el número de palabras que contiene.
            case "e":
                System.out.println("introduce una cadena:");
                String cadena5 =sc.nextLine().trim();
                int numPalabras = contarPalabras(cadena5);
                System.out.println(" la cadena tiene "+ numPalabras + " palabras");
                break;

          //  f) Una función que reciba un número de teléfono, por ejemplo “34555332211” y lo convierta al formato (+34)-555-332211.
            case "f":
                System.out.println("introduce un numero de telefono ");
                String cadena6=sc.nextLine().trim();

                String telFormateado= formatearTelefono(cadena6);
                System.out.println(telFormateado);
                break;

          //  g) Un procedimiento que reciba una cadena y muestre por pantalla el histograma de frecuencias de las vocales (las veces que se repiten)
            case "g":
                System.out.println("introduce una cadena ");
                String cadena7=sc.nextLine().trim();
                mostrarHistograma(cadena7);
                break;



            default:
                System.out.println("Opción no válida.");


        }

    }
    //a
    public static String invertirYmayus(String cadena){
        String invertida=""; //aqui almacenara la palabra
        for (int i = cadena.length() -1; i >=0; i--){
            invertida += cadena.charAt(i);
        }
        return invertida.toUpperCase();
    }
    //B
    public static int contarVocales(String cadena2) {
        int contador = 0;
        for (int i = 0; i < cadena2.length(); i++) {
            char c = Character.toLowerCase(cadena2.charAt(i)); // convertimos a minúscula
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contador++; //aumentamos el contador si es vocal
            }
        }
        return contador; // Devolvemos el número de vocales
    }

    //C
    public static String  palabraLarga(String cadena3){
        String[] palabras = cadena3.split(" ");
        String palabraLarga = ""; //variable que almacena la mas larga

        //recorremos las palabras
        for (int i =0; i < palabras.length; i++){
            String palabra =palabras[i]; //cada palabra del array

            //comparamos
            if (palabra.length() > palabraLarga.length()){
                palabraLarga= palabra; //actualizar
            }
        }
        return palabraLarga;
    }
        //D
        public static int buscarPalabra(String cadena4, String palabraABuscar) {
            int contador = 0;
            String[] palabras = cadena4.split(" "); // Dividimos la cadena en palabras

            // Recorremos todas las palabras
            for (String palabra : palabras) {
                if (palabra.equalsIgnoreCase(palabraABuscar)) { // sin importar mayúsculas/minúsculas
                    contador++;
                }
            }
            return contador;
        }
        //E
        public static int contarPalabras(String cadena){
        String[] palabras =cadena.trim().split("\\s+"); // \\s+ cualquier espacio en blanco
        return palabras.length;
        }
        //F
        public static String formatearTelefono(String telefono){
        return "(+" + telefono.charAt(0) + telefono.charAt(1) + telefono.charAt(2) + ")" +
                "-" + telefono.charAt(3) + telefono.charAt(4) + telefono.charAt(5) +
                "-" + telefono.substring(6); // De la posición 6 hasta el final
        }
        //G
        public static void  mostrarHistograma(String cadena7){
        int a = 0, e=0,i=0,o=0,u=0;
        cadena7=cadena7.toLowerCase(); //minuscula

            for (int j =0; j< cadena7.length(); j++){
                char c = cadena7.charAt(j);
                if (c == 'a') a++;
                else if (c == 'e') e++;
                else if (c == 'i') i++;
                else if (c == 'o') o++;
                else if (c == 'u') u++;
            }
            System.out.println("Histograma de frecuencias de las vocales:");
            System.out.println("a " + a + " " + "*".repeat(a));
            System.out.println("e " + e + " " + "*".repeat(e));
            System.out.println("i " + i + " " + "*".repeat(i));
            System.out.println("o " + o + " " + "*".repeat(o));
            System.out.println("u " + u + " " + "*".repeat(u));
        }

}













