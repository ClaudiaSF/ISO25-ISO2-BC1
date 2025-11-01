package Dominio;

public class Estudiante {
	private String nombre;
	private int id;
	private String email;
	private String dni;
	private String apellidos;
	public Reserva unnamed_Reserva_;

	public int getId() {
		return this.id;
	}

	public String getNombre() {
		return this.nombre;
	}

	public String getNombreyApellidos() {
		throw new UnsupportedOperationException();
	}

	public boolean validar() {
		throw new UnsupportedOperationException();
	}

	public void setId(int aId) {
		this.id = aId;
	}

	public void setNombre(String aNombre) {
		this.nombre = aNombre;
	}

	public void setApellidos(String aApellidos) {
		this.apellidos = aApellidos;
	}

	public void setDni(String aDni) {
		this.dni = aDni;
	}

	public void setEmail(String aEmail) {
		this.email = aEmail;
	}
}