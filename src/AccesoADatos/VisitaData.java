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

        int cantidadVisita = 0;
        int visitaTotales = 0;
        int diferencia = 0;
        double pesoPromedio = 0;
        double sumaPesoActual = 0;
        double pesoActualBaseDatos = 0;
        double pesoRestarBaseDatos = 0;
        double sumaDifencia = 0;
        int cantidadDif = 0;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                pesoActualBaseDatos = rs.getDouble("pesoActual");
                cantidadVisita++;
                if (cantidadVisita > 9) {
                    diferencia++;
                }
                sumaPesoActual = sumaPesoActual + pesoActualBaseDatos;
                System.out.println("Peso Actual: " + pesoActualBaseDatos);

            }
            while (rs.next()) {
                if (diferencia != 0) {
                    pesoRestarBaseDatos = rs.getDouble("pesoActual");
                    sumaDifencia = sumaDifencia + pesoRestarBaseDatos;
                    cantidadDif++;
                    System.out.println(cantidadDif);
                    if (cantidadDif == diferencia) {
                        break;
                    }
                }
            }

            //List<Double> pesoActualList = new ArrayList<>();
            //
            //while (rs.next()) {
            //    double pesoActualBaseDatos = rs.getDouble("pesoActual");
            //    cantidadVisita++;
            //    if (cantidadVisita > 9) {
            //        diferencia++;
            //    }
            //    sumaPesoActual += pesoActualBaseDatos;
            //    System.out.println("Peso Actual: " + pesoActualBaseDatos);
            //    pesoActualList.add(pesoActualBaseDatos);
            //}
            //
            //for (int i = 0; i < diferencia; i++) {
            //    if (!pesoActualList.isEmpty()) {
            //        double pesoRestarBaseDatos = pesoActualList.remove(pesoActualList.size() - 1);
            //        sumaDiferencia += pesoRestarBaseDatos;
            //        cantidadDif++;
            //        System.out.println(cantidadDif);
            //    }
            //}
            sumaPesoActual = (sumaPesoActual + visita.getPesoActual()) - sumaDifencia;
            cantidadVisita = cantidadVisita - diferencia;
            pesoPromedio = sumaPesoActual / cantidadVisita;
            System.out.println("SumaPesoActual: " + sumaPesoActual);
            System.out.println("Suma difencia: " + sumaDifencia);
            System.out.println("Peso promedio: " + pesoPromedio);

            String sql2 = "UPDATE mascota SET pesoMedio = " + pesoPromedio + "WHERE idMascota = " + visita.getMascota().getIdMascota();
            PreparedStatement ps2 = con.prepareStatement(sql2);
            int correcto = ps2.executeUpdate();
            if (correcto == 1) {
                JOptionPane.showMessageDialog(null, "Peso medio modificado con exito.");
            } else {
                JOptionPane.showMessageDialog(null, "La mascota no existe.");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage());
        }

        return pesoPromedio;
    }

}
