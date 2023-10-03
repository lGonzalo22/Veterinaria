package AccesoADatos;

import Entidades.Tratamiento;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.mariadb.jdbc.Statement;

public class TratamientoData {

    private Connection con = null;

    public TratamientoData() {
        this.con = Conexion.getConexion();
    }

    public void agregarTratamiento(Tratamiento trat) {

        String sql = "INSERT INTO tratamiento(tipo, descripcion, importe, activo) "
                + "VALUES (?,?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, trat.getTipo().toString());
            ps.setString(2, trat.getDescripcion());
            ps.setDouble(3, trat.getImporte());
            ps.setBoolean(4, trat.isEstado());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                trat.setIdTratamiento(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Tratamiento agregada con exito.");
            } else {
                JOptionPane.showMessageDialog(null, "El tratamiento no se agrego.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage());
        }
    }
    
    
}
