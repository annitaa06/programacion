package colecciones;

import java.util.HashSet;
import java.util.Scanner;

public class ListaCompra {
    private HashSet<String> productos; // Evita duplicados
    private HashSet<String> carrito;   // Nuevo set para el carrito de compras

    // Inicializa los sets
    public ListaCompra() {
        this.productos = new HashSet<>();
        this.carrito = new HashSet<>();
    }

    public HashSet<String> getProductos() {
        return productos;
    }

    public void setProductos(HashSet<String> productos) {
        this.productos = productos;
    }

    public HashSet<String> getCarrito() {
        return carrito;
    }

    public void setCarrito(HashSet<String> carrito) {
        this.carrito = carrito;
    }

    // Método para agregar un producto
    public void agregarProducto(String producto) {
        if (productos.contains(producto)) {
            System.out.println("El producto ya existe");
        } else {
            productos.add(producto);
            System.out.println(producto + " ha sido agregado");
        }
    }

    // Método para mostrar la lista de productos
    public void mostrarProductos() {
        System.out.println("Lista de la compra:");
        for (String producto : productos) {
            System.out.println("* " + producto);
        }
    }

    // Método para añadir productos al carrito
    public void anadirProductosCarro() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("que producto pones al carrito...");
        String producto = scanner.next().trim().toLowerCase(); // normalizar el texto

        if (!productos.contains(producto)) {
            System.out.println("el producto no está en la lista de compra.");
            return; // salir del método si no está en la lista
        }

        if (carrito.add(producto)) {
            System.out.println("producto añadido");
        } else {
            System.out.println("este producto ya está en el carrito");
        }
    }

    //metodo: productos.remove(carrito)

}
