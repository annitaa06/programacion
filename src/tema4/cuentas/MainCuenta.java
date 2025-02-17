package cuentas;

import java.util.Scanner;

public class MainCuenta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PersonaC persona = null; //almacenamos la persona aqui
        int opcion;
        do {
            System.out.println("--MENU--");
            System.out.println("1-Crear persona");
            System.out.println("2-Crear cuenta");
            System.out.println("3-Mostrar persona");
            System.out.println("4-Recibir dinero");
            System.out.println("5-Pagar");
            System.out.println("6-SALIR");
            System.out.println("ELIGE UNA OPCION");
            opcion = sc.nextInt();

            switch (opcion) {
                //opciones del menu
                case 1: {//crear persona
                    System.out.println("INTRODUCE TU DNI: ");
                    String dni = sc.nextLine();
                    String basura =sc.nextLine();
                    persona = new PersonaC(dni);
                    System.out.println("persona creada con exito");
                }
                case 2: {
                    if (persona==null){
                        System.out.println("crea la persona primero");

                    }
                    System.out.println("numero de cuenta: ");
                    String numCuenta = sc.nextLine();
                    System.out.println("saldo inicial: ");
                    double saldo= sc.nextDouble();

                    Cuenta nuevaCuenta =new Cuenta(numCuenta,saldo);

                    if (persona.agregarCuenta(nuevaCuenta)){
                        System.out.println("cuenta añadida");
                    }else {
                        System.out.println("maximo 3 cuentas por persona");
                    }

                    break;}

                case 3:
                    //recibir dinero
                    if (persona==null){
                        System.out.println("todavia no has creado la persona");

                    }
                    System.out.println(persona);
                    break;
                case 4:
                    System.out.println("cuenta donde recibir el dinero");
                    String cuentaRecibir= sc.nextLine();

                    System.out.println("monto:");
                    double montoRecibir=sc.nextDouble();

                    Cuenta cuenta1=persona.buscarCuenta(cuentaRecibir);
                    if (cuenta1 != null){
                        cuenta1.recibirAbono(montoRecibir);
                        System.out.println("dinero recibido");
                    }else {
                        System.out.println("cuentra NO encontrada");

                    }
                    break;

                case 5:
                    //pagar
                    if (persona == null) {
                        System.out.println("Primero crea una persona.");
                        break;
                    }
                    System.out.print("Cuenta desde donde pagar: ");
                    String cuentaPago = sc.nextLine();
                    System.out.print("Monto a pagar: ");
                    double montoPago = sc.nextDouble();

                    Cuenta cuenta2 = persona.buscarCuenta(cuentaPago);
                    if (cuenta2 != null) {
                        if (cuenta2.pagarRecibo(montoPago)) {
                            System.out.println("Pago realizado.");
                        } else {
                            System.out.println("Saldo insuficiente.");
                        }
                    } else {
                        System.out.println("Cuenta no encontrada.");
                    }
                    break;

                case 6:
                    // Salir
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 6);

        sc.close();
    }
}
