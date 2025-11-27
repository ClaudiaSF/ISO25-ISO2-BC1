package iso_bc01.Dominio;

import java.util.*;

public class GestorParametros {

    private List<Parametro> parametros = new ArrayList<>();

    public GestorParametros() {
        parametros.add(new Parametro("Seguridad", new Usuario("admin", "1234"), 3, 60.0f));
        parametros.add(new Parametro("Configuración", new Usuario("user", "abcd"), 5, 120.0f));
        parametros.add(new Parametro("Internacionalización", new Usuario("guest", "0000"), 2, 45.0f));
    }

    public Parametro crearParametro(Usuario username) {
        Parametro nuevo = new Parametro("Nuevo", username, 1, 30.0f);
        parametros.add(nuevo);
        return nuevo;
    }

    public Parametro obtenerParametro(Usuario username) {
        for (Parametro p : parametros) {
            if (p.getUsername().equals(username)) {
                return p;
            }
        }
        return null;
    }

    public boolean verificarParametro(Usuario username) {
        for (Parametro p : parametros) {
            if (p.getUsername().equals(username)) {
                return true;
            }
        }
        return false;
    }

    public Parametro modificarParametro(Parametro parametro) {
        for (Parametro p : parametros) {
            if (p.getUsername().equals(parametro.getUsername())) {
                p = parametro;
                return p;
            }
        }
        return null;
    }

    public boolean borrarParametro(Parametro parametro) {
        return parametros.remove(parametro);
    }

    public List<Parametro> listarParametros() {
        return parametros;
    }
}
