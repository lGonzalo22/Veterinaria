package Entidades;

import java.time.LocalDate;

public class Visita {
    
    private int idVisita;
    private Cliente cliente;
    private Mascota mascota;
    private Tratamiento tratamiento;
    private LocalDate fechaVisita;

    public Visita(int idVisita, Cliente cliente, Mascota mascota, Tratamiento tratamiento, LocalDate fechaVisita) {
        this.idVisita = idVisita;
        this.cliente = cliente;
        this.mascota = mascota;
        this.tratamiento = tratamiento;
        this.fechaVisita = fechaVisita;
    }

        public Visita(Cliente cliente, Mascota mascota, Tratamiento tratamiento, LocalDate fechaVisita) {
        this.cliente = cliente;
        this.mascota = mascota;
        this.tratamiento = tratamiento;
        this.fechaVisita = fechaVisita;
    }
    
    public Visita() {
    }

    public int getIdVisita() {
        return idVisita;
    }

    public void setIdVisita(int idVisita) {
        this.idVisita = idVisita;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public Tratamiento getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(Tratamiento tratamiento) {
        this.tratamiento = tratamiento;
    }

    public LocalDate getFechaVisita() {
        return fechaVisita;
    }

    public void setFechaVisita(LocalDate fechaVisita) {
        this.fechaVisita = fechaVisita;
    }

    @Override
    public String toString() {
        return "Visita{" + "idVisita=" + idVisita + ", cliente=" + cliente + ", mascota=" + mascota + ", tratamiento=" + tratamiento + ", fechaVisita=" + fechaVisita + '}';
    }
    
    
    
}
