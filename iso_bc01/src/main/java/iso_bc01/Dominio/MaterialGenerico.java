package iso_bc01.Dominio;

public class MaterialGenerico extends Material {
    private String categoria;
    private String marca;

    public MaterialGenerico(String titulo, String autor, String iSBN, String editorial, int edicion,
            boolean disponible, int cantidadDisponible, int id, String codigoInventario, String estado,
            String ubicacion) {
        super(titulo, autor, iSBN, editorial, edicion, disponible, cantidadDisponible, id);
        this.categoria = codigoInventario;
        this.marca = estado;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String codigoBarras) {
        this.categoria = codigoBarras;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String estado) {
        this.marca = estado;
    }

}
