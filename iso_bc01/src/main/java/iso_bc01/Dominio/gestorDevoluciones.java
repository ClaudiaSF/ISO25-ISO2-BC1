package iso_bc01.Dominio;

public class gestorDevoluciones {

	public Devolucion crearDevolucion(Prestamo aPrestamo) {
		if (aPrestamo == null) return null;
		Devolucion d = new Devolucion();
		d.setId(aPrestamo.getId());
		d.setFecha(java.time.LocalDate.now().toString());
		d.setObservaciones("Devolución generada automáticamente");
		d.setUnnamed_Estudiante_(aPrestamo.getUnnamed_Estudiante_());
		d.setUnnamed_Prestamo_(aPrestamo);
		// marcar préstamo como devuelto
		aPrestamo.setDevuelto(true);
		aPrestamo.setUnnamed_Devolucion_(d);
		return d;
	}

	public Estudiante obtenerEstudiante(Prestamo aPrestamo) {
		if (aPrestamo == null) return null;
		return aPrestamo.getUnnamed_Estudiante_();
	}

	public Material obtenerMaterial(Prestamo aPrestamo) {
		if (aPrestamo == null) return null;
		return aPrestamo.getUnnamed_Material_();
	}

	public boolean verificarPrestamo(Prestamo aPrestamo) {
		return aPrestamo != null && !aPrestamo.isDevuelto();
	}
}
