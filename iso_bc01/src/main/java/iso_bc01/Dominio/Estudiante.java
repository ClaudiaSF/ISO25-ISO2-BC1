package iso_bc01.Dominio;

public class Estudiante extends Usuario {

	private String nombre;
	private int id;
	private String dni;
	private String apellidos;
	private String email;
	public Reserva unnamed_Reserva_;
	public Prestamo unnamed_Prestamo_;
	public Devolucion unnamed_Devolucion_;
	
	public Estudiante(String username, String password, String nombre, int id, String dni, String apellidos,
			String email, Reserva unnamed_Reserva_, Prestamo unnamed_Prestamo_, Devolucion unnamed_Devolucion_) {
		super(username, password);
		this.nombre = nombre;
		this.id = id;
		this.dni = dni;
		this.apellidos = apellidos;
		this.email = email;
		this.unnamed_Reserva_ = unnamed_Reserva_;
		this.unnamed_Prestamo_ = unnamed_Prestamo_;
		this.unnamed_Devolucion_ = unnamed_Devolucion_;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Reserva getUnnamed_Reserva_() {
		return unnamed_Reserva_;
	}
	public void setUnnamed_Reserva_(Reserva unnamed_Reserva_) {
		this.unnamed_Reserva_ = unnamed_Reserva_;
	}
	public Prestamo getUnnamed_Prestamo_() {
		return unnamed_Prestamo_;
	}
	public void setUnnamed_Prestamo_(Prestamo unnamed_Prestamo_) {
		this.unnamed_Prestamo_ = unnamed_Prestamo_;
	}
	public Devolucion getUnnamed_Devolucion_() {
		return unnamed_Devolucion_;
	}
	public void setUnnamed_Devolucion_(Devolucion unnamed_Devolucion_) {
		this.unnamed_Devolucion_ = unnamed_Devolucion_;
	}
}