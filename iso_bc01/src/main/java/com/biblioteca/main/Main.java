package com.biblioteca.main;

import com.biblioteca.presentacion.IULogin;
import com.biblioteca.presentacion.IUBusquedaMaterial;
import com.biblioteca.dominio.Material;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Bienvenido al Sistema de Biblioteca ===");

        IULogin uiLogin = new IULogin();
        System.out.println("Probando login (modo demostración)...");

        IUBusquedaMaterial uiBusqueda = new IUBusquedaMaterial();
        Material material = uiBusqueda.introducirTitulo("Diseño de Software");

        if (material != null) {
            System.out.println("✅ Material encontrado: " + material.getTitulo());
        } else {
            System.out.println("❌ Material no encontrado.");
        }
    }
}

