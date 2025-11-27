package iso_bc01.Presentacion;

import iso_bc01.Dominio.*;

public class IUBusquedaMaterial {

    public Material introducirTitulo(String titulo) {
        Catalogo catalogo = new Catalogo();
        catalogo.anadir(new Material("Diseño de Software", "Gamma", "123", "Pearson", 1, true, 20, 0));
        catalogo.anadir(new Material("Bases de Datos", "Date", "456", "McGrawHill", 5, false, 5, 1));

        GestorBusqueda gb = new GestorBusqueda();
        return gb.comprobarTitulo(catalogo, titulo);
    }
}
