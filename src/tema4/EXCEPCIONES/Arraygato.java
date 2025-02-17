package EXCEPCIONES;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Arraygato {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        List<Gato> Gatitos= new ArrayList<>();
        int gatoscreados = 1;
        while (gatoscreados <= 5){
            System.out.println("INTRODUCE LOS GATOS DEL GATO: "  + gatoscreados);
            System.out.println();
            System.out.println("EDAD...");
            int edadusu = scanner.nextInt();
            System.out.println("NOMBRE...");
            String nombreusu = scanner.next();

            try {
                Gato gato = new Gato(edadusu, nombreusu);
                gatoscreados++;
            }
            catch (Exception ex){
                System.out.println(ex.getMessage());
            }

        }

    }









}
