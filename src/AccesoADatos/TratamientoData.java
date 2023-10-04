package AccesoADatos;

import Entidades.TiposTratamientos;
import Entidades.Tratamiento;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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

    public void eliminarTratamiento(int id) {

        String sql = "UPDATE tratamiento SET activo = 0 WHERE idTratamiento = ? and activo = 1";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int correcto = ps.executeUpdate();
            if (correcto == 1) {
                JOptionPane.showMessageDialog(null, "Tratamiento eliminado.");
            } else {
                JOptionPane.showMessageDialog(null, "El tratamiento no existe.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage());
        }
    }
    
    public void modificarTratamiento(Tratamiento trat){
        
        String sql = "UPDATE tratamiento SET tipo = ?, descripcion = ?, importe = ?, activo = ? WHERE idTratamiento = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, trat.getTipo().toString());
            ps.setString(2, trat.getDescripcion());
            ps.setDouble(3, trat.getImporte());
            ps.setBoolean(4, trat.isEstado());
            ps.setInt(5, trat.getIdTratamiento());
            int correcto = ps.executeUpdate();
            if (correcto == 1) {
                JOptionPane.showMessageDialog(null, "Tratamiento modificado correctamente.");
            }else{
                JOptionPane.showMessageDialog(null, "El tratamiento no existe.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage());
        }
    }
    
    public Tratamiento buscarTratamiento(int id){
        
        Tratamiento trat = null;
        
        String sql = "SELECT * FROM tratamiento WHERE idTratamiento = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                trat = new Tratamiento();
                trat.setIdTratamiento(id);
                trat.setTipo(TiposTratamientos.valueOf(rs.getString("tipo")));
                trat.setDescripcion(rs.getString("descripcion"));
                trat.setImporte(rs.getDouble("importe"));
                trat.setEstado(rs.getBoolean("activo"));
            }else{
                JOptionPane.showMessageDialog(null, "El tratamiento no existe.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage());
        }
        return trat;
    }
    
    public ArrayList<Tratamiento> listarTratamientoPorTipo(TiposTratamientos tipo){
        
        String sql = "SELECT * FROM tratamiento WHERE tipo = ?";
        ArrayList<Tratamiento> tiposTrat = new ArrayList();
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, tipo.toString());
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Tratamiento trat = new Tratamiento();
                trat.setIdTratamiento(rs.getInt("idTratamiento"));
                trat.setTipo(TiposTratamientos.valueOf(rs.getString("tipo")));
                trat.setDescripcion(rs.getString("descripcion"));
                trat.setImporte(rs.getDouble("importe"));
                trat.setEstado(rs.getBoolean("activo"));
                tiposTrat.add(trat);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage());
        }
        return tiposTrat;
    }
    
    public ArrayList<Tratamiento> listarTratamiento(){
        
        String sql = "SELECT * FROM tratamiento WHERE activo = 1";
        ArrayList<Tratamiento> tratamientos = new ArrayList();
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Tratamiento trat = new Tratamiento();
                trat.setIdTratamiento(rs.getInt("idTratamiento"));
                trat.setTipo(TiposTratamientos.valueOf(rs.getString("tipo")));
                trat.setDescripcion(rs.getString("descripcion"));
                trat.setImporte(rs.getDouble("importe"));
                trat.setEstado(rs.getBoolean("activo"));
                tratamientos.add(trat);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage());
        }
        
        return tratamientos;
    }
}
