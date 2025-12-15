package iso_bc01.Dominio;

public class Material extends Catalogo {
	private String titulo;
	private String _autor;
	private String _iSBN;
	private String _editorial;
	private int _edicion;
	private boolean _disponible;
	private int _cantidadDisponible;
	private int _id;
	public Prestamo _unnamed_Prestamo_;
	
	public Material(String titulo, String _autor, String _iSBN, String _editorial, int _edicion, boolean _disponible,
			int _cantidadDisponible, int _id) {
		super();
		this.titulo = titulo;
		this._autor = _autor;
		this._iSBN = _iSBN;
		this._editorial = _editorial;
		this._edicion = _edicion;
		this._disponible = _disponible;
		this._cantidadDisponible = _cantidadDisponible;
		this._id = _id;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void set_titulo(String _titulo) {
		this.titulo = _titulo;
	}
	
	public String get_autor() {
		return _autor;
	}
	
	public void set_autor(String _autor) {
		this._autor = _autor;
	}
	
	public String get_iSBN() {
		return _iSBN;
	}
	
	public void set_iSBN(String _iSBN) {
		this._iSBN = _iSBN;
	}
	
	public String get_editorial() {
		return _editorial;
	}
	
	public void set_editorial(String _editorial) {
		this._editorial = _editorial;
	}
	
	public int get_edicion() {
		return _edicion;
	}
	
	public void set_edicion(int _edicion) {
		this._edicion = _edicion;
	}
	
	public boolean is_disponible() {
		return _disponible;
	}
	
	public void set_disponible(boolean _disponible) {
		this._disponible = _disponible;
	}
	
	public int get_cantidadDisponible() {
		return _cantidadDisponible;
	}
	
	public void set_cantidadDisponible(int _cantidadDisponible) {
		this._cantidadDisponible = _cantidadDisponible;
	}
	
	public int get_id() {
		return _id;
	}
	
	public void set_id(int _id) {
		this._id = _id;
	}
	
	public Prestamo get_unnamed_Prestamo_() {
		return _unnamed_Prestamo_;
	}
	
	public void set_unnamed_Prestamo_(Prestamo _unnamed_Prestamo_) {
		this._unnamed_Prestamo_ = _unnamed_Prestamo_;
	}
}
