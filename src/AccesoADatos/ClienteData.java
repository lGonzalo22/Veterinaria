package AccesoADatos;

import Entidades.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.mariadb.jdbc.Statement;

public class ClienteData {

    private Connection con = null;
    
    public ClienteData() {
    this.con = Conexion.getConexion();
    }
    
    public void agregarCliente(Cliente cliente){
        
        String sql = "INSERT INTO cliente(documento, cabezaDeFamilia, direccion, telefono, personaAlternativa, estado)"
                + " VALUES (?,?,?,?,?,?)";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, cliente.getDocumento());
            ps.setString(2, cliente.getCabezaDeFamilia());
            ps.setString(3, cliente.getDireccion());
            ps.setInt(4, cliente.getTelefono());
            ps.setString(5, cliente.getPersonaAlternativa());
            ps.setBoolean(6, true);
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                cliente.setIdCliente(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Cliente agregado con exito.");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage());
        }
    }
    
    
    public void eliminarCliente(int id){
        String sql = "UPDATE cliente SET estado = 0 WHERE idCliente = ? and estado = 1";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int correcto = ps.executeUpdate();
            if (correcto == 1) {
                JOptionPane.showMessageDialog(null, "Cliente eliminado.");
            }else{
                JOptionPane.showMessageDialog(null, "El cliente no existe.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage());
        }
    }
    
    public void modificarCliente(Cliente cliente){
        String sql = "UPDATE cliente SET documento = ?, cabezaDeFamilia = ?, direccion = ?, telefono = ?, personaAlternativa = ?, estado = ? WHERE idCliente = ?";
    
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, cliente.getDocumento());
            ps.setString(2, cliente.getCabezaDeFamilia());
            ps.setString(3, cliente.getDireccion());
            ps.setInt(4, cliente.getTelefono());
            ps.setString(5, cliente.getPersonaAlternativa());
            ps.setBoolean(6, cliente.isEstado());
            ps.setInt(7, cliente.getIdCliente());
            int correcto = ps.executeUpdate();
            if (correcto == 1) {
                JOptionPane.showMessageDialog(null, "Cliente modificado.");
            }else{
                JOptionPane.showMessageDialog(null, "El cliente no existe.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla cliente.");
        }
    }
}
