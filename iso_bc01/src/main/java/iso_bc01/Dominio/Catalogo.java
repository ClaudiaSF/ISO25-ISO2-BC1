package iso_bc01.Dominio;

import java.util.ArrayList;
import java.util.List;

public class Catalogo {
    private Material material;
    private List<Material> listaMateriales;

    public Catalogo() {
        this.listaMateriales = new ArrayList<>();
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public boolean anadir(Material nuevoMaterial) {
        if (nuevoMaterial == null) return false;
        return listaMateriales.add(nuevoMaterial);
    }

    public List<Material> listarCatalogo() {
        return listaMateriales;
    }
}
