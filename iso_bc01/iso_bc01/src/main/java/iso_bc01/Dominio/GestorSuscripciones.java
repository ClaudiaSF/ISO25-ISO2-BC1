package iso_bc01.Dominio;

import java.util.List;

public class GestorSuscripciones {
    public boolean verificarSuscripcion() {
        return true;
    }

    public List<Suscripcion> obtenerSuscripciones() {
        Suscripcion suscripcion1 = new Suscripcion(1, "Proyecto A", "Activo");
        Suscripcion suscripcion2 = new Suscripcion(2, "Proyecto B", "Inactivo");
        return List.of(suscripcion1, suscripcion2);
    }
}
