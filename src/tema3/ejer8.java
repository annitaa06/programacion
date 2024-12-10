package tema3;

import java.util.Scanner;

public class ejer8 {
    public static void main(String[] args) {
        if (esFechaValida()) {
            System.out.println("La fecha es válida");
        } else {
            System.out.println("La fecha NO es válida");
        }
    }

    public static boolean esFechaValida() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un día:");
        int dia = sc.nextInt();

        System.out.println("Introduce un mes:");
        int mes = sc.nextInt();

        System.out.println("Introduce un año:");
        int ano = sc.nextInt();



        if (mes < 1 || mes > 12) {
            return false;
        }

        // Calcular días máximos del mes
        int diasEnMes = 0;
        switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12:
                diasEnMes = 31;
                break;
            case 4, 6, 9, 11:
                diasEnMes = 30;
                break;
            case 2:
                // Comprobar si el año es bisiesto
                if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
                    diasEnMes = 29;
                } else {
                    diasEnMes = 28;
                }
                break;
            default:
                return false; // Mes inválido
        }

        // Validar día
        return dia >= 1 && dia <= diasEnMes;
    }
}
