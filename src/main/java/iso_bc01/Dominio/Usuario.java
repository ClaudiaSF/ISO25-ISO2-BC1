package iso_bc01.Dominio;

public class Usuario {
	private String username;
	private String password;
	public Usuario(String username, String password) {
		this.username = username;
		this.password = password;
		// TODO Auto-generated constructor stub
	}
	public String get_username() {
		return username;
	}
	public void set_username(String _username) {
		this.username = _username;
	}
	public String get_password() {
		return password;
	}
	public void set_password(String _password) {
		this.password = _password;
	}
}