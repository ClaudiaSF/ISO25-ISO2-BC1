package com.biblioteca.dominio;

public class GestorBusqueda {

    public Material comprobarTitulo(Catalogo catalogo, String titulo) {
        for (Material m : catalogo.getMateriales()) {
            if (m.getTitulo().equalsIgnoreCase(titulo)) {
                return m;
            }
        }
        return null;
    }
}

