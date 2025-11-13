package iso_bc01.Dominio;

public class Prestamo {
	private int _id;
	private String _fechaInicio;
	private String _fechaLimite;
	private boolean _devuelto;
	public Material _unnamed_Material_;
	public Estudiante _unnamed_Estudiante_;
	public Devolucion _unnamed_Devolucion_;
	public int get_id() {
		return _id;
	}
	public void set_id(int _id) {
		this._id = _id;
	}
	public String get_fechaInicio() {
		return _fechaInicio;
	}
	public void set_fechaInicio(String _fechaInicio) {
		this._fechaInicio = _fechaInicio;
	}
	public String get_fechaLimite() {
		return _fechaLimite;
	}
	public void set_fechaLimite(String _fechaLimite) {
		this._fechaLimite = _fechaLimite;
	}
	public boolean is_devuelto() {
		return _devuelto;
	}
	public void set_devuelto(boolean _devuelto) {
		this._devuelto = _devuelto;
	}
	public Material get_unnamed_Material_() {
		return _unnamed_Material_;
	}
	public void set_unnamed_Material_(Material _unnamed_Material_) {
		this._unnamed_Material_ = _unnamed_Material_;
	}
	public Estudiante get_unnamed_Estudiante_() {
		return _unnamed_Estudiante_;
	}
	public void set_unnamed_Estudiante_(Estudiante _unnamed_Estudiante_) {
		this._unnamed_Estudiante_ = _unnamed_Estudiante_;
	}
	public Devolucion get_unnamed_Devolucion_() {
		return _unnamed_Devolucion_;
	}
	public void set_unnamed_Devolucion_(Devolucion _unnamed_Devolucion_) {
		this._unnamed_Devolucion_ = _unnamed_Devolucion_;
	}
}