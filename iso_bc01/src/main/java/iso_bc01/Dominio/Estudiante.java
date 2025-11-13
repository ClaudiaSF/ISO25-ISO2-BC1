package iso_bc01.Dominio;

public class Estudiante extends Usuario {

	public Estudiante(String username, String password, String _nombre, int _id, String _dni, String _apellidos,
			String _email, Reserva _unnamed_Reserva_, Prestamo _unnamed_Prestamo_, Devolucion _unnamed_Devolucion_) {
		super(username, password);
		this._nombre = _nombre;
		this._id = _id;
		this._dni = _dni;
		this._apellidos = _apellidos;
		this._email = _email;
		this._unnamed_Reserva_ = _unnamed_Reserva_;
		this._unnamed_Prestamo_ = _unnamed_Prestamo_;
		this._unnamed_Devolucion_ = _unnamed_Devolucion_;
	}
	private String _nombre;
	private int _id;
	private String _dni;
	private String _apellidos;
	private String _email;
	public Reserva _unnamed_Reserva_;
	public Prestamo _unnamed_Prestamo_;
	public Devolucion _unnamed_Devolucion_;
	public String get_nombre() {
		return _nombre;
	}
	public void set_nombre(String _nombre) {
		this._nombre = _nombre;
	}
	public int get_id() {
		return _id;
	}
	public void set_id(int _id) {
		this._id = _id;
	}
	public String get_dni() {
		return _dni;
	}
	public void set_dni(String _dni) {
		this._dni = _dni;
	}
	public String get_apellidos() {
		return _apellidos;
	}
	public void set_apellidos(String _apellidos) {
		this._apellidos = _apellidos;
	}
	public String get_email() {
		return _email;
	}
	public void set_email(String _email) {
		this._email = _email;
	}
	public Reserva get_unnamed_Reserva_() {
		return _unnamed_Reserva_;
	}
	public void set_unnamed_Reserva_(Reserva _unnamed_Reserva_) {
		this._unnamed_Reserva_ = _unnamed_Reserva_;
	}
	public Prestamo get_unnamed_Prestamo_() {
		return _unnamed_Prestamo_;
	}
	public void set_unnamed_Prestamo_(Prestamo _unnamed_Prestamo_) {
		this._unnamed_Prestamo_ = _unnamed_Prestamo_;
	}
	public Devolucion get_unnamed_Devolucion_() {
		return _unnamed_Devolucion_;
	}
	public void set_unnamed_Devolucion_(Devolucion _unnamed_Devolucion_) {
		this._unnamed_Devolucion_ = _unnamed_Devolucion_;
	}

	
}