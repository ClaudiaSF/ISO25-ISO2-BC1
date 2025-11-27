package iso_bc01.Dominio;

public class Suscripcion {
    private int id;
    private String proyecto;
    private String estado;

    public Suscripcion(int id, String proyecto, String estado) {
        this.id = id;
        this.proyecto = proyecto;
        this.estado = estado;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setProyecto(String proyecto) {
        this.proyecto = proyecto;
    }

    public String getProyecto() {
        return proyecto;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

}
