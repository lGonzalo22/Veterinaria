package Vistas;

import AccesoADatos.ClienteData;
import AccesoADatos.MascotaData;
import AccesoADatos.TratamientoData;
import Entidades.Cliente;
import Entidades.Mascota;
import Entidades.TiposTratamientos;
import Entidades.Tratamiento;
import java.time.LocalDate;

public class Veterinaria {

    public static void main(String[] args) {
        
        Cliente cliente = new Cliente(9,5324, "qwe", "sad", 134123, "Pipim",true);
        ClienteData clienData = new ClienteData();
        
        //clienData.agregarCliente(cliente);
        //clienData.eliminarCliente(9);

        //clienData.modificarCliente(cliente);
        
        //System.out.println(clienData.buscarClientePorId(2));
        //System.out.println(clienData.buscarClientePorDni(12345));
        
        //System.out.println(clienData.listarClientes());
        
        Mascota mascota = new Mascota(4,"Martin", "masculino", "loro", "cacique", "verde", LocalDate.of(2020, 4, 5), 0.5, 0.8, true);
        MascotaData mascData = new MascotaData();
        
        //mascData.agregarMascota(mascota);
        //mascData.eliminarMascota(4);
        //mascData.modificarMascota(mascota);
        //System.out.println(mascData.buscarMascota(1));
        //System.out.println(mascData.listarMascota());
        
        Tratamiento tratamiento = new Tratamiento(TiposTratamientos.BAÑOYCORTE, "Baño", 2000, true);
        TratamientoData tratData = new TratamientoData();
        tratData.agregarTratamiento(tratamiento);
    }
    
}
