package AccesoADatos;

import Entidades.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import org.mariadb.jdbc.Statement;

public class ClienteData {

    private Connection con = null;
    
    public ClienteData() {
    this.con = Conexion.getConexion();
    }
    
    public void agregarCliente(Cliente cliente){
        
        String sql = "INSERT INTO cliente(documento, cabezaDeFamilia, direccion, telefono, personaAlternativa, telefonoAlternativo, estado)"
                + " VALUES (?,?,?,?,?,?,?)";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, cliente.getDocumento());
            ps.setString(2, cliente.getCabezaDeFamilia());
            ps.setString(3, cliente.getDireccion());
            ps.setLong(4, cliente.getTelefono());
            ps.setString(5, cliente.getPersonaAlternativa());
            ps.setLong(6, cliente.getTelefonoAlternativo());
            ps.setBoolean(7, cliente.isEstado());
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
        String sql = "UPDATE cliente SET documento = ?, cabezaDeFamilia = ?, direccion = ?, telefono = ?, personaAlternativa = ?, telefonoAlternativo = ?, estado = ? WHERE idCliente = ?";
    
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, cliente.getDocumento());
            ps.setString(2, cliente.getCabezaDeFamilia());
            ps.setString(3, cliente.getDireccion());
            ps.setLong(4, cliente.getTelefono());
            ps.setString(5, cliente.getPersonaAlternativa());
            ps.setLong(6, cliente.getTelefonoAlternativo());
            ps.setBoolean(7, cliente.isEstado());
            ps.setInt(8, cliente.getIdCliente());
            int correcto = ps.executeUpdate();
            if (correcto == 1) {
                JOptionPane.showMessageDialog(null, "Cliente modificado correctamente.");
            }else{
                JOptionPane.showMessageDialog(null, "El cliente no existe.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla cliente.");
        }
    }
    
    public Cliente buscarClientePorId(int id){
        Cliente cliente = new Cliente();
        String sql = "SELECT * FROM cliente WHERE idCliente = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                cliente.setIdCliente(id);
                cliente.setDocumento(rs.getInt("documento"));
                cliente.setCabezaDeFamilia(rs.getString("CabezaDeFamilia"));
                cliente.setDireccion(rs.getString("direccion"));
                cliente.setTelefono(rs.getInt("telefono"));
                cliente.setPersonaAlternativa(rs.getString("personaAlternativa"));
                cliente.setTelefonoAlternativo(rs.getInt("telefonoAlternativo"));
                cliente.setEstado(rs.getBoolean("estado"));
            }else{
                JOptionPane.showMessageDialog(null, "El cliente no existe.");
            }
            ps.close();
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Error al acceder a la tabla cliente.");
        }
        return cliente;
    }
    
        public Cliente buscarClientePorDni(int documento){
        Cliente cliente = null;
        String sql = "SELECT * FROM cliente WHERE documento = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, documento);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                cliente = new Cliente();
                cliente.setIdCliente(rs.getInt("idCliente"));
                cliente.setDocumento(documento);
                cliente.setCabezaDeFamilia(rs.getString("CabezaDeFamilia"));
                cliente.setDireccion(rs.getString("direccion"));
                cliente.setTelefono(rs.getInt("telefono"));
                cliente.setPersonaAlternativa(rs.getString("personaAlternativa"));
                cliente.setTelefonoAlternativo(rs.getInt("telefonoAlternativo"));
                cliente.setEstado(rs.getBoolean("estado"));
            }else{
                JOptionPane.showMessageDialog(null, "El cliente no existe.");
            }
            ps.close();
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Error al acceder a la tabla cliente.");
        }
        return cliente;
    }
    
        public ArrayList<Cliente> listarClientes(){
            
            ArrayList<Cliente> clientes = new ArrayList();
            String sql = "SELECT * FROM cliente";
            
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) { 
                Cliente cliente = new Cliente();
                cliente.setIdCliente(rs.getInt("idCliente"));
                cliente.setDocumento(rs.getInt("documento"));
                cliente.setCabezaDeFamilia(rs.getString("CabezaDeFamilia"));
                cliente.setDireccion(rs.getString("direccion"));
                cliente.setTelefono(rs.getInt("telefono"));
                cliente.setPersonaAlternativa(rs.getString("personaAlternativa"));
                cliente.setTelefonoAlternativo(rs.getInt("telefonoAlternativo"));
                cliente.setEstado(rs.getBoolean("estado"));
                clientes.add(cliente);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla cliente.");
        }
            
            return clientes;
        }
    
}
