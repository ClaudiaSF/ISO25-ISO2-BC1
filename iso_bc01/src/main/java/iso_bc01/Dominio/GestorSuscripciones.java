package iso_bc01.Dominio;

import java.util.*;

public class GestorSuscripciones {
    public boolean verificarSuscripcion() {
        return true;
    }

    public List<Suscripcion> obtenerSuscripciones() {
        Suscripcion suscripcion1 = new Suscripcion(
            1,
            "Título A",          // título
            "Autor A",           // autor
            "2024",              // año
            "https://enlaceA.com", // enlace
            "Proyecto A",        // proyecto
            "Activo"             // estado
        );

        Suscripcion suscripcion2 = new Suscripcion(
            2,
            "Título B",
            "Autor B",
            "2023",
            "https://enlaceB.com",
            "Proyecto B",
            "Inactivo"
        );

        return List.of(suscripcion1, suscripcion2);
    }
}
