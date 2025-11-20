package iso_bc01.Presentacion;

import iso_bc01.Dominio.Parametro;
import iso_bc01.Dominio.Usuario;
import java.util.ArrayList;
import java.util.List;

public class IUParametros {

    public List<Parametro> mostrarParametros() {
        System.out.println("=== Parámetros del Sistema ===");

        List<Parametro> parametros = new ArrayList<>();

        // Usuarios ficticios
        Usuario adminUser = new Usuario("admin", "1234");
        Usuario normalUser = new Usuario("user", "abcd");

        // Crear parámetros ficticios usando constructor completo
        parametros.add(new Parametro("TiempoMáximoPrestamo", adminUser, 1, 7.0f));
        parametros.add(new Parametro("CantidadMáximaReservas", adminUser, 1, 3.0f));
        parametros.add(new Parametro("LimiteSesionUsuario", normalUser, 1, 2.0f));

        // Mostrar por consola
        for (Parametro p : parametros) {
            System.out.println("- " + p.getTipoParametro() +
                               ", Usuario: " + p.getUsername().get_username() +
                               ", Cantidad: " + p.getCantidadParametros() +
                               ", Límite de sesión: " + p.getLimitesSesion());
        }

        return parametros;
    }
}
