package grupo76_cuartelbomberos.coneccion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class coneccionData {

    private static final String URL = "jdbc:mariadb://localhost/";
    private static final String DB = "bomberos";//ver si la base de datos coinside
    private static final String USER = "root";
    private static final String PASS = "";
    private static Connection connection;

    public coneccionData() {
    }

    public static Connection Conectar() {
        if (connection == null) {
            try {
                // cargar Driver de Conexion
                Class.forName("org.mariadb.jdbc.Driver");
                System.out.println("Drivers cargados exitosamente.");
                // Conectar al servidor de la base de datos
                connection = DriverManager.getConnection(URL+DB,USER,PASS);
                System.out.println("Conexión establecida con exito.");

            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Fallo al cargar los drivers de maridb !!\n" + ex.getMessage());
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Fallo al conectar con la Base de Datos !!\n" + ex.getMessage());
            }
        }
        return connection;
    }

    public void cerrarConexion() {
        try {
            if (connection != null) {
                connection.close();
                System.out.println("Se desconectó de la Base de Datos !!");
            }
        } catch (SQLException ex) {
            System.out.println("Error al intentar cerrar la base de datos.\n" + ex.getMessage());
        }
    }
}
