package tema8;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.*;
import java.util.Properties;
import java.util.Scanner;

public class Operaciones {
    private static String URL;
    private static String USER;
    private static String PASSWORD;

    public static void main(String[] args) {
        loadDatabaseProperties();

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {
            Scanner scanner = new Scanner(System.in);
            int opcion;

            do {
                System.out.println("\nSeleccione una opción:");
                System.out.println("1. Consulta de estudiantes por casa");
                System.out.println("2. Obtener la mascota de un estudiante por ID");
                System.out.println("3. Número de estudiantes por casa");
                System.out.println("4. Insertar una nueva asignatura");
                System.out.println("5. Modificar el aula de una asignatura");
                System.out.println("6. Eliminar una asignatura");
                System.out.println("0. Salir");
                opcion = scanner.nextInt();
                scanner.nextLine(); // Consumir salto de línea

                switch (opcion) {
                    case 1:
                        consultarEstudiantesPorCasa(conn);
                        break;
                    case 2:
                        System.out.println("Ingrese el ID del estudiante:");
                        int idEst = scanner.nextInt();
                        obtenerMascotaEstudiante(conn, idEst);
                        break;
                    case 3:
                        obtenerNumeroEstudiantesPorCasa(conn);
                        break;
                    case 4:
                        System.out.println("Ingrese el nombre de la asignatura:");
                        String asignatura = scanner.nextLine();
                        System.out.println("Ingrese el aula de la asignatura:");
                        String aula = scanner.nextLine();
                        System.out.println("¿Es obligatoria? (1=Sí, 2=No):");
                        int esOblig = scanner.nextInt();
                        boolean obligatoria = (esOblig == 1);
                        insertarAsignatura(conn, asignatura, aula, obligatoria);
                        break;
                    case 5:
                        System.out.println("Ingrese el ID de la asignatura:");
                        int asignID = scanner.nextInt();
                        scanner.nextLine(); // Consumir salto de línea
                        System.out.println("Ingrese el nuevo aula:");
                        String nuevaClase = scanner.nextLine();
                        modificarAulaAsignatura(conn, asignID, nuevaClase);
                        break;
                    case 6:
                        System.out.println("Ingrese el ID de la asignatura a eliminar:");
                        int eliAsignID = scanner.nextInt();
                        eliminarAsignatura(conn, eliAsignID);
                        break;
                    case 0:
                        System.out.println("Saliendo...");
                        break;
                    default:
                        System.out.println("Opción no válida, intente nuevamente.");
                }
            } while (opcion != 0);

        } catch (SQLException e) {
            System.err.println("Error al conectar a la base de datos: " + e.getMessage());
        }
    }

    private static void loadDatabaseProperties() {
        Properties properties = new Properties();
        try (InputStream input = Files.newInputStream(Paths.get("db.properties"))) {
            properties.load(input);
            URL = properties.getProperty("db.url");
            USER = properties.getProperty("db.user");
            PASSWORD = properties.getProperty("db.password");
        } catch (IOException ex) {
            System.err.println("Error al cargar el archivo de propiedades: " + ex.getMessage());
        }
    }

    public static void consultarEstudiantesPorCasa(Connection conn) {
        Scanner sc = new Scanner(System.in);
        String sql = "SELECT nombre, apellido FROM Estudiante WHERE id_casa = ?";
        System.out.println("INTRODUCE EL ID DE UNA CASA:");
        int casa = sc.nextInt();
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, casa);
            ResultSet rs = pstmt.executeQuery();
            System.out.println("Estudiantes en la casa " + casa + ":");
            while (rs.next()) {
                System.out.println(rs.getString("nombre") + " " + rs.getString("apellido"));
            }
        } catch (SQLException e) {
            System.err.println("Error al consultar los estudiantes por casa: " + e.getMessage());
        }
    }

    public static void obtenerMascotaEstudiante(Connection conn, int idEstudiante) {
        String sql = "SELECT nombre FROM Mascota WHERE id_estudiante = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, idEstudiante);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                System.out.println("La mascota del estudiante con ID " + idEstudiante + " es: " + rs.getString("nombre"));
            } else {
                System.out.println("No se encontró mascota para ese estudiante.");
            }
        } catch (SQLException e) {
            System.err.println("Error al obtener la mascota del estudiante: " + e.getMessage());
        }
    }

    public static void obtenerNumeroEstudiantesPorCasa(Connection conn) {
        String sql = """
            SELECT c.nombre AS casa, COUNT(e.id_estudiante) AS cantidad_estudiantes
            FROM Estudiante e
            JOIN Casa c ON e.id_casa = c.id_casa
            GROUP BY c.nombre
        """;
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            ResultSet rs = pstmt.executeQuery();
            System.out.println("Número de estudiantes por casa:");
            while (rs.next()) {
                System.out.println(rs.getString("casa") + ": " + rs.getInt("cantidad_estudiantes"));
            }
        } catch (SQLException e) {
            System.err.println("Error al obtener el número de estudiantes por casa: " + e.getMessage());
        }
    }

    public static void insertarAsignatura(Connection conn, String nombre, String aula, boolean obligatoria) {
        String sql = "INSERT INTO Asignatura (nombre, aula, obligatoria) VALUES (?, ?, ?)";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, nombre);
            pstmt.setString(2, aula);
            pstmt.setBoolean(3, obligatoria);
            pstmt.executeUpdate();
            System.out.println("Asignatura " + nombre + " insertada correctamente.");
        } catch (SQLException e) {
            System.err.println("Error al insertar la asignatura: " + e.getMessage());
        }
    }

    public static void modificarAulaAsignatura(Connection conn, int id, String nuevaAula) {
        String sql = "UPDATE Asignatura SET aula = ? WHERE id_asignatura = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, nuevaAula);
            pstmt.setInt(2, id);
            pstmt.executeUpdate();
            System.out.println("Aula de la asignatura con ID " + id + " modificada a " + nuevaAula);
        } catch (SQLException e) {
            System.err.println("Error al modificar el aula de la asignatura: " + e.getMessage());
        }
    }

    public static void eliminarAsignatura(Connection conn, int id) {
        String sql = "DELETE FROM Asignatura WHERE id_asignatura = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
            System.out.println("Asignatura con ID " + id + " eliminada correctamente.");
        } catch (SQLException e) {
            System.err.println("Error al eliminar la asignatura: " + e.getMessage());
        }
    }
}
