package iso_bc01.Presentacion;

import iso_bc01.Dominio.Material;
import iso_bc01.Dominio.Reserva;
import iso_bc01.Dominio.Estudiante;
import java.time.LocalDate;

public class IURservarMaterial {

	public Material mostrarFormulario(String titulo) {
		Material m = new Material(titulo, "Autor Desconocido", "ISBN", "Editorial", 1, true, 1, 100);
		System.out.println("Formulario generado para: " + titulo);
		return m;
	}

	public Reserva capturarDatos() {
		Reserva r = new Reserva();
		Estudiante e = new Estudiante("guest", "", "Invitado", 0, "", "", "", null, null, null);
		Material m = new Material("Titulo Generico", "Autor", "ISBN", "Editorial", 1, true, 1, 100);
		r.setMaterial(m);
		r.setEstudiante(e);
		r.setFecha(LocalDate.now().toString());
		r.setHora("00:00");
		r.setEstado("Pendiente");
		return r;
	}

	public String mostrarInformacion(String titulo) {
		return "Información de reserva para: " + titulo;
	}
}
