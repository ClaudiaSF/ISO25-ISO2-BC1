package iso_bc01.Dominio;

public class Solicitud {
    private int id;
    private Estudiante estudiante;
    private String tipoMaterial;
    private String fechaSolicitud;

    public Solicitud(int id, Estudiante estudiante, String tipoMaterial, String fechaSolicitud) {
        this.id = id;
        this.estudiante = estudiante;
        this.tipoMaterial = tipoMaterial;
        this.fechaSolicitud = fechaSolicitud;
    }

    public int getId() {
        return id;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public String getTipoMaterial() {
        return tipoMaterial;
    }

    public String getFechaSolicitud() {
        return fechaSolicitud;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public void setTipoMaterial(String tipoMaterial) {
        this.tipoMaterial = tipoMaterial;
    }

    public void setFechaSolicitud(String fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }
}