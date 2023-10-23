package Entidades;

public class Cliente {

    private int idCliente;
    private int documento;
    private String cabezaDeFamilia;
    private String direccion;
    private long telefono;
    private String personaAlternativa;
    private long telefonoAlternativo;
    private boolean estado;

    public Cliente(int idCliente, int documento, String cabezaDeFamilia, String direccion, long telefono, String personaAlternativa, long telefonoAlternativo, boolean estado) {
        this.idCliente = idCliente;
        this.documento = documento;
        this.cabezaDeFamilia = cabezaDeFamilia;
        this.direccion = direccion;
        this.telefono = telefono;
        this.personaAlternativa = personaAlternativa;
        this.telefonoAlternativo = telefonoAlternativo;
        this.estado = estado;
    }

    public Cliente(int documento, String cabezaDeFamilia, String direccion, long telefono, String personaAlternativa, long telefonoAlternativo, boolean estado) {
        this.documento = documento;
        this.cabezaDeFamilia = cabezaDeFamilia;
        this.direccion = direccion;
        this.telefono = telefono;
        this.personaAlternativa = personaAlternativa;
        this.telefonoAlternativo = telefonoAlternativo;
        this.estado = estado;
    }

    public Cliente() {
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getCabezaDeFamilia() {
        return cabezaDeFamilia;
    }

    public void setCabezaDeFamilia(String cabezaDeFamilia) {
        this.cabezaDeFamilia = cabezaDeFamilia;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public String getPersonaAlternativa() {
        return personaAlternativa;
    }

    public void setPersonaAlternativa(String personaAlternativa) {
        this.personaAlternativa = personaAlternativa;
    }

    public long getTelefonoAlternativo() {
        return telefonoAlternativo;
    }

    public void setTelefonoAlternativo(long telefonoAlternativo) {
        this.telefonoAlternativo = telefonoAlternativo;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return idCliente + ", " + documento + ", " + cabezaDeFamilia;
    }
}
