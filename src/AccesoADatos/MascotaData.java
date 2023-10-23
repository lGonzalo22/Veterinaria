package AccesoADatos;

import Entidades.Cliente;
import Entidades.Mascota;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class MascotaData {

    private Connection con = null;
    private ClienteData clienteData = new ClienteData();

    public MascotaData() {
        this.con = Conexion.getConexion();
    }

    public void agregarMascota(Mascota mascota) {

        String sql = "INSERT INTO mascota(idCliente, nombre, sexo, especie, raza, colorPelo, fechaNac, pesoMedio, pesoActual, estado) "
                + "VALUES (?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, mascota.getCliente().getIdCliente());
            ps.setString(2, mascota.getNombre());
            ps.setString(3, mascota.getSexo());
            ps.setString(4, mascota.getEspecie());
            ps.setString(5, mascota.getRaza());
            ps.setString(6, mascota.getColorPelo());
            ps.setDate(7, Date.valueOf(mascota.getFechaNac()));
            ps.setDouble(8, mascota.getPesoMedio());
            ps.setDouble(9, mascota.getPesoActual());
            ps.setBoolean(10, mascota.isEstado());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                mascota.setIdMascota(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Mascota agregada con exito.");
            } else {
                JOptionPane.showMessageDialog(null, "La mascota no se agrego.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage());
        }
    }

    public void eliminarMascota(int id) {

        String sql = "UPDATE mascota SET estado = 0 WHERE idMascota = ? and estado = 1";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int correcto = ps.executeUpdate();
            if (correcto == 1) {
                JOptionPane.showMessageDialog(null, "Mascota elimnada con exito.");
            } else {
                JOptionPane.showMessageDialog(null, "La mascota no existe.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage());
        }
    }
    
        public void activarMascota(int id) {

        String sql = "UPDATE mascota SET estado = 1 WHERE idMascota = ? and estado = 0";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int correcto = ps.executeUpdate();
            if (correcto == 1) {
                JOptionPane.showMessageDialog(null, "Mascota activada con exito.");
            } else {
                JOptionPane.showMessageDialog(null, "La mascota no existe.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage());
        }
    }

    public void modificarMascota(Mascota mascota) {
        String sql = "UPDATE mascota SET idCliente = ?, nombre = ?, sexo = ?, especie = ?, raza = ?, colorPelo = ?, fechaNac = ?, pesoMedio = ?, pesoActual = ?, estado = ? WHERE idMascota = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, mascota.getCliente().getIdCliente());
            ps.setString(2, mascota.getNombre());
            ps.setString(3, mascota.getSexo());
            ps.setString(4, mascota.getEspecie());
            ps.setString(5, mascota.getRaza());
            ps.setString(6, mascota.getColorPelo());
            ps.setDate(7, Date.valueOf(mascota.getFechaNac()));
            ps.setDouble(8, mascota.getPesoMedio());
            ps.setDouble(9, mascota.getPesoActual());
            ps.setBoolean(10, mascota.isEstado());
            ps.setInt(11, mascota.getIdMascota());
            int correcto = ps.executeUpdate();
            if (correcto == 1) {
                JOptionPane.showMessageDialog(null, "Mascota actualizada con exito.");
            } else {
                JOptionPane.showMessageDialog(null, "La mascota no existe.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage());
        }
    }

    public Mascota buscarMascota(int id) {

        Mascota mascota = null;
        String sql = "SELECT * FROM mascota WHERE idMascota = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                mascota = new Mascota();
                mascota.setIdMascota(id);
                Cliente cliente = clienteData.buscarClientePorId(rs.getInt("idCliente"));
                mascota.setCliente(cliente);
                mascota.setNombre(rs.getString("nombre"));
                mascota.setSexo(rs.getString("sexo"));
                mascota.setEspecie(rs.getString("especie"));
                mascota.setRaza(rs.getString("raza"));
                mascota.setColorPelo(rs.getString("colorPelo"));
                mascota.setFechaNac(rs.getDate("fechaNac").toLocalDate());
                mascota.setPesoMedio(rs.getDouble("pesoMedio"));
                mascota.setPesoActual(rs.getDouble("pesoActual"));
                mascota.setEstado(rs.getBoolean("estado"));
            } else {
                JOptionPane.showMessageDialog(null, "La mascota no existe.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage());
        }
        return mascota;
    }

    public ArrayList<Mascota> listarMascota() {

        ArrayList<Mascota> mascotas = new ArrayList();

        String sql = "SELECT * FROM mascota";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Mascota mascota = new Mascota();
                mascota.setIdMascota(rs.getInt("idMascota"));
                mascota.setCliente(clienteData.buscarClientePorId(rs.getInt("idCliente")));
                mascota.setNombre(rs.getString("nombre"));
                mascota.setSexo(rs.getString("sexo"));
                mascota.setEspecie(rs.getString("especie"));
                mascota.setRaza(rs.getString("raza"));
                mascota.setColorPelo(rs.getString("colorPelo"));
                mascota.setFechaNac(rs.getDate("fechaNac").toLocalDate());
                mascota.setPesoMedio(rs.getDouble("pesoMedio"));
                mascota.setPesoActual(rs.getDouble("pesoActual"));
                mascota.setEstado(rs.getBoolean("estado"));
                mascotas.add(mascota);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage());
        }
        return mascotas;
    }
    
    
        public ArrayList<Mascota> listarMascotaPorCliente(int id) {

        ArrayList<Mascota> mascotas = new ArrayList();

        String sql = "SELECT * FROM mascota WHERE idCliente = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Mascota mascota = new Mascota();
                mascota.setIdMascota(rs.getInt("idMascota"));
                mascota.setCliente(clienteData.buscarClientePorId(id));
                mascota.setNombre(rs.getString("nombre"));
                mascota.setSexo(rs.getString("sexo"));
                mascota.setEspecie(rs.getString("especie"));
                mascota.setRaza(rs.getString("raza"));
                mascota.setColorPelo(rs.getString("colorPelo"));
                mascota.setFechaNac(rs.getDate("fechaNac").toLocalDate());
                mascota.setPesoMedio(rs.getDouble("pesoMedio"));
                mascota.setPesoActual(rs.getDouble("pesoActual"));
                mascota.setEstado(rs.getBoolean("estado"));
                mascotas.add(mascota);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage());
        }
        return mascotas;
    }
    
}
