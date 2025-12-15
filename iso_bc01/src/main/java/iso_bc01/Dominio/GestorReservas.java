package iso_bc01.Dominio;

import iso_bc01.Persistencia.MiAgente;
import java.util.*;

public class GestorReservas {
	private MiAgente agenteBD;
	private List<Reserva> reservas = new ArrayList<>();

	public Reserva crearReserva(Object aEst, Object aMat) {
		Estudiante est = (aEst instanceof Estudiante) ? (Estudiante) aEst : null;
		Material mat = (aMat instanceof Material) ? (Material) aMat : null;
		Reserva r = new Reserva();
		r.setId((int)(Math.random()*1000)+1);
		r.setEstudiante(est);
		r.setMaterial(mat);
		r.setFecha(java.time.LocalDate.now().toString());
		r.setHora("00:00");
		r.setEstado("Pendiente");
		reservas.add(r);
		return r;
	}

	public Estudiante obtenerEstudiante(Object aIdRes) {
		if (aIdRes instanceof Integer) {
			int id = (Integer) aIdRes;
			for (Reserva r : reservas) if (r.getId() == id) return r.getEstudiante();
		}
		return null;
	}

	public Material obtenerMaterial(Object aIdRes) {
		if (aIdRes instanceof Integer) {
			int id = (Integer) aIdRes;
			for (Reserva r : reservas) if (r.getId() == id) return r.getMaterial();
		}
		return null;
	}

	public boolean verificarDisponibilidad_idMat_() {
		return !reservas.isEmpty();
	}

	public List<Reserva> listarReservas() {
		return reservas;
	}
}
