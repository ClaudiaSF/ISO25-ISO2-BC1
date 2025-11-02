package iso_bc01.Dominio;

public class Material {
	private int id;
	private String titulo;
	private String autor;
	private String ISBN;
	private String editorial;
	private String edicion;
	private boolean disponible;
	private int cantidadDisponible;
	public Reserva unnamedReserva;

	public String getTitulo() {
		return this.titulo;
	}

	public String getAutor() {
		return this.autor;
	}

	public String getISBN() {
		return this.ISBN;
	}

	public String getEditorial() {
		return this.editorial;
	}

	public String getEdicon() {
		return this.edicion;
	}

	public int getCantidadDisp() {
		throw new UnsupportedOperationException();
	}
	
	public int getId() {
		return this.id;
	}

	public boolean isDisponible() {
		return this.disponible;
	}

	public void setId(int aId) {
		throw new UnsupportedOperationException();
	}

	public void setTitulo(String aTitulo) {
		this.titulo = aTitulo;
	}

	public void setAutor(String aAutor) {
		this.Autor = aAutor;
	}

	public void setEditorial(String aEditorial) {
		this.Editorial = aEditorial;
	}

	public void setISBN(String aISBN) {
		this.ISBN = aISBN;
	}

	public void setEdicion(String aEdicion) {
		this.Edicion = aEdicion;
	}

	public void setCantidadDisp(int aCantidad) {
		throw new UnsupportedOperationException();
	}

	public void setDisponible(String aDisponible) {
		this.disponible = aDisponible;
	}
}
