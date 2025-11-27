package iso_bc01.Dominio;

import java.util.ArrayList;
import java.util.List;

public class GestorPermisos {

    private List<Permiso> permisos = new ArrayList<>();

    public GestorPermisos() {
        permisos.add(new Permiso("Lectura", new Usuario("admin", "1234"), 2));
        permisos.add(new Permiso("Escritura", new Usuario("user", "abcd"), 3));
        permisos.add(new Permiso("Administración", new Usuario("super", "root"), 1));
    }

    public Permiso crearPermiso(Usuario username) {
        Permiso nuevo = new Permiso("Nuevo permiso", username, 1);
        permisos.add(nuevo);
        return nuevo;
    }

    public Permiso obtenerPermiso(Usuario username) {
        for (Permiso p : permisos) {
            if (p.getUsername().equals(username)) {
                return p;
            }
        }
        return null;
    }

    public boolean verificarPermiso(Usuario username) {
        for (Permiso p : permisos) {
            if (p.getUsername().equals(username)) {
                return true;
            }
        }
        return false;
    }

    public Permiso modificarPermiso(Permiso permiso) {
        for (Permiso p : permisos) {
            if (p.getUsername().equals(permiso.getUsername())) {
                p = permiso;
                return p;
            }
        }
        return null;
    }

    public boolean borrarPermiso(Permiso permiso) {
        return permisos.remove(permiso);
    }

    public List<Permiso> listarPermisos() {
        return permisos;
    }
}
