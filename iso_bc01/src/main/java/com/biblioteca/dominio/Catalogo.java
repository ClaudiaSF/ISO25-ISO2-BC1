package com.biblioteca.dominio;

import java.util.ArrayList;
import java.util.List;

public class Catalogo {
    private List<Material> materiales;

    public Catalogo() {
        materiales = new ArrayList<>();
    }

    public void addMaterial(Material m) {
        materiales.add(m);
    }

    public List<Material> getMateriales() {
        return materiales;
    }
    public void setMateriales(List<Material> materiales) {
        this.materiales = materiales;
    }
}

