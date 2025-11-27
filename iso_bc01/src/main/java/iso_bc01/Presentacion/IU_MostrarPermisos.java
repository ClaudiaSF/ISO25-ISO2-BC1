package iso_bc01.Presentacion;

import iso_bc01.Dominio.*;
import java.util.*;

public class IU_MostrarPermisos {

    private gestorPermisos gestor;

    public IU_MostrarPermisos() {
        gestor = new gestorPermisos();
    }

    public List<Permiso> mostrarPermisos() {
        System.out.println("Lista de permisos registrados:");
        
        for (Permiso p : gestor.listarPermisos()) {
            System.out.println("- " + p.getTipoPermiso());
        }
        return gestor.listarPermisos();
    }
}
