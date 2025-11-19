package iso_bc01.Presentacion;

import iso_bc01.Dominio.Permiso;
import iso_bc01.Dominio.Usuario;
import java.util.ArrayList;
import java.util.List;

public class IUPermisos {

    public List<Permiso> mostrarPermisos() {
        System.out.println("=== Permisos del Sistema ===");

        List<Permiso> permisos = new ArrayList<>();

        // Crear usuarios ficticios
        Usuario adminUser = new Usuario("admin", "1234");
        Usuario normalUser = new Usuario("user", "abcd");

        // Crear permisos ficticios usando constructor completo
        permisos.add(new Permiso("Crear material", adminUser, 5));
        permisos.add(new Permiso("Eliminar material", adminUser, 3));
        permisos.add(new Permiso("Solicitar préstamo", normalUser, 2));
        permisos.add(new Permiso("Realizar devolución", normalUser, 2));

        // Mostrar por consola
        for (Permiso p : permisos) {
            System.out.println("- " + p.getTipoPermiso() + " (" + p.getUsername().get_username() + 
                               "), Cantidad: " + p.getCantidadPermisos());
        }

        return permisos;
    }
}