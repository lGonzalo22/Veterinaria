package AccesoADatos;

import Entidades.Mascota;
import Entidades.Visita;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.mariadb.jdbc.Statement;

public class VisitaData {

    private Connection con = null;

    public VisitaData() {
        this.con = Conexion.getConexion();
    }

    public void agregarVisita(Visita visita) {

        String sql = "INSERT INTO visita(idMascota, idTratamiento, idCliente, fechaVisita) "
                + "VALUES (?,?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, visita.getMascota().getIdMascota());
            ps.setInt(2, visita.getTratamiento().getIdTratamiento());
            ps.setInt(3, visita.getCliente().getIdCliente());
            ps.setDate(4, Date.valueOf(visita.getFechaVisita()));
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                visita.setIdVisita(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Visita agregada con exito.");
            } else {
                JOptionPane.showMessageDialog(null, "La visita no se agrego.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage());
        }
    }
    
//    public double pesoPromedio(Mascota mascota){
//        
//        
//        
//    }
}
