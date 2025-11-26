package iso_bc01.Presentacion;

import iso_bc01.Dominio.*;
import java.util.List;

public class IUMostrarRoles {

    private GestorRoles gestor;

    public IUMostrarRoles() {
        gestor = new GestorRoles();
    }

    public List<Rol> mostrarRoles() {
        System.out.println("Lista de roles disponibles:");
        for (Rol r : gestor.listarRoles()) {
            System.out.println("- " + r.getTipoRol() + " (" + r.getDescripcion() + ")");
        }
        return gestor.listarRoles();
    }
}

