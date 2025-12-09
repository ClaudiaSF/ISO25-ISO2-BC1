package iso_bc01.Dominio;

public class InformeOperativo {
	private int id;
	private String fechaGeneracion;
	private String periodo;
	private String contenido;
	
	
	public InformeOperativo(int id, String fechaGeneracion, String periodo, String contenido) {
		super();
		this.id = id;
		this.fechaGeneracion = fechaGeneracion;
		this.periodo = periodo;
		this.contenido = contenido;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFechaGeneracion() {
		return fechaGeneracion;
	}
	public void setFechaGeneracion(String fechaGeneracion) {
		this.fechaGeneracion = fechaGeneracion;
	}
	public String getPeriodo() {
		return periodo;
	}
	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}
	public String getContenido() {
		return contenido;
	}
	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	@Override
	public String toString() {
		return  "Fecha Generacion: " + fechaGeneracion + ", periodo: " + periodo
				+ ", contenido: " + contenido + ", ID: " + getId();
	}


}