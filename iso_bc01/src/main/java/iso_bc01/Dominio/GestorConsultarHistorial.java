package iso_bc01.Dominio;

import java.util.*;

public class GestorConsultarHistorial {
	public Estudiante estudiante;

	public boolean verificarUsuario(Usuario username) {
		return username != null;
	}

	public List<Prestamo> obtenerHistorial( Estudiante estudiante) {
		List<Prestamo> historial = new ArrayList<>();
		// Retornamos lista vacía por defecto; la IU puede rellenar datos ficticios si es necesario
		return historial;
	}
}
