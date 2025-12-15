package iso_bc01.Presentacion;

import java.lang.reflect.Parameter;
import iso_bc01.Dominio.Usuario;

public class IULogin {

	public Usuario registrarseEstudiante(String username, Parameter password) {
		String pwd = (password == null) ? "" : password.toString();
		return new Usuario(username, pwd);
	}

	public Usuario registrarseInvestigador(String username, Parameter password) {
		String pwd = (password == null) ? "" : password.toString();
		return new Usuario(username, pwd);
	}
}
