package tema7.CSV;

import java.io.*;
import java.time.LocalDate;
import java.util.*;
public class FuncionesFunko {
    private static final String FILE_PATH = "Documentos/funkos.csv";
    private List<Funko> funkos = new ArrayList<>(); //aqui guardamos los funcos

    //metodo para carfar los funkos desde el csv

    public void loadFunkos() {
        funkos.clear();

        File file = new File(FILE_PATH);
        if (!file.exists()) {
            System.out.println("El archivo no se encuentra en la ruta especificada: " + file.getAbsolutePath());
        } else {
            System.out.println("El archivo fue encontrado correctamente.");
        }

        try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            br.readLine(); // Saltar la primera línea (encabezado)

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 5) {
                    Funko funko = new Funko(data[0], data[1], data[2],
                            Double.parseDouble(data[3]),
                            LocalDate.parse(data[4]));
                    funkos.add(funko);
                }
            }
        } catch (IOException e) {
            System.out.println("No se pudo cargar el archivo.");
        }
    }

    //GUARDAR FUNKOS

    public void saveFunkos() {
        try (PrintWriter pw = new PrintWriter(new FileWriter(FILE_PATH))) {
            pw.println("COD,NOMBRE,MODELO,PRECIO,FECHA_LANZAMIENTO");
            for (Funko f : funkos) {
                pw.println(f.toCSV());
            }
        } catch (IOException e) {
            System.out.println("Error al GUARDAR el archivo.");

        }
    }

    //AÑADIR
    public void addFunko(String codigo, String nombre, String modelo, double precio, LocalDate fecha) {
        funkos.add(new Funko(codigo, nombre, modelo, precio, fecha));
        saveFunkos();
    }

    //BORRAR
    public void deleteFunko(String codigo) {
        funkos.removeIf(f -> f.getCodigo().equals(codigo));
        saveFunkos();
    }

    //MOSTRIAR
    public void showFunkos() {
        if (funkos.isEmpty()) {
            System.out.println("no hay funkos");
        } else {
            for (Funko funko : funkos) {
                System.out.println(funko);
            }
        }
    }

    //EL MAS CARO
    public void MostExpensive() {
        if (funkos.isEmpty()) {
            System.out.println("NO hayt funkos");
        } else {
            Funko masCaro = funkos.get(0); //para a empezar a mirar desde el primero
            for (Funko funko : funkos) {
                if (funko.getPrecio() > masCaro.getPrecio()) {
                    masCaro = funko;
                }

            }
            System.out.println("El Funko más caro es: " + masCaro);
        }
    }

    //MEDIA
    public void showAveragePrice() {
        if (funkos.isEmpty()) {
            System.out.println("No hay Funkos.");
        } else {
            double suma = 0;
            int cantidad = 0;

            for (Funko funko : funkos) {
                suma += funko.getPrecio();
                cantidad++;
            }

            double promedio = suma / cantidad;
            System.out.println("Precio medio: " + promedio + "€");
        }
    }

    //MODELO
    public void showFunkosByModel() {
        if (funkos.isEmpty()) {
            System.out.println("No hay Funkos.");
        } else {
            List<String> modelosMostrados = new ArrayList<>();

            for (Funko funko : funkos) {
                String modelo = funko.getModelo();

                if (!modelosMostrados.contains(modelo)) { // Si el modelo no se ha mostrado antes
                    modelosMostrados.add(modelo);
                    System.out.println("\nModelo: " + modelo);

                    for (Funko f : funkos) { // Mostrar Funkos de ese modelo
                        if (f.getModelo().equals(modelo)) {
                            System.out.println(f);
                        }
                    }
                }
            }
        }
    }

    //MOSTRAR FUNKOS 2023
    public void showFunkos2023() {
        boolean hayFunkos = false; // Comenzamos con 'false'

        for (Funko funko : funkos) {
            if (funko.getFechaLanzamiento().getYear() == 2023) {
                System.out.println(funko);
                hayFunkos = true; // Si encontramos un Funko de 2023, cambiamos a 'true'
            }
        }

        if (!hayFunkos) {
            System.out.println("No hay Funkos del año 2023.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FuncionesFunko funciones = new FuncionesFunko();
        funciones.loadFunkos();

        int opcion;
        do {
            System.out.println("\nMenú:");
            System.out.println("1. Añadir Funko");
            System.out.println("2. Borrar Funko");
            System.out.println("3. Mostrar Funkos");
            System.out.println("4. Mostrar el más caro");
            System.out.println("5. Mostrar precio medio");
            System.out.println("6. Mostrar Funkos por modelo");
            System.out.println("7. Mostrar Funkos de 2023");
            System.out.println("8. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Código: ");
                    String codigo = scanner.nextLine();
                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Modelo: ");
                    String modelo = scanner.nextLine();
                    System.out.print("Precio: ");
                    double precio = scanner.nextDouble();
                    System.out.print("Año de lanzamiento: ");
                    int year = scanner.nextInt();
                    System.out.print("Mes de lanzamiento: ");
                    int month = scanner.nextInt();
                    System.out.print("Día de lanzamiento: ");
                    int day = scanner.nextInt();
                    LocalDate fecha = LocalDate.of(year, month, day);

                    funciones.addFunko(codigo, nombre, modelo, precio, fecha);
                    break;

                case 2:
                    System.out.print("Introduce el código del Funko a eliminar: ");
                    String codigoEliminar = scanner.nextLine();
                    funciones.deleteFunko(codigoEliminar);
                    break;

                case 3:
                    funciones.showFunkos();
                    break;

                case 4:
                    funciones.MostExpensive();
                    break;

                case 5:
                    funciones.showAveragePrice();
                    break;

                case 6:
                    funciones.showFunkosByModel();
                    break;

                case 7:
                    funciones.showFunkos2023();
                    break;

                case 8:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 8);

        scanner.close();
    }
}

