package iso_bc01.Dominio;

public class Prestamo {
	private int id;
	private String fechaInicio;
	private String fechaLimite;
	private boolean devuelto;
	public Material unnamed_Material_;
	public Estudiante unnamed_Estudiante_;
	public Devolucion unnamed_Devolucion_;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(String fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public String getFechaLimite() {
		return fechaLimite;
	}
	public void setFechaLimite(String fechaLimite) {
		this.fechaLimite = fechaLimite;
	}
	public boolean isDevuelto() {
		return devuelto;
	}
	public void setDevuelto(boolean devuelto) {
		this.devuelto = devuelto;
	}
	public Material getUnnamed_Material_() {
		return unnamed_Material_;
	}
	public void setUnnamed_Material_(Material unnamed_Material_) {
		this.unnamed_Material_ = unnamed_Material_;
	}
	public Estudiante getUnnamed_Estudiante_() {
		return unnamed_Estudiante_;
	}
	public void setUnnamed_Estudiante_(Estudiante unnamed_Estudiante_) {
		this.unnamed_Estudiante_ = unnamed_Estudiante_;
	}
	public Devolucion getUnnamed_Devolucion_() {
		return unnamed_Devolucion_;
	}
	public void setUnnamed_Devolucion_(Devolucion unnamed_Devolucion_) {
		this.unnamed_Devolucion_ = unnamed_Devolucion_;
	}

}