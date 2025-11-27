package iso_bc01.Presentacion;

import java.util.List;

import iso_bc01.Dominio.GestorPermisos;
import iso_bc01.Dominio.Permiso;

public class IUMostrarPermisos {

    private GestorPermisos gestor;

    public IUMostrarPermisos() {
        gestor = new GestorPermisos();
    }

    public List<Permiso> mostrarPermisos() {
        System.out.println("Lista de permisos registrados:");
        for (Permiso p : gestor.listarPermisos()) {
            System.out.println("- " + p.getTipoPermiso());
        }
        return gestor.listarPermisos();
    }
}
