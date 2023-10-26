package AccesoADatos;

import Entidades.Cliente;
import Entidades.Mascota;
import Entidades.TiposTratamientos;
import Entidades.Tratamiento;
import Entidades.Visita;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.mariadb.jdbc.Statement;

public class VisitaData {

    private Connection con = null;
    private MascotaData mascData = new MascotaData();
    private TratamientoData tratData = new TratamientoData();
    private ClienteData clienData = new ClienteData();

    public VisitaData() {
        this.con = Conexion.getConexion();
    }

    public void agregarVisita(Visita visita) {

        String sql = "INSERT INTO visita(idMascota, idTratamiento, idCliente, pesoActual, fechaVisita) "
                + "VALUES (?,?,?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, visita.getMascota().getIdMascota());
            ps.setInt(2, visita.getTratamiento().getIdTratamiento());
            ps.setInt(3, visita.getCliente().getIdCliente());
            ps.setDouble(4, visita.getPesoActual());
            ps.setDate(5, Date.valueOf(visita.getFechaVisita()));
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                visita.setIdVisita(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Visita agregada con exito.");
                System.out.println(pesoPromedio(visita));
            } else {
                JOptionPane.showMessageDialog(null, "La visita no se agrego.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage());
        }
    }

    public double pesoPromedio(Visita visita) {

        String sql = "SELECT pesoActual FROM visita WHERE idMascota = " + visita.getMascota().getIdMascota();

        double pesoPromedio = 0;
        double sumaPesoActual = 0;
        double pesoActualBaseDatos = 0;
        int cont = 0;

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            rs.last();//el ultimo

            while (rs.previous()) { //desde el ultimo para abajo
                cont++;
                if (cont < 10) {
                    pesoActualBaseDatos = rs.getDouble("pesoActual");
                    sumaPesoActual += pesoActualBaseDatos;
                } else {
                    break;
                }
            }

            sumaPesoActual = (sumaPesoActual + visita.getPesoActual());
            pesoPromedio = sumaPesoActual / cont;
            //System.out.println("SumaPesoActual: " + sumaPesoActual);
            //System.out.println("Peso promedio: " + pesoPromedio);

            String sql2 = "UPDATE mascota SET pesoMedio = " + pesoPromedio + "WHERE idMascota = " + visita.getMascota().getIdMascota();
            PreparedStatement ps2 = con.prepareStatement(sql2);
            int correcto = ps2.executeUpdate();
            if (correcto == 1) {
                
            } else {
                JOptionPane.showMessageDialog(null, "La mascota no existe.");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage());
        }

        return pesoPromedio;
    }

    public Visita buscarVisitaPorId(int id) {
        Visita visita = null;
        String sql = "SELECT * FROM visita WHERE idVisita = " + id;

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                visita = new Visita();
                visita.setIdVisita(id);
                visita.setCliente(clienData.buscarClientePorId(rs.getInt("idCliente")));
                visita.setMascota(mascData.buscarMascota(rs.getInt("idMascota")));
                visita.setTratamiento(tratData.buscarTratamiento(rs.getInt("idTratamiento")));
                visita.setFechaVisita(rs.getDate("fechaVisita").toLocalDate());
                visita.setPesoActual(rs.getDouble("pesoActual"));
            } else {
                JOptionPane.showMessageDialog(null, "La visita no existe.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage());
        }
        return visita;
    }

    public Visita buscarVisitaPorIdSinCartel(int id) {
        Visita visita = null;
        String sql = "SELECT * FROM visita WHERE idVisita = " + id;

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                visita = new Visita();
                visita.setIdVisita(id);
                visita.setCliente(clienData.buscarClientePorId(rs.getInt("idCliente")));
                visita.setMascota(mascData.buscarMascota(rs.getInt("idMascota")));
                visita.setTratamiento(tratData.buscarTratamiento(rs.getInt("idTratamiento")));
                visita.setFechaVisita(rs.getDate("fechaVisita").toLocalDate());
                visita.setPesoActual(rs.getDouble("pesoActual"));
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage());
        }
        return visita;
    }

    public void modificarVisita(Visita visita) {

        String sql = "UPDATE visita SET idMascota = ?, idTratamiento = ?, idCliente = ?, pesoActual = ?, fechaVisita = ? WHERE idVisita = " + visita.getIdVisita();

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, visita.getMascota().getIdMascota());
            ps.setInt(2, visita.getTratamiento().getIdTratamiento());
            ps.setInt(3, visita.getCliente().getIdCliente());
            ps.setDouble(4, visita.getPesoActual());
            ps.setDate(5, Date.valueOf(visita.getFechaVisita()));

            int correcto = ps.executeUpdate();
            if (correcto == 1) {
                JOptionPane.showMessageDialog(null, "Visita modificada con exito.");
            } else {
                JOptionPane.showMessageDialog(null, "La visita no existe.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage());
        }
    }

    public ArrayList<Visita> listarVisitasPorMascota(int id) {

        ArrayList<Visita> visitas = new ArrayList();

        String sql = "SELECT * FROM visita WHERE idMascota = " + id;

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Visita visita = new Visita();
                visita.setIdVisita(rs.getInt("idVisita"));
                Mascota mascota = mascData.buscarMascota(id);
                visita.setMascota(mascota);
                Tratamiento tratamiento = tratData.buscarTratamiento(rs.getInt("idTratamiento"));
                visita.setTratamiento(tratamiento);
                Cliente cliente = clienData.buscarClientePorId(rs.getInt("idCliente"));
                visita.setCliente(cliente);
                visita.setPesoActual(rs.getDouble("pesoActual"));
                visita.setFechaVisita(rs.getDate("fechaVisita").toLocalDate());
                visitas.add(visita);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage());
        }

        return visitas;
    }

    public ArrayList<Visita> listarVisitasPorTipoTratamiento(TiposTratamientos tipo) {

        String sql = "SELECT * FROM visita WHERE idTratamiento in (SELECT idTratamiento FROM tratamiento WHERE tipo = ?)";
        ArrayList<Visita> visitas = new ArrayList();

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, tipo.toString());
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Visita visita = new Visita();
                visita.setIdVisita(rs.getInt("idVisita"));
                Mascota mascota = mascData.buscarMascota(rs.getInt("idMascota"));
                visita.setMascota(mascota);
                Tratamiento tratamiento = tratData.buscarTratamiento(rs.getInt("idTratamiento"));
                visita.setTratamiento(tratamiento);
                Cliente cliente = clienData.buscarClientePorId(rs.getInt("idCliente"));
                visita.setCliente(cliente);
                visita.setPesoActual(rs.getDouble("pesoActual"));
                visita.setFechaVisita(rs.getDate("fechaVisita").toLocalDate());
                visitas.add(visita);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage());
        }
        return visitas;
    }

}
