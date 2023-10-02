package AccesoADatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class Conexion {

    private static final String url = "jdbc:mariadb://localhost:3306/";
    private static final String db = "veterinaria";
    private static final String user = "root";
    private static final String password = "";

    private static Connection conexion;

    public static Connection getConexion() {

        if (conexion == null) {
            try {
                Class.forName("org.mariadb.jdbc.Driver");
                conexion = DriverManager.getConnection(url + db, user, password);
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "ERROR: No se conecto con el driver.");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "ERROR DE CONEXION.");
            }
        }
        return conexion;
    }
}
