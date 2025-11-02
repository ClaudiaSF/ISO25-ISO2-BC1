package com.biblioteca.presentacion;

import com.biblioteca.dominio.*;

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

