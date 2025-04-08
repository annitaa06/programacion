package tema7.CSV;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.*;

public class FuncionesFunkoS implements Serializable {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String rutabinaria = "Documentos/funkos.dat";
        String rutacsv = "Documentos/funkos.csv";
        List<FunkoS> funkos = new ArrayList<>();


        File archivoBin = new File(rutabinaria);
        if (archivoBin.exists()) {
            cargarBinario(funkos, rutabinaria);
        } else {
            cargarDesdeCSV(funkos, rutacsv);
            guardarbinario(funkos, rutabinaria);
        }

        boolean empezar = false;
        while (!empezar) {
            System.out.println("1. AÑADIR FUNKO");
            System.out.println("2. ELIMINAR FUNKO");
            System.out.println("3. MOSTRAR FUNKO MÁS CARO");
            System.out.println("4. MOSTRAR MEDIA DE PRECIOS");
            System.out.println("5. MOSTRAR TODOS LOS FUNKOS");
            System.out.println("6. MOSTRAR POR MODELO");
            System.out.println("7. MOSTRAR FUNKOS DE 2023");
            System.out.println("8. SALIR");
            System.out.println("ELIGE UNA OPCION ");
            int opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> addfunko(funkos);
                case 2 -> deletefunko(funkos);
                case 3 -> mascaro(funkos);
                case 4 -> mediaprecios(funkos);
                case 5 -> mostrartodos(funkos);
                case 6 -> mostrarmodelos(funkos);
                case 7 -> mostrar2023(funkos);
                case 8 -> {
                    guardarbinario(funkos, rutabinaria);
                    empezar = true;
                }
                default -> System.out.println("Opción no válida.");
            }
        }
    }

    public static void addfunko(List<FunkoS> funkos) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Codigo: ");
        String cod = sc.next();

        System.out.print("Nombre: ");
        String nombre = sc.next();

        System.out.print("Modelo: ");
        String modelo = sc.next();

        System.out.print("Precio: ");
        double precio = sc.nextDouble();

        System.out.print("Fecha (YYYY-MM-DD): ");
        String fecha = sc.next();

        FunkoS nuevo = new FunkoS(cod, nombre, modelo, precio, LocalDate.parse(fecha));
        funkos.add(nuevo);

        System.out.println("Funko añadido.");
    }

    public static void deletefunko(List<FunkoS> funkos) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Código del funko a eliminar: ");
        String codigo = sc.next();

        funkos.removeIf(f -> f.getCodigo().equalsIgnoreCase(codigo));
        System.out.println("Funko eliminado si existía.");
    }

    public static void mascaro(List<FunkoS> funkos) {
        FunkoS caro = Collections.max(funkos, Comparator.comparingDouble(FunkoS::getPrecio));

        System.out.println("Funko más caro:\n" + caro);
    }

    public static void mediaprecios(List<FunkoS> funkos) {
        double media = funkos.stream().mapToDouble(FunkoS::getPrecio).average().orElse(0);

        System.out.printf("Media de precios: %.2f€\n", media);
    }

    public static void mostrartodos(List<FunkoS> funkos) {
        funkos.forEach(System.out::println);
    }

    public static void mostrarmodelos(List<FunkoS> funkos) {
        Map<String, List<FunkoS>> porModelo = new HashMap<>();
        for (FunkoS f : funkos) {
            porModelo.computeIfAbsent(f.getModelo(), k -> new ArrayList<>()).add(f);
        }

        porModelo.forEach((modelo, lista) -> {
            System.out.println("MODELO: " + modelo);
            lista.forEach(System.out::println);
        });
    }

    public static void mostrar2023(List<FunkoS> funkos) {
        funkos.stream()
                .filter(f -> f.getFechaLanzamiento().getYear() == 2023)
                .forEach(System.out::println);
    }

    public static void cargarDesdeCSV(List<FunkoS> funkos, String rutaCSV) {
        try {
            List<String> lineas = Files.readAllLines(Path.of(rutaCSV));

            for (int i = 1; i < lineas.size(); i++) {
                String[] datos = lineas.get(i).split(",");

                if (datos.length == 5) {
                    FunkoS f = new FunkoS(
                            datos[0].trim(),
                            datos[1].trim(),
                            datos[2].trim(),
                            Double.parseDouble(datos[3].trim()),
                            LocalDate.parse(datos[4].trim())
                    );

                    funkos.add(f);
                }
            }
            System.out.println("Funkos cargados desde el CSV.");

        } catch (IOException e) {
            System.out.println("Error al leer CSV: " + e.getMessage());
        }
    }

    public static void cargarBinario(List<FunkoS> funkos, String rutaBin) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(rutaBin))) {
            List<FunkoS> cargados = (List<FunkoS>) ois.readObject();
            funkos.addAll(cargados);
            System.out.println("Funkos cargados desde el binario.");

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al leer archivo binario: " + e.getMessage());
        }
    }

    public static void guardarbinario(List<FunkoS> funkos, String rutaBin) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(rutaBin))) {
            oos.writeObject(funkos);
            System.out.println("Funkos guardados en binario.");

        } catch (IOException e) {
            System.out.println("Error al guardar en binario: " + e.getMessage());
        }
    }
}
