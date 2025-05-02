package tema7.JUEGUITO;


import java.util.*;
import java.io.*;

public class mainJ {
    private static List<Videojuego> ranking = new ArrayList<>(); // Lista para almacenar videojuegos

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Menú de opciones
            System.out.println("--- Ranking de Videojuegos ---");
            System.out.println("1. Añadir videojuego");
            System.out.println("2. Mostrar ranking");
            System.out.println("3. Guardar ranking");
            System.out.println("4. Cargar ranking");
            System.out.println("5. Eliminar videojuego");
            System.out.println("6. Exportar a texto");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer del scanner

            switch (opcion) {
                case 1:
                    añadirVideojuego(scanner);
                    break;
                case 2:
                    mostrarRanking();
                    break;
                case 3:
                    guardarRanking();
                    break;
                case 4:
                    cargarRanking();
                    break;
                case 5:
                    eliminarVideojuego(scanner);
                    break;
                case 6:
                    exportarATexto();
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    return;
                default:
                    System.out.println("Opción no válida, intenta de nuevo.");
            }
        }
    }

    // Método para añadir un videojuego (físico o digital)
    private static void añadirVideojuego(Scanner scanner) {
        System.out.print("¿Es un videojuego físico o digital? ( físico  digital): ");
        String tipo = scanner.nextLine();

        System.out.print("Introduce el título: ");
        String titulo = scanner.nextLine();

        System.out.print("Introduce la plataforma: ");
        String plataforma = scanner.nextLine();

        System.out.print("Introduce la nota (1-10): ");
        int nota = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer

        try {
            if (tipo.equalsIgnoreCase("físico")) {
                System.out.print("Introduce la tienda de compra: ");
                String tiendaCompra = scanner.nextLine();

                System.out.print("Introduce el estado (nuevo/usado): ");
                String estado = scanner.nextLine();

                VideojuegoFisico juegoFisico = new VideojuegoFisico(titulo, plataforma, nota, tiendaCompra, estado);
                ranking.add(juegoFisico);
            } else if (tipo.equalsIgnoreCase("digital")) {
                System.out.print("Introduce la tienda online: ");
                String tiendaOnline = scanner.nextLine();

                System.out.print("Introduce el tamaño en GB: ");
                double tamañoGB = scanner.nextDouble();
                scanner.nextLine(); // Limpiar buffer

                VideojuegoDigital juegoDigital = new VideojuegoDigital(titulo, plataforma, nota, tiendaOnline, tamañoGB);
                ranking.add(juegoDigital);
            } else {
                System.out.println("Tipo de videojuego no válido.");
            }
        } catch (NotaInvalidaException e) {
            System.out.println("Error al añadir el videojuego: " + e.getMessage());
        }
    }

    // Mostrar el ranking completo
    private static void mostrarRanking() {
        if (ranking.isEmpty()) {
            System.out.println("El ranking está vacío.");
        } else {
            for (Videojuego juego : ranking) {
                System.out.println(juego);
            }
        }
    }

    // Guardar el ranking en un archivo binario
    private static void guardarRanking() {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("JUEGUITO.dat"))) {
            out.writeObject(ranking);
            System.out.println("Ranking guardado en el archivo JUEGUITO.dat");
        } catch (IOException e) {
            System.out.println("Error al guardar el ranking: " + e.getMessage());
        }
    }

    // Cargar el ranking desde un archivo binario
    private static void cargarRanking() {
        File archivo = new File("JUEGUITO.dat");

        if (!archivo.exists() || archivo.length() == 0) {
            System.out.println("Archivo vacío o inexistente, no se carga nada.");
            return;
        }

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(archivo))) {
            ranking = (List<Videojuego>) in.readObject();
            System.out.println("Ranking cargado desde el archivo JUEGUITO.dat");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al cargar el ranking: " + e.getMessage());
        }
    }


    // Eliminar un videojuego por título
    private static void eliminarVideojuego(Scanner scanner) {
        System.out.print("Introduce el título del videojuego a eliminar: ");
        String titulo = scanner.nextLine();

        boolean eliminado = false;
        for (Iterator<Videojuego> it = ranking.iterator(); it.hasNext(); ) {
            Videojuego juego = it.next();
            if (juego.titulo.equalsIgnoreCase(titulo)) {
                it.remove();
                eliminado = true;
                System.out.println("Videojuego eliminado: " + juego);
                break;
            }
        }

        if (!eliminado) {
            System.out.println("El videojuego no se encontró en el ranking.");
        }
    }

    // Exportar el ranking a un archivo de texto
    private static void exportarATexto() {
        File archivo = new File("JUEGUITO.txt");
        System.out.println("Ruta real del archivo: " + archivo.getAbsolutePath());

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivo))) {
            System.out.println("Exportando " + ranking.size() + " juegos...");

            for (Videojuego juego : ranking) {
                writer.write(juego.toString());
                writer.newLine();
                System.out.println("Escribiendo: " + juego.toString());
            }

            writer.flush(); // forzar escritura
            System.out.println("Ranking exportado a JUEGUITO.txt");
        } catch (IOException e) {
            System.out.println("Error al exportar a texto: " + e.getMessage());
        }
    }

}


