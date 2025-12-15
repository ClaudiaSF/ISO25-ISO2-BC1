package iso_bc01.Dominio;

public class Suscripcion extends Bibliografia {
    private String proyecto;
    private String estado;

    public Suscripcion(int id, String titulo, String autor, String anio, String enlace,
                       String proyecto, String estado) {
        super(id, titulo, autor, anio, enlace);
        this.proyecto = proyecto;
        this.estado = estado;
    }

    public String getProyecto() {
        return proyecto;
    }

    public void setProyecto(String proyecto) {
        this.proyecto = proyecto;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
