package iso_bc01.Presentacion;

import iso_bc01.Dominio.Rol;
import iso_bc01.Dominio.Usuario;
import java.util.*;

public class IURoles {

    public List<Rol> mostrarRoles() {
        System.out.println("=== Roles del Sistema ===");

        List<Rol> roles = new ArrayList<>();

        // Usuario ficticio
        Usuario adminUser = new Usuario("admin", "1234");
        Usuario normalUser = new Usuario("user", "abcd");

        // Crear roles ficticios usando el constructor completo
        Rol admin = new Rol("Administrador", adminUser, "Rol con todos los permisos");
        Rol user = new Rol("Usuario", normalUser, "Rol con permisos limitados");

        roles.add(admin);
        roles.add(user);

        // Mostrar por consola
        for (Rol r : roles) {
            System.out.println("- " + r.getTipoRol() + " (" + r.getUsername().get_username() + ")");
        }
        return roles;
    }
}
