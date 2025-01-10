    package tema3.mod3;

import java.util.Scanner;

public class simulacroyo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce 1 si quieres aprobados suspendidos");
        System.out.println("introduce 2 si quieres billetes a madrid ");
        System.out.println("introduce 3 salir");
        int opcion = sc.nextInt();
        do {
            switch (opcion) {
                case 1: {
                    System.out.println("APROBADOS Y SUSPENDIDOS");
                    //LLAMAR FUUNCION
                    aprosusp();
                }
                break;
                case 2:{
                    billetesamadrid();
                }
            }
        } while (opcion !=3);

    }

    public static void aprosusp() {
        int suspendidos = 0;
        int aprobados = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("cuantas notas quieres");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("introduce la nota " + i);
            double nota = sc.nextDouble();
            if (nota < 5) {
                suspendidos++;
            } else if (nota >= 5) {
                aprobados++;
            }

        }
        if (aprobados > suspendidos) {
            System.out.println("hay mas aprobados que suspendidos");
        } else if (aprobados < suspendidos) {
            System.out.println("hay mas suspendidos que aprobados");
        } else {
            System.out.println("hay la misma cantidad");
        }
    }

    public static void billetesamadrid() {
        Scanner sc = new Scanner(System.in);
        System.out.println("cuantos miembros sois");
        int miembros = sc.nextInt();
        for (int i = 1; i <= miembros; i++) {
                System.out.println("introduce nombre del miembro " + i +":");
                String nombre = sc.nextLine();
                sc.nextLine();

            System.out.println("introduce tu edad "+ nombre);
            int edad = sc.nextInt();

            
            if (edad>=65){
                System.out.println(nombre + " tienes un 10%");
               double descuento10=0.10;
                System.out.println("se te quedan " + 32*descuento10);
                
            } else if (edad == 12 || edad == 13||edad == 14|| edad==15) {
                System.out.println(nombre +" tienes un 8%"); 
                double descuento8=0.08;
                System.out.println("se te quedan " + 32*descuento8);
                
            } else if (edad<11&& edad>=4) {
                System.out.println(nombre + "tienes un 35%");
                double descuento35= 0.35;
                System.out.println("se te queda un " +32 * descuento35 );

                
            } else if (edad <4) {
                System.out.println("entras gratis");

            }
            else {
                System.out.println("tu billete es normal 32€");
            }
        }

    }
}


