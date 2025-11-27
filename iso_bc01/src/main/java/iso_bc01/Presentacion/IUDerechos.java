package iso_bc01.Presentacion;

import java.util.*;
import iso_bc01.Dominio.Derechos;
import iso_bc01.Dominio.Usuario;

public class IUDerechos {

    public List<Derechos> mostrarDerechos(Usuario usuario) {

        System.out.println("=== Derechos del Usuario ===");
        System.out.println("Usuario: " + usuario.get_username());

        List<Derechos> lista = new ArrayList<>();

        // Derechos ficticios
        Derechos d1 = new Derechos(1, "LECTURA", "BASICO");
        Derechos d2 = new Derechos(2, "ESCRITURA", "MEDIO");

        lista.add(d1);
        lista.add(d2);

        for (Derechos d : lista) {
            System.out.println("- ID: " + d.getId() +
                    ", Tipo: " + d.getTipoAcceso() +
                    ", Nivel: " + d.getNivelAcceso());
        }

        return lista;
    }
}
