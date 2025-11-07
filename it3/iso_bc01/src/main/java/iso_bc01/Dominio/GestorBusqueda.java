package iso_bc01.Dominio;

public class GestorBusqueda {

    public Material comprobarTitulo(Catalogo catalogo, String titulo) {
        // Iteramos sobre la lista de materiales del catálogo
        for (Material m : catalogo.listarCatalogo()) {
            if (m.getTitulo().equalsIgnoreCase(titulo)) {
                return m;
            }
        }
        return null;
    }
}
