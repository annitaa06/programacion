package tema8.repasoSQL;

import java.sql.*;
import java.util.Properties;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class ConsultasHogwarts {
    private static String URL;
    private static String USER;
    private static String PASSWORD;

    public static void main(String[] args) {
        loadDatabaseProperties();

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {

            Scanner sc = new Scanner(System.in);

            int opcion;
            do {
                mostrarMenu();
                System.out.print("Elige una opción: ");
                opcion = sc.nextInt();
                sc.nextLine(); // limpiar buffer

                switch (opcion) {
                    case 1:
                        consulta1_profesores(conn);
                        break;
                    case 2:
                        consulta2_estudiantes1980(conn);
                        break;
                    case 3:
                        consulta3_ordenNacimiento(conn);
                        break;
                    case 4:
                        consulta4(conn);
                        break;
                    case 5:
                        consulta5(conn);
                        break;
                    case 6:
                        consulta6(conn);
                        break;
                    case 7:
                        consulta7(conn);
                        break;
                    case 8:
                        consulta8(conn);
                        break;
                    case 9:
                        consulta9(conn);
                        break;
                    case 10:
                        consulta10(conn);
                        break;
                    case 11:
                        consulta11(conn);
                        break;
                    case 12:
                        consulta12(conn);
                        break;
                    case 13:
                        consulta13(conn);
                        break;
                    case 14:
                        consulta14(conn);
                        break;
                    case 15:
                        consulta15(conn);
                        break;
                    case 16:
                        consulta16(conn);
                        break;
                    case 17:
                        consulta17(conn);
                        break;
                    case 18:
                        consulta18(conn);
                        break;
                    case 0:
                        System.out.println("Saliendo... Adiós Hogwarts");
                        break;
                    default:
                        System.out.println("Opción no válida, prueba otra vez");
                        break;
                }

                System.out.println();
            } while (opcion != 0);

        } catch (SQLException e) {
            System.err.println("Error de conexión: " + e.getMessage());
        }
    }

    private static void mostrarMenu() {
        System.out.println("");
        System.out.println("  CONSULTAS DE HOGWARTS   ");
        System.out.println("1. Mostrar profesores         ");
        System.out.println("2. Estudiantes nacidos en 1980");
        System.out.println("3. Estudiantes orden nacimiento");
        System.out.println("4. Mostrar estudiantes en cada casa");
        System.out.println("5. Calificación media y máxima en 'Pociones'");
        System.out.println("6. Mostrar todos los años de curso sin duplicados");
        System.out.println("7. Estudiantes con apellidos que empiezan con 'P'");
        System.out.println("8. Estudiantes en 4º o 5º año");
        System.out.println("9. Estudiantes de 5º año en Gryffindor o Slytherin");
        System.out.println("10. Mostrar los 5 estudiantes más jóvenes");
        System.out.println("11. Estudiantes con calificación >= 8 en 'Vuelo'");
        System.out.println("12. Insertar nuevo estudiante");
        System.out.println("13. Actualizar jefe de la casa Hufflepuff");
        System.out.println("14. Eliminar estudiante 'Tom Riddle'");
        System.out.println("15. Mostrar estudiantes con su casa");
        System.out.println("16. Mostrar estudiantes, sus mascotas y asignaturas");
        System.out.println("17. Estudiantes con calificación superior a la media en 'Encantamientos'");
        System.out.println("18. Casas con calificación media superior a 7");
        System.out.println("0. Salir ");

    }

    private static void loadDatabaseProperties() {
        Properties props = new Properties();
        try (InputStream input = Files.newInputStream(Paths.get("db.properties"))) {
            props.load(input);
            URL = props.getProperty("db.url");
            USER = props.getProperty("db.user");
            PASSWORD = props.getProperty("db.password");
        } catch (Exception e) {
            System.err.println("Error al cargar propiedades: " + e.getMessage());
        }
    }

    // 1. Selecciona los nombres y apellidos de todos los profesores.
    public static void consulta1_profesores(Connection conn) {
        String sql = "SELECT nombre, apellido FROM Profesor";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            ResultSet rs = stmt.executeQuery();
            System.out.println("\nProfesores:");
            while (rs.next()) {
                System.out.println(rs.getString("nombre") + " " + rs.getString("apellido"));
            }
        } catch (SQLException e) {
            System.err.println("Error en consulta 1: " + e.getMessage());
        }
    }

    // 2. Estudiantes nacidos después del 1 de enero de 1980
    public static void consulta2_estudiantes1980(Connection conn) {
        String sql = "SELECT nombre, apellido FROM Estudiante WHERE fecha_nacimiento > '1980-01-01'";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            ResultSet rs = stmt.executeQuery();
            System.out.println("\nEstudiantes nacidos después del 1 de enero de 1980:");
            while (rs.next()) {
                System.out.println(rs.getString("nombre") + " " + rs.getString("apellido"));
            }
        } catch (SQLException e) {
            System.err.println("Error en consulta 2: " + e.getMessage());
        }
    }

    // 3. Estudiantes ordenados por fecha de nacimiento
    public static void consulta3_ordenNacimiento(Connection conn) {
        String sql = "SELECT nombre, apellido FROM Estudiante ORDER BY fecha_nacimiento ASC";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            ResultSet rs = stmt.executeQuery();
            System.out.println("\nEstudiantes ordenados por fecha de nacimiento:");
            while (rs.next()) {
                System.out.println(rs.getString("nombre") + " " + rs.getString("apellido"));
            }
        } catch (SQLException e) {
            System.err.println("Error en consulta 3: " + e.getMessage());
        }
    }


 // 4.  Muestra cuántos estudiantes hay en cada casa, mostrando el nombre de la casa y el número de
   // estudiantes.
    public static void consulta4(Connection conn) {
        String sql = "SELECT e.nombre, e.apellido, c.nombre FROM Estudiante e JOIN Casa c ON e.id_casa = c.id_casa ORDER BY e.nombre;";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            ResultSet rs = stmt.executeQuery();
            System.out.println("\nEstudiantes Por cada casa:");
            while (rs.next()) {
                System.out.println(rs.getString("nombre") + " " + rs.getString("apellido"));
            }
        } catch (SQLException e) {
            System.err.println("Error en consulta 4: " + e.getMessage());
        }
    }
    // 5. Calcula la calificación media y la calificación máxima en la asignatura "Pociones".
    public static void consulta5(Connection conn) {
        String sql = "SELECT AVG(calificacion) AS promedio, MAX(calificacion) AS calMax FROM Estudiante_asignatura c JOIN Asignatura a ON c.id_asignatura = a.id_asignatura WHERE a.nombre = 'Pociones'";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            ResultSet rs = stmt.executeQuery();
            System.out.println("\nCalificacion media y maxima en la asignatura pociones:");
            while (rs.next()) {
                System.out.println("Media: " + rs.getDouble("promedio") + " | Máxima: " + rs.getDouble("calMax"));            }
        } catch (SQLException e) {
            System.err.println("Error en consulta 5: " + e.getMessage());
        }
    }

    // 6. Muestra todos los años de curso sin duplicados.
    public static void consulta6(Connection conn) {
        String sql = "SELECT DISTINCT anyo_curso FROM Estudiante";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            ResultSet rs = stmt.executeQuery();
            System.out.println("\n todos los años de curso sin duplicados.");
            while (rs.next()) {
                System.out.println("Curso: " + rs.getInt("anyo_curso"));  }
        } catch (SQLException e) {
            System.err.println("Error en consulta 6: " + e.getMessage());
        }
    }

    // 7. Apellidos que empiezan por una letra
    public static void consulta7(Connection conn ) {
        Scanner sc = new Scanner(System.in);
        String sql = "SELECT nombre, apellido FROM Estudiante WHERE apellido LIKE 'P%'";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            ResultSet rs = stmt.executeQuery();
            System.out.println("\n Apellidos que empiezan por la p ");
            while (rs.next()) {
                System.out.println(rs.getString("nombre") + " " + rs.getString("apellido"));  }
        } catch (SQLException e) {
            System.err.println("Error en consulta 7: " + e.getMessage());
        }
    }

    //8. Muestra los nombres y apellidos de los estudiantes que están en su 4º o 5º año.
    public static void consulta8(Connection conn ) {
        Scanner sc = new Scanner(System.in);
        String sql = "SELECT nombre, apellido FROM Estudiante WHERE anyo_curso IN (4,5)";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            ResultSet rs = stmt.executeQuery();
            System.out.println("\n estudiantes que están en su 4º o 5º año ");
            while (rs.next()) {
                System.out.println(rs.getString("nombre") + " " + rs.getString("apellido"));
            }

        } catch (SQLException e) {
            System.err.println("Error en consulta 8: " + e.getMessage());
        }
    }
    public static void consulta9(Connection conn ) {
        String sql = "SELECT nombre, apellido FROM Estudiante WHERE anyo_curso IN (5) AND id_casa IN (1, 4)";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString("nombre") + " " + rs.getString("apellido"));
            }
        } catch (SQLException e) {
            System.err.println("Error en consulta 9: " + e.getMessage());
        }
    }

    public static void consulta10(Connection conn ) {
        String sql = "SELECT nombre, apellido FROM Estudiante ORDER BY fecha_nacimiento ASC LIMIT 5";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString("nombre") + " " + rs.getString("apellido"));
            }  } catch (SQLException e) {
            System.err.println("Error en consulta 10: " + e.getMessage());
        }
    }


    public static void consulta11(Connection conn ) {
        String sql = """
                SELECT e.nombre, e.apellido FROM Estudiante_Asignatura ea
                JOIN Estudiante e ON ea.id_estudiante = e.id_estudiante
                JOIN Asignatura a ON ea.id_asignatura = a.id_asignatura
                 WHERE a.nombre = 'Vuelo' AND ea.calificacion >= 8
                """;
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString("nombre"));
            }
        } catch (SQLException e) {
            System.err.println("Error en consulta 11: " + e.getMessage());
        }
    }

    public static void consulta12(Connection conn ) {
        String sql = """ 
                INSERT INTO Estudiante (nombre, apellido, id_casa, anyo_curso, fecha_nacimiento)
                VALUES ('Nymphadora', 'Tonks', 4, 7, '1973-11-25')
                """
                ;
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            int filas = stmt.executeUpdate();
            System.out.println("Filas insertadas: " + filas);
        } catch (SQLException e) {
            System.err.println("Error en consulta 12: " + e.getMessage());
        }
    }

    public static void consulta13(Connection conn ) {
        String sql = "UPDATE Casa SET id_jefe = 10 WHERE nombre = 'Hufflepuff'";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            int filas = stmt.executeUpdate();
            System.out.println("Filas actualizadas: " + filas);
        } catch (SQLException e) {
            System.err.println("Error en consulta 13: " + e.getMessage());
        }
    }

    public static void consulta14(Connection conn ) {
        String sql = "DELETE FROM Estudiante WHERE nombre = 'Tom' AND apellido = 'Riddle'";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            int filas = stmt.executeUpdate();
            System.out.println("Filas eliminadas: " + filas);
        } catch (SQLException e) {
            System.err.println("Error en consulta 14: " + e.getMessage());
        }

    }

    public static void consulta15(Connection conn ) {
        String sql = "SELECT e.nombre, e.apellido, Casa.nombre AS nom_casa FROM Estudiante e JOIN Casa ON e.id_casa = Casa.id_casa";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString("nombre") + " " + rs.getString("apellido") + " - " + rs.getString("nom_casa"));
            }
        } catch (SQLException e) {
            System.err.println("Error en consulta 15: " + e.getMessage());
        }
    }

    public static void consulta16(Connection conn ) {
        String sql = """
                SELECT
                Estudiante.nombre AS nombre_estudiante,
                Estudiante.apellido AS apellido_estudiante,
                Mascota.nombre AS nombre_mascota,
                Asignatura.nombre AS nombre_asignatura
                
                FROM
                Estudiante
               
                LEFT JOIN Mascota ON Estudiante.id_estudiante = Mascota.id_estudiante
                INNER JOIN Estudiante_Asignatura ON Estudiante.id_estudiante = Estudiante_Asignatura.id_estudiante
                INNER JOIN Asignatura ON Estudiante_Asignatura.id_asignatura = Asignatura.id_asignatura
                ORDER BY Estudiante.nombre, Asignatura.nombre;
                """;
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                System.out.println("Estudiante: " + rs.getString("nombre_estudiante") + " | Mascota: " + rs.getString("nombre_mascota") + " | Asignatura: " + rs.getString("nombre_asignatura"));
            }
        } catch (SQLException e) {
            System.err.println("Error en consulta 16: " + e.getMessage());
        }
    }

    public static void consulta17(Connection conn ) {
        String sql = """
                SELECT
                Estudiante.nombre,
                Estudiante.apellido,
                Estudiante_Asignatura.calificacion
                
                FROM
                Estudiante
                
                JOIN
                Estudiante_Asignatura ON Estudiante.id_estudiante = Estudiante_Asignatura.id_estudiante
                
                JOIN
                Asignatura ON Estudiante_Asignatura.id_asignatura = Asignatura.id_asignatura
                
                WHERE
                Asignatura.nombre = 'Encantamientos'
                AND Estudiante_Asignatura.calificacion > (
                SELECT
                AVG(EA.calificacion)
                
                FROM
                Estudiante_Asignatura EA
                
                JOIN
                Asignatura A ON EA.id_asignatura = A.id_asignatura
                
                WHERE
                A.nombre = 'Encantamientos'
                );
                """;
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString("nombre"));
            }
        } catch (SQLException e) {
            System.err.println("Error en consulta 17: " + e.getMessage());
        }
    }

    public static void consulta18(Connection conn ) {
        String sql = """
                SELECT
                    Casa.nombre AS nombre_casa,
                    AVG(Estudiante_Asignatura.calificacion) AS promedio_calificacion
                FROM
                    Casa
                JOIN
                    Estudiante ON Casa.id_casa = Estudiante.id_casa
                JOIN
                    Estudiante_Asignatura ON Estudiante.id_estudiante = Estudiante_Asignatura.id_estudiante
                GROUP BY
                    Casa.id_casa
                HAVING
                    AVG(Estudiante_Asignatura.calificacion) > 7;
                """;
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString("nombre_casa") + " - Media: " + rs.getDouble("promedio_calificacion"));
            }
        } catch (SQLException e) {
            System.err.println("Error en consulta 18: " + e.getMessage());
        }
    }

}