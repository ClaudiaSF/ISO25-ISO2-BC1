package iso_bc01.Presentacion;

import java.util.List;

import iso_bc01.Dominio.Bibliografia;
import iso_bc01.Dominio.GestorBibliografia;

public class IUGestionBibliografia {

    public List<Bibliografia> mostrarBibliografias() {
        // Implementación para devolver lista real usando GestorBibliografia
        GestorBibliografia gestor = new GestorBibliografia();
        if (gestor.verificarBibliografia()) {
            return gestor.obtenerBibliografia();
        } else {
            // Puede lanzar excepción, o devolver lista vacía
            return List.of(); 
        }
    }
}
