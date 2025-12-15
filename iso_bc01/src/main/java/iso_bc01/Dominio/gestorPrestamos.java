package iso_bc01.Dominio;

public class gestorPrestamos {
	public Prestamo crearPrestamo(Estudiante aEstudiante, Material aMaterial) {
		if (aEstudiante == null || aMaterial == null) return null;
		Prestamo p = new Prestamo();
		p.setId( (int)(Math.random() * 1000) + 1 );
		p.setUnnamed_Estudiante_(aEstudiante);
		p.setUnnamed_Material_(aMaterial);
		p.setFechaInicio(java.time.LocalDate.now().toString());
		p.setFechaLimite(java.time.LocalDate.now().plusDays(7).toString());
		p.setDevuelto(false);
		// reducir stock disponible si procede
		try {
			int cant = aMaterial.get_cantidadDisponible();
			if (cant > 0) aMaterial.set_cantidadDisponible(cant - 1);
		} catch (Exception e) {
			// ignore if material doesn't expose cantidad
		}
		return p;
	}

	public Estudiante obtenerEstudiante(Prestamo aPrestamo) {
		if (aPrestamo == null) return null;
		return aPrestamo.getUnnamed_Estudiante_();
	}

	public Material obtenerMaterial(Prestamo aPrestamo) {
		if (aPrestamo == null) return null;
		return aPrestamo.getUnnamed_Material_();
	}

	public boolean verificarDisponibilidad(Material aMaterial) {
		if (aMaterial == null) return false;
		return aMaterial.get_cantidadDisponible() > 0;
	}
}
