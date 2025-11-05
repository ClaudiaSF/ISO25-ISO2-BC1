package com.biblioteca.presentacion;

import com.biblioteca.dominio.*;

public class IUBusquedaMaterial {

    public Material introducirTitulo(String titulo) {
        Catalogo catalogo = new Catalogo();
        catalogo.addMaterial(new Material("Diseño de Software", "Gamma", "123", "Pearson", 3));
        catalogo.addMaterial(new Material("Bases de Datos", "Date", "456", "McGrawHill", 2));

        GestorBusqueda gb = new GestorBusqueda();
        return gb.comprobarTitulo(catalogo, titulo);
    }
}

