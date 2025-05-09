package tema8.pilotos;

import java.beans.FeatureDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.*;
import java.sql.Date;
import java.time.LocalDate;
import java.util.*;

public class MainPilotos {
    private static String URL;
    private static String USER;
    private static String PASSWORD;

    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        boolean compwhile = false;
        ArrayList<Piloto> Pilotos = new ArrayList<>();
        loadDatabaseProperties();
        Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);

        while (!compwhile) {
            System.out.println("MENU");
            System.out.println("1. Crear un piloto (CreatePilot)");
            System.out.println("2. Leer un piloto por ID (ReadPilot)");
            System.out.println("3. Leer todos los pilotos (ReadPilots)");
            System.out.println("4. Actualizar un piloto (UpdatePilot)");
            System.out.println("6. Mostrar clasificación de pilotos (ShowPilotClassification)");
            System.out.println("7. Mostrar clasificación de equipos (ShowBuildersClassification)");
            System.out.println("0. Salir");
            System.out.println("Seleccione una opción:");

            int valorU = sc.nextInt();

            switch (valorU) {
                case 0:
                    compwhile = true;
                    conn.close();
                    break;
                case 1:
                    insertarPiloto(conn);
                    break;
                case 2:
                    mirarPiloto(conn);
                    break;
                case 3:
                    listaPilotos(conn, Pilotos);
                    break;
                case 4:
                    actualizarPiloto(conn);
                    break;
                case 5:
                    eliminarPiloto(conn);
                    break;
                case 6:
                    mostrarClasificacion(conn);
                    break;
                case 7:
                    mostrarPorEquipos(conn);
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }

    public static void loadDatabaseProperties() {
        Properties properties = new Properties();
        try (InputStream input = MainPilotos.class.getClassLoader().getResourceAsStream("db.properties")) {
            if (input == null) {
                System.err.println("No se encontró el archivo db.properties");
                return;
            }
            properties.load(input);
            URL = properties.getProperty("url");
            USER = properties.getProperty("user");
            PASSWORD = properties.getProperty("password");
        } catch (IOException ex) {
            System.err.println("Error al cargar el archivo de propiedades: " + ex.getMessage());
        }
    }




    public static void insertarPiloto(Connection conn) throws SQLException {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce CODIGO del piloto ");
        String codigo = sc.next();
        System.out.println("introduce NOMBRE del piloto");
        String nombre = sc.next();
        System.out.println("introduce el APELLIDO del piloto");
        String apellido = sc.next();
        System.out.println("introduce LA NACIONALIDAD del piloto");
        String nacionalidad = sc.next();
        System.out.println("introduce el LINK del piloto");
        String link = sc.next();
        LocalDate fecha = LocalDate.now();

        System.out.println("introduce el ID DEL CONSTRUCTOR (debe existir en la tabla constructors)");
        int constructorId = sc.nextInt();

        PreparedStatement st = conn.prepareStatement(
                "INSERT INTO drivers (code, forename, surname, dob, nationality, constructorid, url) VALUES (?, ?, ?, ?, ?, ?, ?)"
        );
        st.setString(1, codigo);
        st.setString(2, nombre);
        st.setString(3, apellido);
        st.setDate(4, Date.valueOf(fecha));
        st.setString(5, nacionalidad);
        st.setInt(6, constructorId);
        st.setString(7, link);

        try {
            st.executeUpdate();
            System.out.println("PILOTO INSERTADO CORRECTAMENTE");
        } catch (SQLException e) {
            System.err.println("ERROR al insertar piloto: " + e.getMessage());
        }
    }
    public static void mirarPiloto(Connection conn) throws SQLException {
        Scanner sc = new Scanner(System.in);
        System.out.println("INTRODUCE EL ID DEL PILOTO PARA VER SUS DATOS");
        int id = sc.nextInt();

        try (PreparedStatement st = conn.prepareStatement("SELECT * FROM drivers WHERE driverid = ?")) {
            st.setInt(1, id);
            ResultSet result = st.executeQuery();

            while (result.next()) {
                String codigo = result.getString("code");
                String nombre = result.getString("forename");
                String apellido = result.getString("surname");
                Date fecha = result.getDate("dob");
                String nacionalidad = result.getString("nationality");
                String link = result.getString("url");
                Piloto piloto = new Piloto(codigo, nombre, fecha, apellido, nacionalidad,link, id);
                System.out.println(piloto);
            }
        } catch (SQLException e) {
            System.out.println("ERROR al consultar los datos del piloto: " + e.getMessage());
        }
    }
    public static void listaPilotos(Connection conn, ArrayList<Piloto> Pilotos) {
        try (PreparedStatement st = conn.prepareStatement("SELECT * FROM drivers")) {
            ResultSet result = st.executeQuery();

            while (result.next()) {
                String codigo = result.getString("code");
                String nombre = result.getString("forename");
                String apellido = result.getString("surname");
                Date fecha = result.getDate("dob");
                String nacionalidad = result.getString("nationality");
                String link = result.getString("url");
                int id = result.getInt("driverid");

                Piloto piloto = new Piloto(codigo, nombre, fecha, apellido, nacionalidad,link, id);

                Pilotos.add(piloto);
            }

            for (Piloto p : Pilotos) {
                System.out.println(p.toString());
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    public static void eliminarPiloto(Connection conn) throws SQLException {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce el ID DE UN PILOTO para ELIMINARLO");
        int id = sc.nextInt();
        try (PreparedStatement st = conn.prepareStatement("DELETE FROM drivers WHERE driverid = ?")) {
            st.setInt(1, id);
            st.executeUpdate();
            System.out.println("Piloto ELIMINADO correctamente.");
        } catch (SQLException e) {
            System.out.println("ERROR al eliminar el piloto: " + e.getMessage());
        }
    }

    public static void actualizarPiloto(Connection conn) throws SQLException{
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce el ID DE UN PILOTO para ACTUALIZAR SU INFORMACIÓN");
        int id = sc.nextInt();
        System.out.println("introduce el CÓDIGO DEL PILOTO");
        String codigo = sc.next();
        System.out.println("introduce el NOMBRE DEL PILOTO");
        String nombre = sc.next();
        System.out.println("introduce el APELLIDO DEL PILOTO");
        String apellido = sc.next();
        System.out.println("Introduce la NACIONALIDAD DEL PILOTO");
        String nacionalidad = sc.next();
        System.out.println("introduce el LINK DEL PILOTO");
        String link = sc.next();
        LocalDate fecha = LocalDate.now();

        try(PreparedStatement st = conn.prepareStatement("UPDATE drivers SET code = ?, forename = ?, surname = ?, dob = ?, nationality = ?, url = ? WHERE driverid = ?")){
            st.setString(1, codigo);
            st.setString(2, nombre);
            st.setString(3, apellido);
            st.setDate(4, Date.valueOf(fecha));
            st.setString(5, nacionalidad);
            st.setString(6, link);
            st.setInt(7, id);
            st.executeUpdate();
            System.out.println("PILOTO ACTUALIZADO CORRECTAMENTE");
        }
    }


    public static void mostrarClasificacion(Connection conn){
        String nombre, apellido;
        int puntos;
        try (PreparedStatement st = conn.prepareStatement("""
    SELECT drivers.forename, drivers.surname,
    SUM(results.points) as puntos
    FROM drivers
    JOIN results on drivers.driverid = results.driverid
    GROUP BY drivers.driverid, drivers.forename, drivers.surname
    ORDER BY SUM(results.points) DESC;
""")){
            ResultSet result =  st.executeQuery();
            while (result.next()){
                nombre = result.getString("forename");
                apellido = result.getString("surname");
                puntos = result.getInt("puntos");
                System.out.println(" NOMBRE " + nombre + " APELLIDO " + apellido + " PUNTOS " + puntos);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    public static void mostrarPorEquipos(Connection conn) throws SQLException {
        int puntos;
        String nombre;


        try(PreparedStatement st = conn.prepareStatement("""
                SELECT constructors.name AS nombre, SUM(results.points) AS points 
                FROM results JOIN drivers ON results.driverid = drivers.driverid 
                JOIN constructors ON drivers.constructorid = constructors.constructorid 
                GROUP BY constructors.name ORDER BY points DESC;"""

        )){
            ResultSet result = st.executeQuery();
            while(result.next()){
                nombre = result.getString("nombre");
                puntos = result.getInt("points");
                System.out.println("NOMBRE " + nombre + " PUNTOS " + puntos);
            }
        }

    }



}