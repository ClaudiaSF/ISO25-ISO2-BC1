package iso_bc01.Dominio;

public class Reserva {
	private int id;
	private Estudiante estudiante;
	private Material material;
	private String fecha;
	private String hora;
	private String estado;
	public Estudiante unnamedEstudiante;
	public Material unnamedMaterial;

	public int getId() {
		return this.id;
	}

	public void cancelar() {
		throw new UnsupportedOperationException();
	}

	public void confirmar() {
		throw new UnsupportedOperationException();
	}

	public String getEstado() {
		return this.estado;
	}

	public Estudiante getEstudiante() {
		return this.estudiante;
	}

	public Material getMaterial() {
		throw new UnsupportedOperationException();
	}

	public String getFecha() {
		return this.fecha;
	}

	public String getHora() {
		return this.hora;
	}

	public void setId(String aId) {
		throw new UnsupportedOperationException();
	}
	
	public void setFecha(String aFecha) {
		this.fecha = aFecha;
	}

	public void setHora(String aHora) {
		this.hora = aHora;
	}

	public void setEstudiante(Estudiante aEstudiante) {
		this.estudiante = aEstudiante;
	}

	public void setMaterial(Material aMaterial) {
		this.material = aMaterial;
	}

	public void setEstado(String aEstado) {
		this.estado = aEstado;
	}

	public void setFecha(String aFecha) {
		this.fecha = aFecha;
	}

}

