package ejer210pag109;

import java.sql.Connection;
import java.sql.DriverManager;

public class Ejer210 {

    public static void main(String[] args) {
        try {
            // Cargar el driver
            Class.forName("org.sqlite.JDBC");

            // Establecer la conexión con la BD
            //Connection conexion = DriverManager.getConnection("jdbc:sqlite:F:\\BD\\ejemplo.db");

            // Construimos la orden INSERT
            //String sql = String.format("INSERT INTO empleados VALUES(%s, %s, %s, %s, NULL, %s, %s, %s);", args[0], args[1], args[2], args[3], args[4], args[5], args[6]);
        } catch (Exception ex) {
            System.out.println("ERROR");
        }
    }
}
