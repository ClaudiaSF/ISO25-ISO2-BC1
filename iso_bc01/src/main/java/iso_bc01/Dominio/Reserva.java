package iso_bc01.Dominio;

public class Reserva {
	private int id;
	private Estudiante estudiante;
	private Material material;
	private String fecha;
	private String estado;
	private String hora;
	public Estudiante unnamed_Estudiante_;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Estudiante getEstudiante() {
		return estudiante;
	}
	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}
	public Material getMaterial() {
		return material;
	}
	public void setMaterial(Material material) {
		this.material = material;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public Estudiante getUnnamed_Estudiante_() {
		return unnamed_Estudiante_;
	}
	public void setUnnamed_Estudiante_(Estudiante unnamed_Estudiante_) {
		this.unnamed_Estudiante_ = unnamed_Estudiante_;
	}

	

}