package iso_bc01.Dominio;

import java.util.Date;

public class EstadisticaGlobal {

	private int id;
	private int numeroRecursos;
	private String nombre;
	private Date fecha; 

	/**
	 * Constructor completo
	 * @param id Identificador de la estadística
	 * @param numeroRecursos Valor numérico calculado (total de préstamos, usuarios, etc.)
	 * @param nombre Descripción de la estadística
	 * @param fecha Fecha y hora en la que se generó el cálculo
	 */
	public EstadisticaGlobal(int id, int numeroRecursos, String nombre, Date fecha) {
		this.id = id;
		this.numeroRecursos = numeroRecursos;
		this.nombre = nombre;
		this.fecha = fecha;
	}

	/**
	 * Constructor de comodidad compatible con usos simples en la IU y gestores.
	 * Establece la fecha a la fecha/hora actual.
	 */
	public EstadisticaGlobal(int id, int numeroRecursos, String nombre) {
		this(id, numeroRecursos, nombre, new Date());
	}

	// --- Getters ---

	public int getId() {
		return this.id;
	}

	public int getNumeroRecursos() {
		return this.numeroRecursos;
	}

	public String getNombre() {
		return this.nombre;
	}

	public Date getFecha() {
		return this.fecha;
	}

	// --- Setters ---

	public void setId(int id) {
		this.id = id;
	}

	public void setNumeroRecursos(int numeroRecursos) {
		this.numeroRecursos = numeroRecursos;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}


	@Override
	public String toString() {
		return "Estadística [ID=" + id + 
			   ", Nombre=" + nombre + 
			   ", Cantidad=" + numeroRecursos + 
			   ", Fecha=" + fecha + "]";
	}
}