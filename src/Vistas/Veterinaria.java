package Vistas;

import AccesoADatos.ClienteData;
import Entidades.Cliente;

public class Veterinaria {

    public static void main(String[] args) {
        
        Cliente cliente = new Cliente(5,1234, "Golum", "Peron 534", 121351324, "Smeagol",true);
        ClienteData clienData = new ClienteData();
        
        //clienData.agregarCliente(cliente);
        //clienData.eliminarCliente(5);
        
        
        
        clienData.modificarCliente(cliente);
    }
    
}
