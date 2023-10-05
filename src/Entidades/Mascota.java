package Entidades;

import java.time.LocalDate;

public class Mascota {
    
    private int idMascota;
    private Cliente cliente;
    private String nombre;
    private String sexo;
    private String especie;
    private String raza;
    private String colorPelo;
    private LocalDate fechaNac;
    private double pesoMedio;
    private double pesoActual;
    private boolean estado;

    public Mascota(int idMascota, Cliente cliente, String nombre, String sexo, String especie, String raza, String colorPelo, LocalDate fechaNac, double pesoMedio, double pesoActual, boolean estado) {
        this.idMascota = idMascota;
        this.cliente = cliente;
        this.nombre = nombre;
        this.sexo = sexo;
        this.especie = especie;
        this.raza = raza;
        this.colorPelo = colorPelo;
        this.fechaNac = fechaNac;
        this.pesoMedio = pesoMedio;
        this.pesoActual = pesoActual;
        this.estado = estado;
    }

        public Mascota(Cliente cliente,String nombre, String sexo, String especie, String raza, String colorPelo, LocalDate fechaNac, double pesoMedio, double pesoActual, boolean estado) {
        this.cliente = cliente;
        this.nombre = nombre;
        this.sexo = sexo;
        this.especie = especie;
        this.raza = raza;
        this.colorPelo = colorPelo;
        this.fechaNac = fechaNac;
        this.pesoMedio = pesoMedio;
        this.pesoActual = pesoActual;
        this.estado = estado;
    }
    
    public Mascota() {
    }

    public int getIdMascota() {
        return idMascota;
    }

    public void setIdMascota(int idMascota) {
        this.idMascota = idMascota;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColorPelo() {
        return colorPelo;
    }

    public void setColorPelo(String colorPelo) {
        this.colorPelo = colorPelo;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    public double getPesoMedio() {
        return pesoMedio;
    }

    public void setPesoMedio(double pesoMedio) {
        this.pesoMedio = pesoMedio;
    }

    public double getPesoActual() {
        return pesoActual;
    }

    public void setPesoActual(double pesoActual) {
        this.pesoActual = pesoActual;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Mascota{" + "idMascota=" + idMascota + ", cliente=" + cliente + ", nombre=" + nombre + ", sexo=" + sexo + ", especie=" + especie + ", raza=" + raza + ", colorPelo=" + colorPelo + ", fechaNac=" + fechaNac + ", pesoMedio=" + pesoMedio + ", pesoActual=" + pesoActual + ", estado=" + estado + '}';
    }    
}
