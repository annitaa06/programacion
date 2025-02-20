package colecciones;

import java.util.Scanner;

public class MainCompra {
    public static void main(String[] args) {
        boolean fin = false;
        ListaCompra lista = new ListaCompra();
        Scanner sc = new Scanner(System.in);

        //  Añadir productos a la lista de compra
        System.out.println("ESCRIBE AQUÍ LOS PRODUCTOS (para terminar escribe 'fin'):");
        while (!fin) {
            String producto = sc.nextLine().trim().toLowerCase();
            if (producto.equals("fin")) {
                fin = true;
            } else {
                lista.agregarProducto(producto);
            }
        }

        lista.mostrarProductos(); // Muestra la lista de productos añadidos

        //  Añadir productos al carrito
        fin = false;
        System.out.println("AHORA AÑADE PRODUCTOS AL CARRITO (para terminar escribe 'fin'):");
        while (!fin) {
            lista.anadirProductosCarro();

            if (sc.nextLine().trim().equalsIgnoreCase("fin")) {
                fin = true;
            }
        }

      //Mostrar los productos que están en el carrito
        System.out.println(" PRODUCTOS EN EL CARRITO:");
        for (String producto : lista.getCarrito()) {
            System.out.println("* " + producto);
        }

        //llamar método productos que te faltan por comprar
    }
}

