package Entidades;

public class Tratamiento {
    
    private int idTratamiento;
    private String tipo;
    private String descripcion;
    private double importe;
    private boolean estado;

    public Tratamiento(int idTratamiento, String tipo, String descripcion, double importe, boolean estado) {
        this.idTratamiento = idTratamiento;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.importe = importe;
        this.estado = estado;
    }

        public Tratamiento(String tipo, String descripcion, double importe, boolean estado) {
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.importe = importe;
        this.estado = estado;
    }
    
    public Tratamiento() {
    }

    public int getIdTratamiento() {
        return idTratamiento;
    }

    public void setIdTratamiento(int idTratamiento) {
        this.idTratamiento = idTratamiento;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Tratamiento{" + "idTratamiento=" + idTratamiento + ", tipo=" + tipo + ", descripcion=" + descripcion + ", importe=" + importe + ", estado=" + estado + '}';
    }
}
