package iso_bc01.Presentacion;

import iso_bc01.Dominio.*;

public class IULogin {

    public Usuario registrarseEstudiante(String username, String password) {
        GestorLogin gl = new GestorLogin();
        return gl.verificarCredenciales(username, password);
    }

    public Usuario registrarseInvestigador(String username, String password) {
        GestorLogin gl = new GestorLogin();
        return gl.verificarCredenciales(username, password);
    }
}
