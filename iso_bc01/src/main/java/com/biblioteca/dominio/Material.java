package com.biblioteca.dominio;

public class Material {
    private String titulo;
    private String autor;
    private String ISBN;
    private String editorial;
    private int edicion;

    public Material(String titulo, String autor, String ISBN, String editorial, int edicion) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.editorial = editorial;
        this.edicion = edicion;
    }

    public String getTitulo() { return titulo; }
}
