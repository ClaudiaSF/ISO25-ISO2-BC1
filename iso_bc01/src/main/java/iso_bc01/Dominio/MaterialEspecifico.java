package iso_bc01.Dominio;

public class MaterialEspecifico extends Material {
    private String codigoInventario;
    private String estado;
    private String ubicacion;

    public MaterialEspecifico(String titulo, String autor, String iSBN, String editorial, int edicion,
            boolean disponible, int cantidadDisponible, int id, String codigoInventario, String estado,
            String ubicacion) {
        super(titulo, autor, iSBN, editorial, edicion, disponible, cantidadDisponible, id);
        this.codigoInventario = codigoInventario;
        this.estado = estado;
        this.ubicacion = ubicacion;
    }

    public String getCodigoInventario() {
        return codigoInventario;
    }

    public void setCodigoInventario(String codigoBarras) {
        this.codigoInventario = codigoBarras;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
}
