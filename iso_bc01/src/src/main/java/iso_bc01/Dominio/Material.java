package iso_bc01.Dominio;

public class Material {
	private int id;
	private String titulo;
	private boolean disponible;
	private int cantidadDisponible;
	public Reserva unnamedReserva;

	public String getTitulo() {
		return this.titulo;
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

	public void setCantidadDisp(int aCantidad) {
		throw new UnsupportedOperationException();
	}

	public int getCantidadDisp() {
		throw new UnsupportedOperationException();
	}

}
