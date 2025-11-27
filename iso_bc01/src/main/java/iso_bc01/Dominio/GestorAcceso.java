package iso_bc01.Dominio;

import java.util.ArrayList;
import java.util.List;

public class GestorAcceso {

    public boolean verificarIdentidad(Usuario usuario) {
    	return usuario.get_password().equals("1234");
    }

    public List<Derechos> comprobarDerechos(Usuario usuario) {
        List<Derechos> lista = new ArrayList<>();
        lista.add(new Derechos(1, "LECTURA", "BASICO"));
        lista.add(new Derechos(2, "VISUALIZACIÓN", "ALTO"));
        return lista;
    }
}


