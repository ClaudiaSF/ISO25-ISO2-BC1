package iso_bc01.Dominio;

public class Material extends Catalogo {
	private String titulo;
	private String autor;
	private String iSBN;
	private String editorial;
	private int edicion;
	private boolean disponible;
	private int cantidadDisponible;
	private int id;
	
	public Prestamo unnamed_Prestamo_;

	public Material(String titulo, String autor, String iSBN, String editorial, int edicion, boolean disponible,
			int cantidadDisponible, int id) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.iSBN = iSBN;
		this.editorial = editorial;
		this.edicion = edicion;
		this.disponible = disponible;
		this.cantidadDisponible = cantidadDisponible;
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getiSBN() {
		return iSBN;
	}

	public void setiSBN(String iSBN) {
		this.iSBN = iSBN;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public int getEdicion() {
		return edicion;
	}

	public void setEdicion(int edicion) {
		this.edicion = edicion;
	}

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	public int getCantidadDisponible() {
		return cantidadDisponible;
	}

	public void setCantidadDisponible(int cantidadDisponible) {
		this.cantidadDisponible = cantidadDisponible;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Prestamo getUnnamed_Prestamo_() {
		return unnamed_Prestamo_;
	}

	public void setUnnamed_Prestamo_(Prestamo unnamed_Prestamo_) {
		this.unnamed_Prestamo_ = unnamed_Prestamo_;
	}
}