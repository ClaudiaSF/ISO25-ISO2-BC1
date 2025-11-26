package iso_bc01.Dominio;

import java.util.ArrayList;
import java.util.List;

public class GestorRoles {

    private List<Rol> roles = new ArrayList<>();

    public GestorRoles() {
        roles.add(new Rol("Administrador", new Usuario("admin", "1234"), "Acceso total al sistema"));
        roles.add(new Rol("Bibliotecario", new Usuario("biblio", "1111"), "Gestión de materiales y préstamos"));
        roles.add(new Rol("Estudiante", new Usuario("est", "0000"), "Consulta de materiales disponibles"));
    }

    public Rol crearRol(Usuario username) {
        Rol nuevo = new Rol("Nuevo Rol", username, "Rol creado por el sistema");
        roles.add(nuevo);
        return nuevo;
    }

    public Rol obtenerRol(Usuario username) {
        for (Rol r : roles) {
            if (r.getUsername().equals(username)) {
                return r;
            }
        }
        return null;
    }

    public boolean verificarRol(Usuario username) {
        for (Rol r : roles) {
            if (r.getUsername().equals(username)) {
                return true;
            }
        }
        return false;
    }

    public Rol modificarRol(Rol rol) {
        for (int i = 0; i < roles.size(); i++) {
            if (roles.get(i).getUsername().equals(rol.getUsername())) {
                roles.set(i, rol);
                return rol;
            }
        }
        return null;
    }

    public boolean borrarRol(Rol rol) {
        return roles.remove(rol);
    }

    public List<Rol> listarRoles() {
        return roles;
    }
}
