package Vistas;

import AccesoADatos.ClienteData;
import AccesoADatos.MascotaData;
import AccesoADatos.TratamientoData;
import AccesoADatos.VisitaData;
import Entidades.Cliente;
import Entidades.Mascota;
import Entidades.TiposTratamientos;
import Entidades.Tratamiento;
import Entidades.Visita;
import java.time.LocalDate;

public class Veterinaria {

    public static void main(String[] args) {

        Cliente cliente = new Cliente(2,43121, "Gandalf", "Mitre 243", 65342312, "Gimly",234565,true);
        ClienteData clienData = new ClienteData();
        
        //clienData.agregarCliente(cliente);
        //clienData.eliminarCliente(9);

        //clienData.modificarCliente(cliente);
        
        //System.out.println(clienData.buscarClientePorId(2));
        //System.out.println(clienData.buscarClientePorDni(12345));
        
        System.out.println(clienData.listarClientes());
        
        Mascota mascota = new Mascota(5,cliente,"Yago", "masculino", "perro", "golden", "negro", LocalDate.of(2010, 5, 25), 48.375, 52, true);
        MascotaData mascData = new MascotaData();
        
        //mascData.agregarMascota(mascota);
        
        //mascData.eliminarMascota(3);
        //mascData.modificarMascota(mascota);
        //System.out.println(mascData.buscarMascota(3));
        //System.out.println(mascData.listarMascota());
        //System.out.println(mascData.listarMascotaPorCliente(1));
        
        Tratamiento tratamiento = new Tratamiento(19,TiposTratamientos.CONTROL, "Undecimo control posterior a la cirugia", 3500, true);
        TratamientoData tratData = new TratamientoData();
        //tratData.agregarTratamiento(tratamiento);
        //tratData.eliminarTratamiento(1);
        //tratData.modificarTratamiento(tratamiento);
        //System.out.println(tratData.buscarTratamiento(1));
        //System.out.println(tratData.listarTratamientoPorTipo(TiposTratamientos.BAÑOYCORTE));
        //System.out.println(tratData.listarTratamiento());
        //System.out.println(tratData.importeContado(tratamiento));
        
        
        Visita visita = new Visita(46,cliente, mascota, tratamiento, 53.5, LocalDate.of(2023, 10, 3));
        VisitaData visData = new VisitaData();
        //visData.agregarVisita(visita);
        //visData.modificarVisita(visita);
        //System.out.println(visData.listarVisitasPorMascota(5));
        //System.out.println(visData.listarVisitasPorTipoTratamiento(TiposTratamientos.CONTROL));
    }
}
