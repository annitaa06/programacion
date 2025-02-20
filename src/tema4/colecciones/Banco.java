package colecciones;

import colecciones.gimnasio.Usuario;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Banco banco=new Banco();
        //ArrayList banco2 = ArrayList<Usuario>;

        System.out.println("ELIJE UNA OPCIOM");
        System.out.println("1. añadir usuario ");
        System.out.println("2. atender usuario");
        System.out.println("3. quitar usuario de la cola");
        System.out.println("4. mostrar cola");

        int valorU = sc.nextInt();

        switch (valorU){
            case 1:
                System.out.println("nombre:");
                String nombre = sc.nextLine();
                System.out.println("edad:");
               int edad = sc.nextInt();
                System.out.println("dni:");
                String dni =sc.nextLine();
                //banco2.addLast(new UsuarioBanco(nombre, edad, dni));
                banco.anadirUsuario(new UsuarioBanco(nombre,edad,dni)); //crea un nuevo objeto
                break;
            case 2:
                banco.atenderUsuario();
                break;
            case 3:
                System.out.println("introduce el dni del usuario para eliminarlo");
                dni = sc.nextLine();
                break;
            case 4:
                banco.mostrarCola();
                break;
            case 5:
                System.out.println("saliendo");
            default:
                System.out.println("opcion no valida");
        }
    }


    private Queue<UsuarioBanco> cola = new LinkedList<>();


    public void anadirUsuario(UsuarioBanco usuario) {
        cola.add(usuario);
        System.out.println("usuario AÑADIDO con exito");
    }

    //ELIMINAR USUARIO
    public void atenderUsuario() {
        if (!cola.isEmpty()) {
            UsuarioBanco atendido = cola.poll(); // poll() saca el primero
            System.out.println(" Se atendió a: " + atendido.getNombre());
        } else {
            System.out.println(" No hay nadie en la cola.");
        }
    }

    public void quitarUsuario(String dni) {
        for (UsuarioBanco u : cola) { // U VARIABLE TEMPORAL
            if (u.getDni().equals(dni)) {
                cola.remove(u);
                System.out.println("usuario ELIMINADO");
                return;
            }
        }
        System.out.println("NO se enconto al usuario");
    }

    public void mostrarCola() {
        if (cola.isEmpty()) {
            System.out.println("La cola está vacía.");
        } else {
            System.out.println(" Cola actual:");
            for (UsuarioBanco u : cola) {
                u.mostrarDatos();
            }
        }
    }

}
