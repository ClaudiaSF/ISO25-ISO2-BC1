package iso_bc01.Dominio;

import java.util.List;

public class GestorDerechos {

	 public List<Derechos> mostrarDerechos(Usuario usuario) {
	        GestorAcceso g = new GestorAcceso();
	        return g.comprobarDerechos(usuario);
	    }
	}
