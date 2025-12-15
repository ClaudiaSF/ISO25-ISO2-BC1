package iso_bc01.Dominio;

public class Usuario {
	private String _username;
	private String _password;
	
	public Usuario(String username, String password) {
		this._username = username;
		this._password = password;
	}
	public String get_username() {
		return _username;
	}
	public void set_username(String _username) {
		this._username = _username;
	}
	public String get_password() {
		return _password;
	}
	public void set_password(String _password) {
		this._password = _password;
	}
}
