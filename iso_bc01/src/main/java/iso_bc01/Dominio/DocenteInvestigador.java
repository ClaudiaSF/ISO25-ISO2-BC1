package iso_bc01.Dominio;

import java.util.*;

public class DocenteInvestigador {
    private int id;
    private String nombre;
    private String email;

    public DocenteInvestigador(int id, String nombre, String email) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<BibliografiaRecomendada> verBibliografiaRecomendada() {
        GestorBibliografiaRecomendada gestorBibliografiaRecomendada = new GestorBibliografiaRecomendada();
        return gestorBibliografiaRecomendada.obtenerBibliografiaRecomendada();
    }

    public List<Suscripcion> verSuscripcionesProyectos() {
        GestorSuscripciones gestorSuscripciones = new GestorSuscripciones();
        return gestorSuscripciones.obtenerSuscripciones();
    }

    public List<Bibliografia> verBibliografia() {
        GestorBibliografia gestorBibliografia = new GestorBibliografia();
        return gestorBibliografia.obtenerBibliografia();
    }
}
