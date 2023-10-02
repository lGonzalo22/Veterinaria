package Entidades;

public class Visita {
    
    private int idVisita;
    private Cliente cliente;
    private Mascota mascota;
    private Tratamiento tratamiento;

    public Visita(int idVisita, Cliente cliente, Mascota mascota, Tratamiento tratamiento) {
        this.idVisita = idVisita;
        this.cliente = cliente;
        this.mascota = mascota;
        this.tratamiento = tratamiento;
    }

        public Visita(Cliente cliente, Mascota mascota, Tratamiento tratamiento) {
        this.cliente = cliente;
        this.mascota = mascota;
        this.tratamiento = tratamiento;
    }
    
    public Visita() {
    }

    @Override
    public String toString() {
        return "Visita{" + "idVisita=" + idVisita + ", cliente=" + cliente + ", mascota=" + mascota + ", tratamiento=" + tratamiento + '}';
    }
    
    
    
}
