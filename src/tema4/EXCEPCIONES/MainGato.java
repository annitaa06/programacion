package EXCEPCIONES;

import java.util.Scanner;

public class MainGato {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        boolean compwhile = false;
        Gato[] gatos = new Gato[20];

        while (!compwhile) {
            System.out.println("CREAR GATO --> 1 CONSULTAR GATOS --> 2 SALIR --> 3");
            int elecusu = scanner.nextInt();

            switch (elecusu) {
                case 1: {
                    try {
                        creargato(gatos);
                    } catch (Exception ex) {
                        System.out.println(ex.getMessage());
                    }
                    break;
                }
                case 2: {
                    consultargatos(gatos);
                    break;
                }
                case 3: {
                    compwhile = true;
                    break;
                }
                default:
                    System.out.println("OPCIÓN NO VÁLIDA");
            }
        }

    }

    public static void creargato(Gato[] gatos) throws Exception {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < gatos.length; i++) {
            if (gatos[i] == null) {
                System.out.println("EDAD");
                int edad = scanner.nextInt();
                System.out.println("NOMBRE");
                String nombre = scanner.next();
                Gato gato = new Gato(edad, nombre);
                gatos[i] = gato;
                i = 30;
            }
        }
    }

    public static void consultargatos(Gato[] gatos) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("INTRODUCE UNA POSICION PARA CONSULTAR EL GATO QUE HAY EN ELLA");
        int elecusu = scanner.nextInt();
        if (gatos[elecusu] != null) {
            System.out.println("NOMBRE: " + gatos[elecusu].getNombre());
            System.out.println("EDAD: " + gatos[elecusu].getEdad());
        } else System.out.println("ESTA POSICION ESTÁ VACIA");
    }


}
