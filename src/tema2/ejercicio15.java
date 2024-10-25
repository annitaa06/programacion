import java.util.Scanner;

public class ejercicio15 {
    public static void main(String[] args) {
        //nuevo scaner
        Scanner sc =new Scanner(System.in);
        //pedir datos
        System.out.println("escribe el numero de un mes");
        //leer datos con sc
        int mes = sc.nextInt();

        System.out.println("escribe el año");
        //leer datos con sc
        int anio = sc.nextInt();
        int dias;
        //hacer operaciones
        if (mes == 2) {
            // Verificamos si es un año bisiesto si es asi tendra 29 dias
            if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
                dias = 29;
            } else {
                dias = 28;
            }
            //si nos pone el mes 4 6 9 11 tendra 30 dias el mes
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            dias = 30;
            //si no solo nos queda la opcion
        } else {
            dias = 31;
        }

        System.out.println("El mes tiene " + dias + " días.");
        // mostrar resultado

        //cerrar escaner
        sc.close();
    }
}
