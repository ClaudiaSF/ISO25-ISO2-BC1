package iso_bc01.Presentacion;

import iso_bc01.Dominio.*;
import java.util.*;

public class IU_MostrarRoles {

    private gestorRoles gestor;

    public IU_MostrarRoles() {
        gestor = new gestorRoles();
    }

    public List<Rol> mostrarRoles() {
        System.out.println("Lista de roles disponibles:");
        
        for (Rol r : gestor.listarRoles()) {
            System.out.println("- " + r.getTipoRol() + " (" + r.getDescripcion() + ")");
        }
        return gestor.listarRoles();
    }
}
